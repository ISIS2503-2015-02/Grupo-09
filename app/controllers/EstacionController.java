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

    public Result read() {
        List<Estacion> stations = new Model.Finder(Estacion.class).all();
        return ok(Json.toJson(stations));
    }

    public Result modificarEstacion(String idEstacion)
    {
        JsonNode j = Controller.request().body().asJson();
        Estacion nueva = Estacion.bind(j);
        Estacion reemplazo = (Estacion) new Model.Finder(Estacion.class).byId(idEstacion);
        reemplazo=nueva;
        reemplazo.save();
    }



    public Result readVcubs(String idEstacion) {
        Estacion estacion = (Estacion) new Model.Finder(Estacion.class).byId(idEstacion);
        if(estacion != null) {
            List<Vcub> vcubsEstacion = estacion.getVcubs();
            return ok(Json.toJson(vcubsEstacion));
        }
        return notFound();
    }

    public Result alquilarBicicleta(String idCliente, String idEstacion)
    {

        Estacion estacion = (Estacion) new Model.Finder(Estacion.class).byId(idEstacion);
        User usuario = (User) new Model.Finder(User.class).byId(idCliente);
        if(null!=usuario && estacion != null)
        {
            Vcub prestada =estacion.alquilarVcub(usuario);
            if(prestada!=null)
            {
                String mensaje ="";
                if(estacion.getVcubsCapacity()/10>estacion.getVcubs().size())
                {
                    mensaje+="ALERTA: QUEDAN MENOS DEL 10% DE LAS VCUBS PARA LA ESTACIÓN \n";
                }
                return ok(mensaje+"Se ha prestado la siguiente vCub\n"+Json.toJson(prestada));
            }
            else
            {
                return ok ("No hay Vcubs para ser prestadas");
            }

        }
        else
        {
            return notFound("Alguno de los recursos que intenta obtener no fueron encontrados");
        }
    }

    public Result devolverBicicleta(String idCliente, String idEstacionEntrega)
    {
        Estacion estacion = (Estacion) new Model.Finder(Estacion.class).byId(idEstacionEntrega);
        User usuario = (User) new Model.Finder(User.class).byId(idCliente);
        if(null!=usuario && null!= usuario.getAlquilada() && estacion != null)
        {
            Vcub alquilada = usuario.getAlquilada();
            estacion.devolverVcub(alquilada);
        }
        else
        {
            return notFound("Alguno de los recursos que intenta obtener no fueron encontrados o el usuario no tiene ninguna VCub cargada a su cuenta");
        }
        return notFound("Alguno de los recursos que intenta obtener no fueron encontrados o el usuario no tiene ninguna VCub cargada a su cuenta");
    }
}
