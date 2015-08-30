package controllers;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;

import models.*;
import org.omg.PortableServer.POAPackage.AdapterAlreadyExistsHelper;
import play.libs.Json;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

/**
 * Created by USER on 18/08/2015.
 */
public class VehiculoController extends Controller {

    @BodyParser.Of(BodyParser.Json.class)
    public Result create(){
        JsonNode j = Controller.request().body().asJson();
        Vehiculo vehiculoN = Vehiculo.bind(j);
        vehiculoN.save();
        return ok(Json.toJson(vehiculoN));
    }

    public Result readAll() {
        List<Vehiculo> vehiculos = Vehiculo.darVehiculos();
        return ok(Json.toJson(vehiculos));
    }

    public Result readVehiculoID(String id) {
        Vehiculo vehiculoEncontrado = (Vehiculo) Vehiculo.finder.byId(id);
        if(vehiculoEncontrado != null) {
            return ok(Json.toJson(vehiculoEncontrado));
        }
        return notFound();
    }

    @BodyParser.Of(BodyParser.Json.class)
    public static Result agregarDatosVehiculo(Long id_vehiculo, int tipo_vehiculo)
    {
        String mensaje;
        JsonNode j = Controller.request().body().asJson();
        Vehiculo vehiculoEncontrado = tipo_vehiculo==Vehiculo.TRANVIA?
                (Vehiculo)TranviaVehiculo.finder.byId(id_vehiculo):
                (Vehiculo)MoviBusVehiculo.finder.byId(id_vehiculo);

            if(vehiculoEncontrado!=null)
            {
                Datos datosRecibidos = Datos.bind(j);
                datosRecibidos.setId_vehiculo(vehiculoEncontrado.getId_vehiculo());
                datosRecibidos.save();
                vehiculoEncontrado.setUltimosDatos(datosRecibidos);
                vehiculoEncontrado.save();
                if(vehiculoEncontrado.getEstado()!=Vehiculo.ACCIDENTE  && ( datosRecibidos.isSensorChoque() || datosRecibidos.isBotonPanico() || datosRecibidos.getSensorTermico()>38))
                {
                    //Crear  emergencia
                    vehiculoEncontrado.setEstado(Vehiculo.ACCIDENTE);
                    mensaje="ATENCIÓN, EMERGENCIA DETECTADA\n" ;
                }
                else
                {
                    //Se est� atendiendo el accidente
                    mensaje="Se está atendiendo un accidente, recuerde registrar en el sistema cuando la situación regrese a la normalidad";
                }
                return ok(mensaje + "\n Datos agregados:\n" + Json.toJson(datosRecibidos));
            }
            else
            {
                return notFound("No se ha encontrado el vehiculo con id:"+id_vehiculo);
            }


    }

    @BodyParser.Of(BodyParser.Json.class)
    public static Result agregarTrayectoVehiculo(Long idConductor, Long id_vehiculo, int tipo_vehiculo) {

        JsonNode json = Controller.request().body().asJson();

        Vehiculo vehiculoEncontrado = tipo_vehiculo==Vehiculo.TRANVIA?
                (Vehiculo)TranviaVehiculo.finder.byId(id_vehiculo):
                (Vehiculo)MoviBusVehiculo.finder.byId(id_vehiculo);
        Driver conductorEncontrado = (Driver) new Model.Finder(Driver.class).byId(idConductor);
        Trayecto trayectoRecibido = Trayecto.bind(json);
        if (vehiculoEncontrado != null && conductorEncontrado != null) {
            trayectoRecibido.setId_vehiculo(vehiculoEncontrado.getId_vehiculo());
            trayectoRecibido.setId_conductor(conductorEncontrado.getId_conductor());
            conductorEncontrado.setUltimoTrayecto(trayectoRecibido);
            vehiculoEncontrado.setUltimoTrayecto(trayectoRecibido);
            vehiculoEncontrado.setEstado(Vehiculo.EN_MARCHA);
            trayectoRecibido.save();
            vehiculoEncontrado.save();
            conductorEncontrado.save();
            return ok("\n Trayecto Iniciado:\n" + Json.toJson(trayectoRecibido) + "\n Conductor:\n" + Json.toJson(conductorEncontrado) + "\n" +
                    " Vehiculo:\n" + Json.toJson(vehiculoEncontrado));
        } else {
            return notFound("No se ha encontrado alguno de los elementos requeridos, revise nuevamente los datos de la solicitud");
        }
    }

    @BodyParser.Of(BodyParser.Json.class)
    public static Result finalizarUltimoTrayecto(Long id_vehiculo, int tipo_vehiculo)
    {
        Vehiculo vehiculoEncontrado = tipo_vehiculo==Vehiculo.TRANVIA?
                (Vehiculo)TranviaVehiculo.finder.byId(id_vehiculo):
                (Vehiculo)MoviBusVehiculo.finder.byId(id_vehiculo);
        Trayecto trayecoEncontrado = vehiculoEncontrado.getUltimoTrayecto();
        JsonNode json = Controller.request().body().asJson();
        Trayecto trayectoRecibido = Trayecto.bind(json);
        if (trayectoRecibido != null)
        {
            TrayectoController.finalizarTrayecto(trayecoEncontrado.getId_trayecto(), trayectoRecibido.getHora_fin(), trayectoRecibido.getIncidentes());
        }
        trayecoEncontrado.save();
        return ok("Se registró la finalizacion del trayecto:\n"+Json.toJson(trayecoEncontrado));
    }


    public static Result readTrayectosVehiculo (Long id_vehiculo, int tipo_vehiculo)
    {
        Vehiculo vehiculoEncontrado = tipo_vehiculo==Vehiculo.TRANVIA?
                (Vehiculo)TranviaVehiculo.finder.byId(id_vehiculo):
                (Vehiculo)MoviBusVehiculo.finder.byId(id_vehiculo);
        if(vehiculoEncontrado!=null)
        {
            return ok(Json.toJson(TrayectoController.getTrayectosVehiculo(id_vehiculo)));
        }
        else
        {
            return notFound("No se ha encontrado el vehiculo solicitado");
        }
    }

    @BodyParser.Of(BodyParser.Json.class)
    public static Result agregarRevision(Long id_vehiculo, int tipo_vehiculo)
    {
        Result rta;
        Vehiculo vehiculoEncontrado = tipo_vehiculo==Vehiculo.TRANVIA?
                (Vehiculo)TranviaVehiculo.finder.byId(id_vehiculo):
                tipo_vehiculo==Vehiculo.MOVIBUS?
                        (Vehiculo)MoviBusVehiculo.finder.byId(id_vehiculo):
                        (Vehiculo)Vcub.finder.byId(id_vehiculo);
        if(vehiculoEncontrado!=null)
        {
            JsonNode json = Controller.request().body().asJson();
            RevisionMecanica revision = RevisionMecanica.bind(json);
            if(revision!=null)
            {
                revision.setId_vehiculo(id_vehiculo);
                vehiculoEncontrado.setUltimaRevision(revision);
                vehiculoEncontrado.save();
                revision.save();
                rta =ok("Revision Agregada:\n"+Json.toJson(revision)+"\n Vehiculo:\n"+Json.toJson(vehiculoEncontrado));
            }
            else
            {
                rta=badRequest("La revisión no pudo ser convertida a un objeto RevisionMecanica.class");
            }
        }
        else
        {
            rta=notFound("No se ha encontrado el vehiculo con id:"+id_vehiculo);
        }
        return rta;
    }


    public static Result readRevisionesVehiculo(Long id_vehiculo, int tipo_vehiculo)
    {
        Result rta;

        Vehiculo vehiculoEncontrado = tipo_vehiculo==Vehiculo.TRANVIA?
                (Vehiculo)TranviaVehiculo.finder.byId(id_vehiculo):
                tipo_vehiculo==Vehiculo.MOVIBUS?
                        (Vehiculo)MoviBusVehiculo.finder.byId(id_vehiculo):
                        (Vehiculo)Vcub.finder.byId(id_vehiculo);
        if(vehiculoEncontrado!=null)
        {
            rta=ok(Json.toJson(Trayecto.finder.where().eq("id_vehiculo",id_vehiculo)));
        }
        else
        {
            rta=notFound("No se ha encontrado el vehiculo con id:"+id_vehiculo);
        }
        return rta;
    }

}
