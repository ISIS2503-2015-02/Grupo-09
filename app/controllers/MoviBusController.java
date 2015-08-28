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
 * Created by USER on 14/08/2015.
 */
public class MoviBusController extends VehiculoController {

    @BodyParser.Of(BodyParser.Json.class)
    public Result create() {
        JsonNode j = Controller.request().body().asJson();
        MoviBusVehiculo movibus = MoviBusVehiculo.bind(j);
        movibus.save();
        return ok(Json.toJson(movibus));
    }


    @BodyParser.Of(BodyParser.Json.class)
    public Result putMovibus(String idMovibus)
    {
        MoviBusVehiculo original = (MoviBusVehiculo) MoviBusVehiculo.finder.byId(idMovibus);
        original.delete();
        JsonNode j = Controller.request().body().asJson();
        MoviBusVehiculo reemplazarPor = MoviBusVehiculo.bind(j);
        original = reemplazarPor;
        original.save();
        return ok(Json.toJson(original));
    }

    public Result read() {
        List<MoviBusVehiculo> movibuses = new Model.Finder(MoviBusVehiculo.class).all();



        return ok(Json.toJson(movibuses));
    }

    public Result readMovibus(String idMovibus) {
        Result rta;
        MoviBusVehiculo movibus = (MoviBusVehiculo) MoviBusVehiculo.finder.byId(idMovibus);
        if (movibus != null) {
            rta = ok(Json.toJson(movibus));
        } else {
            rta = notFound();
        }
        return rta;
    }


}