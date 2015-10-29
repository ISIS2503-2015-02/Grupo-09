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

    /** NO SE USAN/FUNCIONAN PORQUE VEHICULO NO ES ENTITY
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

    **/

    @BodyParser.Of(BodyParser.Json.class)
    public  Result agregarDatos(Long id_vehiculo, int tipo_vehiculo)
    {
        String mensaje;
        JsonNode j = Controller.request().body().asJson();
        Vehiculo vehiculoEncontrado = tipo_vehiculo==Vehiculo.TRANVIA?
                (Vehiculo)TranviaVehiculo.finder.byId(id_vehiculo):
                (Vehiculo)MoviBusVehiculo.finder.byId(id_vehiculo);

            if(vehiculoEncontrado!=null)
            {
                Datos datosRecibidos = Datos.bind(j);
                datosRecibidos.setId_vehiculo(vehiculoEncontrado.getIdVehiculo());
                datosRecibidos.save();
                vehiculoEncontrado.setUltimosDatos(datosRecibidos);
                vehiculoEncontrado.save();
                if(vehiculoEncontrado.getEstado()!=Vehiculo.ACCIDENTE  && ( datosRecibidos.isSensorChoque() || datosRecibidos.isBotonPanico() || datosRecibidos.getSensorTermico()>38))
                {
                    //Crear  emergencia
                    vehiculoEncontrado.setEstado(Vehiculo.ACCIDENTE);
                    Datos ultimosDatos = vehiculoEncontrado.getUltimosDatos();
                    Emergencia em = new Emergencia(0 , ultimosDatos.getHoraMedicion(), "Comentarios", "Altitud:"+ultimosDatos.getGpsAltitud()+"-Latitud:"+ultimosDatos.getGpsLatitud(), "Niv Indef/moment");
                    vehiculoEncontrado.setUltimaEmergencia(em);
                    vehiculoEncontrado.save();
                    em.save();
                }

                return ok(Json.toJson(datosRecibidos));
            }
            else
            {
                return notFound();
            }


    }

    public Result readDatos(Long id_vehiculo, int tipo_vehiculo)
    {
        Vehiculo vehiculoEncontrado = tipo_vehiculo==Vehiculo.TRANVIA?
                (Vehiculo)TranviaVehiculo.finder.byId(id_vehiculo):
                (Vehiculo)MoviBusVehiculo.finder.byId(id_vehiculo);
        if(vehiculoEncontrado!=null)
        {
            List<Datos> datos = Datos.finder.where().eq("id_vehiculo",id_vehiculo).findList();
            return ok(Json.toJson(datos));
        }
        else
        {
            return notFound();
        }
    }

    /**
     * Retorna el Json del trayecto que se acaba de crear
     * @param id_vehiculo
     * @param tipo_vehiculo
     * @return
     */
    @BodyParser.Of(BodyParser.Json.class)
    public Result agregarTrayecto( Long id_vehiculo, int tipo_vehiculo) {
        JsonNode json = Controller.request().body().asJson();
        Vehiculo vehiculoEncontrado = tipo_vehiculo==Vehiculo.TRANVIA?
                (Vehiculo)TranviaVehiculo.finder.byId(id_vehiculo):
                (Vehiculo)MoviBusVehiculo.finder.byId(id_vehiculo);
        Trayecto trayectoRecibido = Trayecto.bind(json);
        Driver conductorEncontrado = (Driver) new Model.Finder(Driver.class).byId(trayectoRecibido.getId_conductor());
        if (vehiculoEncontrado != null && conductorEncontrado != null) {
            if(vehiculoEncontrado.getUltimoTrayecto()==null || vehiculoEncontrado.getUltimoTrayecto().getEstado()==Trayecto.FINALIZADO)
            {
                trayectoRecibido.setId_vehiculo(vehiculoEncontrado.getIdVehiculo());
                trayectoRecibido.setId_conductor(conductorEncontrado.getId_conductor());
                conductorEncontrado.setUltimoTrayecto(trayectoRecibido);
                vehiculoEncontrado.setUltimoTrayecto(trayectoRecibido);
                vehiculoEncontrado.setEstado(Vehiculo.EN_MARCHA);
                trayectoRecibido.save();
                vehiculoEncontrado.save();
                conductorEncontrado.save();
                return ok(Json.toJson(trayectoRecibido));
            }
            else {
                return badRequest("No se puede iniciar un nuevo trayecto antes de finalizar el anterior");
            }

        } else {
            return notFound();
        }
    }

    /**
     * Finaliza el ultimo Trayecto que se ha iniciado
     * @param id_vehiculo
     * @param id_trayecto
     * @param tipo_vehiculo
     * @return ok con el Json del Trayecto que se finalizo,
     * @return badReques si no se está intentando finalizar el ultimo trayecto iniciado
     * @return notFound si no se encuentra alguno de los datos necesarios
     */
    @BodyParser.Of(BodyParser.Json.class)
    public Result finalizarUltimoTrayecto(Long id_vehiculo, Long id_trayecto, int tipo_vehiculo)
    {
        Vehiculo vehiculoEncontrado = tipo_vehiculo==Vehiculo.TRANVIA?
                (Vehiculo)TranviaVehiculo.finder.byId(id_vehiculo):
                (Vehiculo)MoviBusVehiculo.finder.byId(id_vehiculo);
        //Trayecto trayecoEncontrado = vehiculoEncontrado.getUltimoTrayecto();
        Trayecto trayecoEncontrado = (Trayecto)Trayecto.finder.byId(id_trayecto);
        Trayecto ultimo_trayecto_veh = vehiculoEncontrado != null ? vehiculoEncontrado.getUltimoTrayecto() : null;
        if (trayecoEncontrado != null && vehiculoEncontrado != null)
        {
            if (ultimo_trayecto_veh!=null && ultimo_trayecto_veh.getId_trayecto()==id_trayecto)
            {
                JsonNode json = Controller.request().body().asJson();
                Trayecto trayectoRecibido = Trayecto.bind(json);
                if (trayectoRecibido != null)
                {
                    TrayectoController.finalizarTrayecto(trayecoEncontrado.getId_trayecto(), trayectoRecibido.getHora_fin(), trayectoRecibido.getIncidentes());
                }
                vehiculoEncontrado.setEstado(Vehiculo.DISPONIBLE);
                vehiculoEncontrado.save();
                trayecoEncontrado = (Trayecto)Trayecto.finder.byId(id_trayecto);
//                trayectoRecibido.delete();
                return ok(Json.toJson(trayecoEncontrado));
            } else {
                return badRequest();
            }
        }

        return notFound();


    }

    public Result readTrayectos(Long id_vehiculo, int tipo_vehiculo)
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
            return notFound();
        }
    }

    /**
     * Retorna la nueva revisión mecánica
     * @param id_vehiculo
     * @param tipo_vehiculo
     * @return
     */

    @BodyParser.Of(BodyParser.Json.class)
    public Result agregarRevision(Long id_vehiculo, int tipo_vehiculo)
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
                rta =ok(Json.toJson(revision));
            }
            else
            {
                rta=badRequest();
            }
        }
        else
        {
            rta=notFound();
        }
        return rta;
    }

    public Result readRevisiones(Long id_vehiculo, int tipo_vehiculo)
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
            rta=notFound();
        }
        return rta;
    }
}
