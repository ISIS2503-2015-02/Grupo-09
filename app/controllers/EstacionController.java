package controllers;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;
import models.Estacion;
import models.User;
import models.Vcub;
import play.libs.Json;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

/**
 * Created by USER on 18/08/2015.
 */
public class EstacionController extends Controller {

    @BodyParser.Of(BodyParser.Json.class)
    public Result create(){
        JsonNode j = Controller.request().body().asJson();
        Estacion station = Estacion.bind(j);
        station.save();
        return ok(Json.toJson(station));
    }

    public Result readAll() {
        List<Estacion> stations = new Model.Finder(Estacion.class).all();
        return ok(Json.toJson(stations));
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
                    prestar.setId_cliente(idCliente);
                    prestar.setEstado(Vcub.PRESTADA);
                    prestar.setId_estacion(null);
                    prestar.save();
                    usuario.setId_vcub_alquilada(prestar.getIdCvubs());
                    usuario.save();
                }
            if(prestar!=null)
            {
                String mensaje ="";
                if(estacion.getVcubsCapacity()/10>disponibles.size()-1)
                {
                    mensaje+="ALERTA: QUEDAN MENOS DEL 10% DE LAS VCUBS PARA LA ESTACIÓN \n\n";
                }
                return ok(mensaje+"Se ha prestado la siguiente vCub\n"+Json.toJson(prestar));
            }
            else
            {
                return ok("No hay Vcubs para ser prestadas");
            }

        }
        else
        {
            return notFound("Alguno de los recursos que intenta obtener no fueron encontrados");
        }
    }

    public Result devolverBicicleta(Long idCliente, Long idEstacionEntrega)
    {
        Estacion estacion = (Estacion)Estacion.finder.byId(idEstacionEntrega);
        User usuario = (User) User.finder.byId(idCliente);
        if(null!=usuario && null!= usuario.getId_vcub_alquilada() && estacion != null) {
            Vcub alquilada = (Vcub) Vcub.finder.byId(usuario.getId_usuario());
            if (estacion.getVcubs().size() < estacion.getVcubsCapacity()) {
                alquilada.setId_estacion(idEstacionEntrega);
                usuario.setId_vcub_alquilada(null);
                alquilada.setEstado(Vcub.LIBRE);
                alquilada.save();
                usuario.save();
                return ok("Cliente:\n"+Json.toJson(usuario)+"\n Vcub:\n "+Json.toJson(alquilada));
            } else {
                return badRequest("LA ESTACIÓN NO TIENE CAPACIDAD DISPONIBLE PARA RECIBIR LA VCUB");
            }
        }
        else
        {
            return notFound("Alguno de los recursos que intenta obtener no fueron encontrados o el usuario no tiene ninguna VCub cargada a su cuenta");
        }
    }
}
