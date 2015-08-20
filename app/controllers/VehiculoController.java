package controllers;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;
import models.*;
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
        List<Vehiculo> vehiculos = new Model.Finder(Vehiculo.class).all();
        return ok(Json.toJson(vehiculos));
    }

    public Result readVehiculoID(String id) {
        Vehiculo vehiculoEncontrado = (Vehiculo) new Model.Finder(Vehiculo.class).byId(id);
        if(vehiculoEncontrado != null) {
            return ok(Json.toJson(vehiculoEncontrado));
        }
        return notFound();
    }

    @BodyParser.Of(BodyParser.Json.class)
    public Result agregarDatosVehiculo(String idVehiculo)
    {
        String mensaje;
        JsonNode j = Controller.request().body().asJson();
        Vehiculo vehiculoEncontrado = (Vehiculo) new Model.Finder(Vehiculo.class).byId(idVehiculo);
        if(vehiculoEncontrado!=null)
        {
            Datos datosRecibidos = Datos.bind(j);
            datosRecibidos.setVehiculoGenerador(vehiculoEncontrado);
            datosRecibidos.save();
            if(vehiculoEncontrado.getEstado()!=Vehiculo.ACCIDENTE  && ( datosRecibidos.isSensorChoque() || datosRecibidos.isBotonPanico() || datosRecibidos.getSensorTermico()>38))
            {
                //Crear  emergencia
                vehiculoEncontrado.setEstado(Vehiculo.ACCIDENTE);
                mensaje="ATENCIÓN, EMERGENCIA DETECTADA\n" ;
            }
            else
            {
                //Se est� atendiendo el accidente
                mensaje="Se est� atendiendo un accidente, recuerde registrar en el sistema cuando la situación regrese a la normalidad";
            }
            vehiculoEncontrado.agregarDatos(datosRecibidos);
            vehiculoEncontrado.save();

            return ok(mensaje + "\n Datos agregados:\n" + Controller.request().body().asJson());
        }
        else
        {
            return notFound("No se ha encontrado el vehiculo con id:"+idVehiculo);
        }

    }

    public Result readDatosVehiculo(String idVehiculo)
    {
        Result rta;
        Vehiculo vehiculoEncontrado = (Vehiculo) Vehiculo.finder.byId(idVehiculo);
        if(vehiculoEncontrado!=null)
        {
            rta=ok(Json.toJson(vehiculoEncontrado.getDatos()));
        }
        else
        {
            rta=notFound("No se ha encontrado veh�culo con el id:"+idVehiculo);
        }
        return rta;
    }

    @BodyParser.Of(BodyParser.Json.class)
    public Result agregarTrayectoVehiculo(String idConductor, String idVehiculo) {
        try {
            JsonNode json = Controller.request().body().asJson();
            Vehiculo vehiculoEncontrado = (Vehiculo) new Model.Finder(Vehiculo.class).byId(idVehiculo);
            Driver conductorEncontrado = (Driver) new Model.Finder(Driver.class).byId(idConductor);
            Trayecto trayectoRecibido = Trayecto.bind(json);
            trayectoRecibido.setVehiculo(vehiculoEncontrado);
            trayectoRecibido.setConductor(conductorEncontrado);
            conductorEncontrado.agregarTrayecto(trayectoRecibido);
            vehiculoEncontrado.agregarTrayecto(trayectoRecibido);
            vehiculoEncontrado.setEstado(Vehiculo.EN_MARCHA);
            trayectoRecibido.save();
            vehiculoEncontrado.save();
            conductorEncontrado.save();
            return ok("\n Trayecto Iniciado:\n" + Controller.request().body().asJson() + "\n Conductor:\n" + Json.toJson(conductorEncontrado) + "\n" +
                    " Vehiculo:\n" + Json.toJson(vehiculoEncontrado));
        } catch (NullPointerException excepcion) {
            return notFound("No se ha encontrado alguno de los elementos requeridos, revise nuevamente los datos de la solicitud");
        }

    }

    @BodyParser.Of(BodyParser.Json.class)
    public Result finalizarUltimoTrayecto(String idVehiculo, int inconvenientes)
    {
        Vehiculo vehiculoEncontrado = (Vehiculo) Vehiculo.finder.byId(idVehiculo);
        Trayecto trayecoEncontrado = vehiculoEncontrado.getUltimoTrayecto();
        if(Controller.request().body()!=null)
        {
            JsonNode json = Controller.request().body().asJson();
            Trayecto trayectoRecibido= Trayecto.bind(json);
            if(trayectoRecibido!=null)
            {
                trayecoEncontrado.finalizarTrayecto(trayectoRecibido.getHora_fin(),trayectoRecibido.getIncidentes());
            }
        }
        else
        {
            trayecoEncontrado.finalizarTrayecto(null,inconvenientes);
            Vehiculo veh = trayecoEncontrado.getVehiculo();
            veh.setEstado(Vehiculo.DISPONIBLE);
            veh.save();
        }
        trayecoEncontrado.save();
        return ok("Se registr� la finalizacion del trayecto:\n"+Json.toJson(trayecoEncontrado));
    }

    @BodyParser.Of(BodyParser.Json.class)
    public Result finalizarTrayecto(String idTrayecto, int inconvenientes)
    {
        Trayecto trayecoEncontrado = (Trayecto) new Model.Finder(Trayecto.class).byId(idTrayecto);
        if(Controller.request().body()!=null)
        {
            JsonNode json = Controller.request().body().asJson();
            Trayecto trayectoRecibido= Trayecto.bind(json);
            if(trayectoRecibido!=null)
            {
                trayecoEncontrado.finalizarTrayecto(trayectoRecibido.getHora_fin(),trayectoRecibido.getIncidentes());
            }
        }
        else
        {
            trayecoEncontrado.finalizarTrayecto(null,inconvenientes);
            Vehiculo veh = trayecoEncontrado.getVehiculo();
            veh.setEstado(Vehiculo.DISPONIBLE);
            veh.save();
        }
        trayecoEncontrado.save();
        return ok("Se registr� la finalizacion del trayecto:\n"+ Json.toJson(trayecoEncontrado));
    }


    public Result readTrayectosVehiculo (String idVehiculo)
    {
        Vehiculo vehiculoEncontrado = (Vehiculo) Vehiculo.finder.byId(idVehiculo);
        if(vehiculoEncontrado!=null)
        {
            return ok(Json.toJson(vehiculoEncontrado.getTrayectos()));
        }
        else
        {
            return notFound("No se ha encontrado el vehiculo solicitado");
        }
    }

    @BodyParser.Of(BodyParser.Json.class)
    public Result agregarRevision(String idVehiculo)
    {
        Result rta;
        Vehiculo vehiculoEncontrado = (Vehiculo) Vehiculo.finder.byId(idVehiculo);
        if(vehiculoEncontrado!=null)
        {
            JsonNode json = Controller.request().body().asJson();
            RevisionMecanica revision = RevisionMecanica.bind(json);
            if(revision!=null)
            {
                vehiculoEncontrado.agregarNuevaRevision(revision);
                rta =ok("Revision Agregada:\n"+Json.toJson(revision)+"\n Vehiculo:\n"+Json.toJson(vehiculoEncontrado));
            }
            else
            {
                rta=badRequest("La revisi�n no pudo ser convertida a un objeto RevisionMecanica.class");
            }

        }
        else
        {
            rta=notFound("No se ha encontrado el vehiculo con id:"+idVehiculo);
        }
        return rta;
    }


    public Result readRevisionesVehiculo(String idVehiculo)
    {
        Result rta;
        Vehiculo vehiculoEncontrado = (Vehiculo) Vehiculo.finder.byId(idVehiculo);
        if(vehiculoEncontrado!=null)
        {
            rta=ok(Json.toJson(vehiculoEncontrado.getRevisiones()));
        }
        else
        {
            rta=notFound("No se ha encontrado el vehiculo con id:"+idVehiculo);
        }
        return rta;
    }

}
