package controllers;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;
import models.Estacion;
import models.User;
import models.Vcub;
import play.data.Form;
import play.libs.Json;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.Application.addEstaciones;
import views.html.Application.estaciones;

import java.util.List;

/**
 * Created by USER on 18/08/2015.
 */
public class EstacionController extends Controller {


    public Result formEstacion(){
        Form<Estacion> form = Form.form(Estacion.class);
        if(form.hasErrors()){
            return badRequest(addEstaciones.render(form));
        }
        Estacion nuevo = form.bindFromRequest().get();
        nuevo.save();
        return redirect(routes.EstacionController.readAll());
    }

    public Result createEstacion(){
        return ok(addEstaciones.render(Form.form(Estacion.class)));
    }

    @BodyParser.Of(BodyParser.Json.class)
    public Result create(){
        JsonNode j = Controller.request().body().asJson();
        Estacion station = Estacion.bind(j);
        station.save();
        return ok(Json.toJson(station));
    }

    public Result readAll() {
        List<Estacion> stations = new Model.Finder(Estacion.class).all();
        return ok(estaciones.render(stations));
    }

    @BodyParser.Of(BodyParser.Json.class)
    public Result modificarEstacion(Long idEstacion)
    {
        JsonNode j = Controller.request().body().asJson();
        Estacion nueva = Estacion.bind(j);
        Estacion reemplazo = (Estacion) new Model.Finder(Estacion.class).byId(idEstacion);
        reemplazo=nueva;
        reemplazo.save();
        return ok(Json.toJson(reemplazo));
    }


    public Result readVcubsEstacion(Long idEstacion) {
        Estacion estacion = (Estacion) new Model.Finder(Estacion.class).byId(idEstacion);
        if(estacion != null) {
            List<Vcub> vcubsEstacion = estacion.getVcubs();
            return ok(Json.toJson(vcubsEstacion));
        }
        return notFound();
    }

    public Result porcentajeOcupacionEstacion(Long idEstacion)
    {
        Estacion estacion = (Estacion) new Model.Finder(Estacion.class).byId(idEstacion);
        if(null!=estacion)
        {
            List<Vcub> disponibles = estacion.getVcubs();
            int capacidad = estacion.getVcubsCapacity();
            double porcentaje = (double) disponibles.size()*100/capacidad;
            return ok(Double.toString(porcentaje));
        }
        return notFound();
    }

    public Result alquilarBicicleta(Long idCliente, Long idEstacion)
    {
        Estacion estacion = (Estacion) new Model.Finder(Estacion.class).byId(idEstacion);
        User usuario = (User) new Model.Finder(User.class).byId(idCliente);
        if(null!=usuario && estacion != null)
        {
            Vcub prestar = null;
            List<Vcub> disponibles = estacion.getVcubs();
                if(disponibles.size()>0)
                {
                    prestar=disponibles.get(0);
                    prestar.setIdCliente(idCliente);
                    prestar.setEstado(Vcub.PRESTADA);
                    prestar.setIdEstacion(null);
                    prestar.save();
                    usuario.setIdVcubAlquilada(prestar.getIdVcub());
                    usuario.save();
                    return ok(Json.toJson(prestar));
                }
                else
                {
                    return badRequest();
                }
        }
        else
        {
            return notFound();
        }
    }

    /**
     * Retorna el Json de la bicicleta entregada, null en caso de poder devolverla
     * @param idCliente
     * @param idEstacionEntrega
     * @return
     */
    public Result devolverBicicleta(Long idCliente, Long idEstacionEntrega)
    {
        Estacion estacion = (Estacion)Estacion.finder.byId(idEstacionEntrega);
        User usuario = (User) User.finder.byId(idCliente);
        if(null!=usuario && null!= usuario.getIdVcubAlquilada() && estacion != null) {
            Vcub alquilada = (Vcub) Vcub.finder.byId(usuario.getIdUsuario());
            if (estacion.getVcubs().size() < estacion.getVcubsCapacity()) {
                alquilada.setIdEstacion(idEstacionEntrega);
                usuario.setIdVcubAlquilada(null);
                alquilada.setEstado(Vcub.LIBRE);
                alquilada.save();
                usuario.save();
                return ok(Json.toJson(alquilada));
            }
            else
            {
                return badRequest();
            }
        }
        else
        {
            return notFound();
        }
    }
}
