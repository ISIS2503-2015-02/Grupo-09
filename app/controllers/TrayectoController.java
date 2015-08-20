package controllers;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;
import models.Driver;
import models.Trayecto;
import play.libs.Json;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;


/**
 * Created by bdrangel10 on 14/08/2015.
 */
public class TrayectoController extends Controller{

    public Result readAll() {
        List<Trayecto> trayectos = new Model.Finder(Trayecto.class).all();
        return ok(Json.toJson(trayectos));
    }


    @BodyParser.Of(BodyParser.Json.class)
    public Result create(){
        JsonNode j = Controller.request().body().asJson();
        Trayecto t = Trayecto.bind(j);
        t.save();
        return ok(Json.toJson(t));
    }
}
