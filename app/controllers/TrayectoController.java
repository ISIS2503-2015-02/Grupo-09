package controllers;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;
import models.Driver;
import models.Trayecto;
import play.libs.Json;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.Date;
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

    /**
     * Finaliza el trayecto
     * @param hora_fin    Hora final del trayecto, si es null toma la hora del sistema
     *@param nIncidentes Cantidad de incidentes que ocurrieron durante el trayecto
     */
    public static void finalizarTrayecto(Long id_trayecto, Date hora_fin, int nIncidentes)
    {
        Trayecto trayecto = (Trayecto)Trayecto.finder.byId(id_trayecto);
        if(trayecto!=null)
        {
            trayecto.setEstado(Trayecto.FINALIZADO);
            if(hora_fin==null)
            {
                hora_fin=new Date();
            }
            trayecto.setHora_fin(hora_fin);
            trayecto.setIncidentes(nIncidentes);
        }
    }

    public static List<Trayecto>  getTrayectosVehiculo(Long id_vehiculo)
    {
        return Trayecto.finder.where().eq("id_vehiculo",id_vehiculo).findList();
    }
}
