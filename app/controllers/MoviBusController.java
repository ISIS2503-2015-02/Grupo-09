package controllers;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;
import models.*;
import play.libs.Json;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;
import scala.math.Ordering;

import java.util.List;


/**
 * Created by USER on 14/08/2015.
 */
public class MoviBusController extends Controller{

    @BodyParser.Of(BodyParser.Json.class)
    public Result create(){
        JsonNode j = Controller.request().body().asJson();
        Vehiculo movibus = MoviBusVehiculo.bind(j);
        movibus.save();

        return ok(Json.toJson(movibus));
    }

    public Result read() {
        List<MoviBusVehiculo> movibuses = new Model.Finder(MoviBusVehiculo.class).all();
        return ok(Json.toJson(movibuses));
    }

    public Result ingresarDatos()
    {
        JsonNode j = Controller.request().body().asJson();
        MoviBusVehiculo movi = (MoviBusVehiculo) new Model.Finder(MoviBusVehiculo.class).byId((j.findPath("id_vehiculo").asText()));
        List<Datos> actuales = movi.getDatos();
        Datos datosRecibidos = Datos.bind(j);
        actuales.add(actuales);
        movi.setDatos(actuales);
        movi.save();
        return ok("Dato ingresado correctamente:\n"+Json.toJson(datosRecibidos));
    }
}
