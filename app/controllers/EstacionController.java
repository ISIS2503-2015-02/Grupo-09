package controllers;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;
import models.Estacion;
import play.libs.Json;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

/**
 * Created by USER on 18/08/2015.
 */
public class EstacionController extends Controller {

    @BodyParser.Of(BodyParser.Json.class)
    public Result create(){
        JsonNode j = Controller.request().body().asJson();
        Estacion station = Estacion.bind(j);
        station.save();

        return ok(Json.toJson(station));
    }

    public Result read() {
        List<Estacion> stations = new Model.Finder(Estacion.class).all();
        return ok(Json.toJson(stations));
    }

    public Result read(String id) {
        Estacion station = (Estacion) new Model.Finder(Estacion.class).byId(id);
        if(station != null) {
            return ok(Json.toJson(station));
        }
        return notFound();
    }
}
