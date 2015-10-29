package controllers;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;
import models.*;
import play.data.Form;
import play.libs.Json;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.Application.addConductores;
import views.html.Application.addUsuarios;
import views.html.Application.usuarios;

import java.util.List;


/**
 * Created by USER on 14/08/2015.
 */
public class UserController extends Controller{


    public Result formUser(){
        Form<User> form = Form.form(User.class);
        if(form.hasErrors()){
            return badRequest(addUsuarios.render(form));
        }
        User nuevo = form.bindFromRequest().get();
        nuevo.save();
        return redirect(routes.UserController.readAll());
    }

    public Result createUser(){
        return ok(addUsuarios.render(Form.form(User.class)));
    }

    @BodyParser.Of(BodyParser.Json.class)
    public Result create(){
        JsonNode j = Controller.request().body().asJson();
        User user = User.bind(j);
        user.save();

        User lastUser = (User) new Model.Finder(User.class).byId(user.getId_usuario());
        return ok(Json.toJson(lastUser));
    }

    public Result readAll() {
        List<User> users = new Model.Finder(User.class).all();
        return ok(usuarios.render(users));
    }

    public Result read(Long id) {
        User u = (User) new Model.Finder(User.class).byId(id);
        if(u != null) {
            return ok(Json.toJson(u));
        }
        return notFound();
    }

    @BodyParser.Of(BodyParser.Json.class)
    public Result modify(Long id)
    {
        JsonNode j = Controller.request().body().asJson();
        User lastUser = (User) new Model.Finder(User.class).byId(id);

        lastUser.update(j);
        lastUser.save();

        lastUser = (User) new Model.Finder(User.class).byId(id);
        return ok(Json.toJson(lastUser));
    }

    @BodyParser.Of(BodyParser.Json.class)
    public Result crearReseva(Long idCliente)
    {
        User cliente = (User) User.finder.byId(idCliente);
        if(cliente!=null)
        {
            JsonNode j = Controller.request().body().asJson();
            Reserva jsonReserva = Reserva.bind(j);
            Reserva nuevaReserva = new Reserva(jsonReserva.getHora_reserva(),jsonReserva.getCosto(),idCliente);
            cliente.setId_ultimaReserva(nuevaReserva.getId_reserva());
            nuevaReserva.save();
            cliente.save();
            return ok(Json.toJson(nuevaReserva));
        }
        else
        {
            return notFound();
        }
    }

    public Result consultarReservasUsuario(Long id_cliente)
    {
        User cliente = (User) User.finder.byId(id_cliente);
        if(cliente!=null)
        {
            return ok(Json.toJson(Reserva.finder.where().eq("id_cliente",id_cliente).findList()));
        }
        else
        {
            return notFound();
        }
    }

    @BodyParser.Of(BodyParser.Json.class)
    public Result modificarReservaCliente(Long id_cliente, Long id_reserva)
    {
        User cliente = (User) User.finder.byId(id_cliente);
        if(cliente!=null)
        {
            Reserva original = (Reserva) Reserva.finder.byId(id_reserva);
            if(original.getId_cliente().equals(id_cliente))
            {
                JsonNode j = Controller.request().body().asJson();
                Reserva jsonReserva = Reserva.bind(j);
                original.setEstado(jsonReserva.getEstado());
                original.setHora_reserva(jsonReserva.getHora_reserva());
                original.setId_movibus_reservado(jsonReserva.getId_movibus_reservado());
                original.setCosto(jsonReserva.getCosto());
                original.save();
                return ok(Json.toJson(original));
            }
            return badRequest();
        }
        else
        {
            return notFound();
        }
    }

    /**
     * REtorna las reservas que ahora tiene el cliente
     * @param idCliente
     * @param idReserva
     * @return
     */
    public Result eliminarReservaCliente(Long idCliente, Long idReserva)
    {
        User cliente = (User) User.finder.byId(idCliente);
        if(cliente!=null)
        {
            Reserva encontrada = (Reserva) Reserva.finder.byId(idReserva);
            if(encontrada.getId_cliente().equals(idCliente))
            {
                encontrada.delete();
                return ok(Json.toJson(Reserva.finder.where().eq("id_cliente",idCliente)));
            }
            return badRequest();
        }
        else
        {
            return notFound();
        }

    }
}
