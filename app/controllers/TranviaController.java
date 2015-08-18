package controllers;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;
import models.Tranvia;
import models.User;
import play.libs.Json;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;


/**
 * Created by USER on 14/08/2015.
 */
public class TranviaController extends Controller{

    @BodyParser.Of(BodyParser.Json.class)
    public Result create(){
        JsonNode j = Controller.request().body().asJson();
        Tranvia tranvia = Tranvia.bind(j);
        tranvia.save();

        Tranvia lastTranvia = (Tranvia) new Model.Finder(User.class).byId(tranvia.getId());
        return ok(Json.toJson(lastTranvia));
    }

    public Result read() {
        List<Tranvia> tranvias = new Model.Finder(Tranvia.class).all();
        return ok(Json.toJson(tranvias));
    }

    public Result read(String id) {
        Tranvia t = (Tranvia) new Model.Finder(Tranvia.class).byId(id);
        if(t != null) {
            return ok(Json.toJson(t));
        }
        return notFound();
    }

    public Result modify(String id)
    {
        JsonNode j = Controller.request().body().asJson();
        Tranvia lastTranvia = (Tranvia) new Model.Finder(Tranvia.class).byId(id);

        lastTranvia.update(j);
        lastTranvia.save();

        lastTranvia = (Tranvia) new Model.Finder(User.class).byId(id);
        return ok(Json.toJson(lastTranvia));
    }
}
