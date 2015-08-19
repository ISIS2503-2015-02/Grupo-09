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

    public Result read() {
        List<Vehiculo> vehiculos = new Model.Finder(Vehiculo.class).all();
        return ok(Json.toJson(vehiculos));
    }

    public Result read(String id) {
        Vehiculo vehiculoEncontrado = (Vehiculo) new Model.Finder(Vehiculo.class).byId(id);
        if(vehiculoEncontrado != null) {
            return ok(Json.toJson(vehiculoEncontrado));
        }
        return notFound();
    }

    public Result agregarDatos()
    {
        String mensaje ="";
        JsonNode j = Controller.request().body().asJson();
        String idVehiculo =  j.findPath("id_vehiculo").asText();
        Vehiculo vehiculoEncontrado = (Vehiculo) new Model.Finder(Vehiculo.class).byId(idVehiculo);
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
            //Se está atendiendo el accidente
            mensaje="Se está atendiendo un accidente, recuerde registrar en el sistema cuando la situación regrese a la normalidad";
        }
        vehiculoEncontrado.agregarDatos(datosRecibidos);
        vehiculoEncontrado.save();

        return ok(mensaje + "\n Datos agregados:\n" + Controller.request().body().asJson();
    }


    public Result agregarTrayecto(String idConductor, String idVehiculo)
    {
        try
        {
            JsonNode json = Controller.request().body().asJson();
            Vehiculo vehiculoEncontrado = (Vehiculo) new Model.Finder(Vehiculo.class).byId(idVehiculo);
            Driver conductorEncontrado = (Driver) new Model.Finder(Driver.class).byId(idConductor);
            Trayecto trayectoRecibido= Trayecto.bind(json);
            trayectoRecibido.setVehiculo(vehiculoEncontrado);
            trayectoRecibido.setConductor(conductorEncontrado);
            conductorEncontrado.agregarTrayecto(trayectoRecibido);
            vehiculoEncontrado.agregarTrayecto(trayectoRecibido);
            trayectoRecibido.save();
            vehiculoEncontrado.save();
            conductorEncontrado.save();
        }
        catch (NullPointerException null)
        {
            return notFound("No se ha encontrado alguno de los elementos requeridos, revise nuevamente los datos de la solicitud");
        }

        return ok("\n Trayecto Iniciado:\n"+Controller.request().body().asJson()+"\n Conductor:\n"+Json.toJson(conductorEncontrado)+"\n Vehiculo:\n"+Json.toJson(vehiculoEncontrado);

    }

    public Result finalizarTrayecto(String idTrayecto, Date horaFin, int inconvenientes)
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
        }
        trayecoEncontrado.save();
        return ok("Se registró la finalizacion del trayecto:\n"+Json.toJson(trayecoEncontrado));
    }

    public Result readTrayectosVehiculo (String idVehiculo)
    {
        Vehiculo vehiculoEncontrado = new Model.Finder(Vehiculo.class).byId(idVehiculo);
        if(vehiculoEncontrado!=null)
        {
            return ok(Json.toJson(vehiculoEncontrado.getTrayectos());
        }
        else
        {
            return notFound("No se ha encontrado el vehiculo solicitado");
        }

    }

}
