package controllers;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;
import models.MoviBusVehiculo;
import models.Vehiculo;
import play.data.Form;
import play.libs.Json;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.Application.addMobibuses;
import views.html.Application.mobibuses;

import java.util.List;


/**
 * Created by USER on 14/08/2015.
 */
public class MoviBusController extends VehiculoController {

    public Result formMobibus(){
        Form<MoviBusVehiculo> form = Form.form(MoviBusVehiculo.class);
        if(form.hasErrors()){
            return badRequest(addMobibuses.render(form));
        }
        MoviBusVehiculo nuevo = form.bindFromRequest().get();
        nuevo.save();
        return readAll();
    }

    public Result createMobiBus(){
        return ok(addMobibuses.render(Form.form(MoviBusVehiculo.class)));
    }

    @BodyParser.Of(BodyParser.Json.class)
    public Result create() {
        JsonNode j = Controller.request().body().asJson();
        MoviBusVehiculo movibus = MoviBusVehiculo.bind(j);
        movibus.save();
        return ok(Json.toJson(movibus));
    }


    @BodyParser.Of(BodyParser.Json.class)
    public Result putMovibus(Long idMovibus)
    {
        MoviBusVehiculo original = (MoviBusVehiculo) MoviBusVehiculo.finder.byId(idMovibus);
        JsonNode j = Controller.request().body().asJson();
        if(original!=null)
        {
            original.delete();
            MoviBusVehiculo reemplazarPor = MoviBusVehiculo.bind(j);
            reemplazarPor.setIdVehiculo(idMovibus);
            reemplazarPor.save();

        }
        original = (MoviBusVehiculo) MoviBusVehiculo.finder.byId(idMovibus);
        return ok(Json.toJson(original));


    }

    public Result readAll() {
        List<MoviBusVehiculo> movibuses = new Model.Finder(MoviBusVehiculo.class).all();
        return ok(mobibuses.render(movibuses));
    }

    public Result readMovibus(Long idMovibus) {
        Result rta;
        MoviBusVehiculo movibus = (MoviBusVehiculo) MoviBusVehiculo.finder.byId(idMovibus);
        if (movibus != null) {
            rta = ok(Json.toJson(movibus));
        } else {
            rta = notFound();
        }
        return rta;
    }

    public Result agregarDatosMovibus(Long idMovibus)
    {
        return agregarDatos(idMovibus, Vehiculo.MOVIBUS);
    }

    public Result readDatosMovibus(Long idVehiculo)
    {
        return readDatos(idVehiculo, Vehiculo.MOVIBUS);
    }

    public Result agregarTrayectoMovibus(Long idMovibus)
    {
        return agregarTrayecto(idMovibus, Vehiculo.MOVIBUS);
    }

    public Result finalizarTrayectoMovibus(Long idMovibus, Long idTrayecto)
    {
        return finalizarUltimoTrayecto(idMovibus, idTrayecto, Vehiculo.MOVIBUS);
    }

    public Result readTrayectosMovibus(Long idMovibus)
    {
        return readTrayectos(idMovibus, Vehiculo.MOVIBUS);
    }

    public Result agregarRevisionMovibus(Long idMovibus)
    {
        return agregarRevision(idMovibus,Vehiculo.MOVIBUS);
    }

    public Result readRevisionesMovibus(Long idMovibus)
    {
        return readRevisiones(idMovibus, Vehiculo.MOVIBUS);
    }

}