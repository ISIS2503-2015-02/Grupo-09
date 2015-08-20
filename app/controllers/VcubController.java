package controllers;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;
import models.Vcub;
import models.User;
import play.libs.Json;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;


/**
 * Created by USER on 14/08/2015.
 */
public class VcubController extends Controller{

    @BodyParser.Of(BodyParser.Json.class)
    public Result create(){
        JsonNode j = Controller.request().body().asJson();
        Vcub vcub = Vcub.bind(j);
        vcub.save();

        Vcub lastVcub = (Vcub) new Model.Finder(User.class).byId(vcub.getIdCvubs());
        return ok(Json.toJson(lastVcub));
    }

    public Result readAll() {
        List<Vcub> Vcubs = new Model.Finder(Vcub.class).all();
        return ok(Json.toJson(Vcubs));
    }

    public Result read(String id) {
        Vcub t = (Vcub) new Model.Finder(Vcub.class).byId(id);
        if(t != null) {
            return ok(Json.toJson(t));
        }
        return notFound();
    }

    @BodyParser.Of(BodyParser.Json.class)
    public Result modify(String id)
    {
        JsonNode j = Controller.request().body().asJson();
        Vcub lastVcub = (Vcub) new Model.Finder(Vcub.class).byId(id);

        lastVcub.update(j);
        lastVcub.save();

        lastVcub = (Vcub) new Model.Finder(Vcub.class).byId(id);
        return ok(Json.toJson(lastVcub));
    }
}
