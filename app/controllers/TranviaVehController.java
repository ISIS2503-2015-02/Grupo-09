package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import models.TranviaVehiculo;
import models.Vehiculo;
import play.data.Form;
import play.libs.Json;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.Application.addTranvias;
import views.html.Application.tranvias;

import java.util.List;


/**
 * Created by USER on 14/08/2015.
 */
public class TranviaVehController extends VehiculoController {


    public Result formTranvia(){
        Form<TranviaVehiculo> form = Form.form(TranviaVehiculo.class);
        if(form.hasErrors()){
            return badRequest(addTranvias.render(form));
        }
        TranviaVehiculo nuevo = form.bindFromRequest().get();
        nuevo.save();
        return redirect(routes.TranviaVehController.readAll());
    }

    public Result createTranvia(){
        return ok(addTranvias.render(Form.form(TranviaVehiculo.class)));
    }


    @BodyParser.Of(BodyParser.Json.class)
    public Result create() {
        JsonNode j = Controller.request().body().asJson();
        TranviaVehiculo tranvia = TranviaVehiculo.bind(j);
        tranvia.save();
        return ok(Json.toJson(tranvia));
    }


    @BodyParser.Of(BodyParser.Json.class)
    public Result putTranvia(Long idTranvia)
    {
        TranviaVehiculo original = (TranviaVehiculo) TranviaVehiculo.finder.byId(idTranvia);
        original.delete();
        JsonNode j = Controller.request().body().asJson();
        TranviaVehiculo reemplazarPor = TranviaVehiculo.bind(j);
        original = reemplazarPor;
        original.save();
        return ok(Json.toJson(original));
    }

    public Result readAll() {
        List<TranviaVehiculo> listaTranvias = TranviaVehiculo.finder.all();
        return ok(tranvias.render(listaTranvias));
    }

    public Result readTranvia(Long idTranvia) {
        Result rta;
        TranviaVehiculo tranvia = (TranviaVehiculo) TranviaVehiculo.finder.byId(idTranvia);
        if (tranvia != null) {
            rta = ok(Json.toJson(tranvia));
        } else {
            rta = notFound();
        }
        return rta;
    }

    public Result readRevisionesTranvia(Long idTranvia)
    {
        return readRevisiones(idTranvia, Vehiculo.TRANVIA);
    }

    public Result readTrayectosTranvia(Long idTranvia)
    {
        return readTrayectos(idTranvia, Vehiculo.TRANVIA);
    }

    public Result agregarDatosTranvia(Long idTranvia)
    {
        return agregarDatos(idTranvia, Vehiculo.TRANVIA);
    }

    public Result readDatosTranvia(Long idTranvia)
    {
        return readDatos(idTranvia, Vehiculo.TRANVIA);
    }

    public Result agregarTrayectoTranvia(Long idTranvia)
    {
        return agregarTrayecto(idTranvia, Vehiculo.TRANVIA);
    }

    public Result finalizarTrayectoTranvia (Long idTranvia, Long idTrayecto)
    {
        return finalizarUltimoTrayecto(idTranvia, idTrayecto, Vehiculo.TRANVIA);
    }


    public Result agregarRevisionMovibus(Long idTranvia)
    {
        return agregarRevision(idTranvia, Vehiculo.TRANVIA);
    }


}