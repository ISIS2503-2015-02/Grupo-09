package controllers;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;
import models.Datos;
import models.MoviBus;
import models.MoviBusVehiculo;
import models.User;
import play.libs.Json;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;
import scala.math.Ordering;

import java.util.List;


/**
 * Created by USER on 14/08/2015.
 */
public class UserController extends Controller{

    @BodyParser.Of(BodyParser.Json.class)
    public Result create(){
        JsonNode j = Controller.request().body().asJson();
        User user = User.bind(j);
        user.save();

        User lastUser = (User) new Model.Finder(User.class).byId(user.getUserID());
        return ok(Json.toJson(lastUser));
    }

    public Result readAll() {
        List<User> users = new Model.Finder(User.class).all();
        return ok(Json.toJson(users));
    }

    public Result read(String id) {
        User u = (User) new Model.Finder(User.class).byId(id);
        if(u != null) {
            return ok(Json.toJson(u));
        }
        return notFound();
    }

    public Result modify(String id)
    {
        JsonNode j = Controller.request().body().asJson();
        User lastUser = (User) new Model.Finder(User.class).byId(id);

        lastUser.update(j);
        lastUser.save();

        lastUser = (User) new Model.Finder(User.class).byId(id);
        return ok(Json.toJson(lastUser));
    }
}
