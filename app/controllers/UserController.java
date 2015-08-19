package controllers;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;
import models.*;
import play.libs.Json;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;
import scala.math.Ordering;

import java.util.List;


/**
 * Created by USER on 14/08/2015.
 */
public class UserController extends Controller{

    @BodyParser.Of(BodyParser.Json.class)
    public Result create(){
        JsonNode j = Controller.request().body().asJson();
        User user = User.bind(j);
        user.save();

        User lastUser = (User) new Model.Finder(User.class).byId(user.getUserID());
        return ok(Json.toJson(lastUser));
    }

    public Result readAll() {
        List<User> users = new Model.Finder(User.class).all();
        return ok(Json.toJson(users));
    }

    public Result read(String id) {
        User u = (User) new Model.Finder(User.class).byId(id);
        if(u != null) {
            return ok(Json.toJson(u));
        }
        return notFound();
    }

    public Result modify(String id)
    {
        JsonNode j = Controller.request().body().asJson();
        User lastUser = (User) new Model.Finder(User.class).byId(id);

        lastUser.update(j);
        lastUser.save();

        lastUser = (User) new Model.Finder(User.class).byId(id);
        return ok(Json.toJson(lastUser));
    }

    public Result crearReseva(String idCliente)
    {
        User cliente = (User) User.finder.byId(idCliente);
        if(cliente!=null)
        {
            JsonNode j = Controller.request().body().asJson();
            Reserva jsonReserva = Reserva.bind(j);
            Reserva nuevaReserva = new Reserva(jsonReserva.getHora_reserva(),jsonReserva.getCosto(),cliente);
            cliente.agregarReserva(nuevaReserva);
            nuevaReserva.save();
            cliente.save();
            return ok("Reserva creada:\n"+Json.toJson(nuevaReserva));
        }
        else
        {
            return notFound("Cliente no encontrado");
        }
    }

    public Result consultarReservasUsuario(String idCliente)
    {
        User cliente = (User) User.finder.byId(idCliente);
        if(cliente!=null)
        {
            return ok(Json.toJson(cliente.getReservas()));
        }
        else
        {
            return notFound("Usuario no encontrado");
        }
    }

    @BodyParser.Of(BodyParser.Json.class)
    public Result modificarReservaCliente(String idCliente, String idReserva)
    {
        User cliente = (User) User.finder.byId(idCliente);
        if(cliente!=null)
        {
            Reserva original = (Reserva) Reserva.finder.byId(idReserva);
            if(original.getCliente().getUserID().equals(idCliente))
            {
                JsonNode j = Controller.request().body().asJson();
                Reserva jsonReserva = Reserva.bind(j);
                original.setEstado(jsonReserva.getEstado());
                original.setHora_reserva(jsonReserva.getHora_reserva());
                original.setMovibusReservado(jsonReserva.getMovibusReservado());
                original.setCosto(jsonReserva.getCosto());
                original.save();
                return ok("Los datos de la reserva ahora son:\n"+Json.toJson(original));
            }
            return badRequest("El usuario no tiene ninguna reserva con id:" + idReserva);
        }
        else
        {
            return notFound("Usuario no encontrado");
        }
    }

    public Result eliminarReservaCliente(String idCliente, String idReserva)
    {
        User cliente = (User) User.finder.byId(idCliente);
        if(cliente!=null)
        {
            Reserva encontrada = (Reserva) Reserva.finder.byId(idReserva);
            if(encontrada.getCliente().getUserID().equals(idCliente))
            {
                encontrada.delete();
                return ok("RESERVA ELIMINADA:\n Las reservas actuales para este usuario son:\n"+Json.toJson(cliente.getReservas()));
            }
            return badRequest("El usuario no tiene ninguna reserva con id:" + idReserva);
        }
        else
        {
            return notFound("Usuario no encontrado");
        }

    }
}
