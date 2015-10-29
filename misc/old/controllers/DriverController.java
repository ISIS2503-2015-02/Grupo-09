package controllers;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;
import models.Driver;
import play.libs.Json;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;


/**
 * Created by USER on 14/08/2015.
 */
public class
        DriverController extends Controller{

    @BodyParser.Of(BodyParser.Json.class)
    public Result create(){
        JsonNode j = Controller.request().body().asJson();
        Driver driver = Driver.bind(j);
        driver.save();
        return ok(Json.toJson(driver));
    }

    public Result read() {
        List<Driver> drivers = new Model.Finder(Driver.class).all();
        return ok(Json.toJson(drivers));
    }
}
