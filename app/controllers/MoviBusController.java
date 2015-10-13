package controllers;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;
import models.*;
import play.libs.Json;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.mobibuses;

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
    public Result putMovibus(Long idMovibus)
    {
        MoviBusVehiculo original = (MoviBusVehiculo) MoviBusVehiculo.finder.byId(idMovibus);
        JsonNode j = Controller.request().body().asJson();
        if(original!=null)
        {
            original.delete();
            MoviBusVehiculo reemplazarPor = MoviBusVehiculo.bind(j);
            reemplazarPor.setId_vehiculo(idMovibus);
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

    public Result agregarDatosMovibus(Long id_movibus)
    {
        return agregarDatos(id_movibus, Vehiculo.MOVIBUS);
    }

    public Result readDatosMovibus(Long idVehiculo)
    {
        return readDatos(idVehiculo, Vehiculo.MOVIBUS);
    }

    public Result agregarTrayectoMovibus(Long id_movibus)
    {
        return agregarTrayecto(id_movibus, Vehiculo.MOVIBUS);
    }

    public Result finalizarTrayectoMovibus(Long id_movibus, Long id_trayecto)
    {
        return finalizarUltimoTrayecto(id_movibus, id_trayecto, Vehiculo.MOVIBUS);
    }

    public Result readTrayectosMovibus(Long id_movibus)
    {
        return readTrayectos(id_movibus, Vehiculo.MOVIBUS);
    }

    public Result agregarRevisionMovibus(Long id_movibus)
    {
        return agregarRevision(id_movibus,Vehiculo.MOVIBUS);
    }

    public Result readRevisionesMovibus(Long id_movibus)
    {
        return readRevisiones(id_movibus, Vehiculo.MOVIBUS);
    }




}