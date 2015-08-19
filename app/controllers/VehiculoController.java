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

        return ok(mensaje+"\n Datos agregados:\n"+Controller.request().body().asJson();
    }

}
