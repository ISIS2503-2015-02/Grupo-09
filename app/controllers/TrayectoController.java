package controllers;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;
import models.Trayecto;
import play.data.Form;
import play.libs.Json;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.Application.addTrayectos;
import views.html.Application.trayectos;

import java.util.Date;
import java.util.List;

/**
 * Created by bdrangel10 on 14/08/2015.
 */
public class TrayectoController extends Controller{

    public Result formTrayecto(){
        Form<Trayecto> form = Form.form(Trayecto.class);
        if(form.hasErrors()){
            return badRequest(addTrayectos.render(form));
        }
        Trayecto nuevo = form.bindFromRequest().get();
        nuevo.save();
        return redirect(routes.TrayectoController.readAll());
    }

    public Result createTrayecto(){
        return ok(addTrayectos.render(Form.form(Trayecto.class)));
    }

    public Result readAll() {
        List<Trayecto> list = new Model.Finder(Trayecto.class).all();
        /**
        Iterator<Trayecto> ne = list.iterator();
        List<Driver> drivers = new Model.Finder(Driver.class).all();
        List<Driver> temp = drivers;
        temp.clear();
        while(ne.hasNext()){
            Trayecto x = ne.next();
            Driver nd = (Driver) new Model.Finder(Driver.class).byId(x.getId_conductor());
            temp.add(nd);
        }
        **/
        return ok(trayectos.render(list));
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
     * @param horaFin    Hora final del trayecto, si es null toma la hora del sistema
     *@param nIncidentes Cantidad de incidentes que ocurrieron durante el trayecto
     */
    public static void finalizarTrayecto(Long idTrayecto, Date horaFin, int nIncidentes)
    {
        Trayecto trayecto = (Trayecto)Trayecto.finder.byId(idTrayecto);
        if(trayecto!=null)
        {
            trayecto.setEstado(Trayecto.FINALIZADO);
            if(horaFin==null)
            {
                horaFin=new Date();
            }
            trayecto.setHoraFin(horaFin);
            trayecto.setIncidentes(nIncidentes);
            trayecto.save();
        }
    }

    public static List<Trayecto>  getTrayectosVehiculo(Long idVehiculo)
    {
        return Trayecto.finder.where().eq("id_vehiculo",idVehiculo).findList();
    }
}
