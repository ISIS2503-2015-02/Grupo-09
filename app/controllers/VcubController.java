package controllers;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;
import models.Estacion;
import models.Vcub;
import models.User;
import play.data.Form;
import play.libs.Json;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.Application.addVCubs;
import views.html.Application.vcubs;

import java.util.List;


/**
 * Created by USER on 14/08/2015.
 */
public class VcubController extends VehiculoController{

    public Result formVCub(){
        Form<Vcub> form = Form.form(Vcub.class);
        List<Estacion> stations = new Model.Finder(Estacion.class).all();
        if(form.hasErrors()){
            return badRequest(addVCubs.render(form,stations));
        }
        Vcub nuevo = form.bindFromRequest().get();
        nuevo.save();
        return redirect(routes.VcubController.readAll());
    }

    public Result createVcub(){
        List<Estacion> stations = new Model.Finder(Estacion.class).all();
        return ok(addVCubs.render(Form.form(Vcub.class),stations));
    }

    @BodyParser.Of(BodyParser.Json.class)
    public Result create(){
        JsonNode j = Controller.request().body().asJson();
        Vcub vcub = Vcub.bind(j);
        vcub.save();

        Vcub lastVcub = (Vcub) new Model.Finder(User.class).byId(vcub.getIdVcub());
        return ok(Json.toJson(lastVcub));
    }

    public Result readAll() {
        List<Vcub> Vcubs = new Model.Finder(Vcub.class).all();
        return ok(vcubs.render(Vcubs));
    }

    public Result read(Long id) {
        Vcub t = (Vcub) new Model.Finder(Vcub.class).byId(id);
        if(t != null) {
            return ok(Json.toJson(t));
        }
        return notFound();
    }

    @BodyParser.Of(BodyParser.Json.class)
    public Result modify(Long id)
    {
        JsonNode j = Controller.request().body().asJson();
        Vcub anterior = (Vcub) Vcub.finder.byId(id);
        Vcub update = Vcub.bind(j);
        if(anterior!=null && update!=null && anterior.getIdVcub()==update.getIdVcub())
        {
            anterior.delete();
            update.save();
        }
        Vcub lastVcub = (Vcub) Vcub.finder.byId(id);
        return ok(Json.toJson(lastVcub));
    }
}
