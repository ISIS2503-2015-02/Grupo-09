package controllers;

import models.Datos;
import models.MoviBusVehiculo;
import models.Posicion;
import play.db.ebean.Model;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.map;

import java.util.Iterator;
import java.util.List;

/**
 * Created by USER on 10/10/2015.
 */
public class MapController extends Controller {

    public Result createMap(){

        List<MoviBusVehiculo> mobibuses = new Model.Finder(MoviBusVehiculo.class).all();
        List<Posicion> posiciones = new Model.Finder(Posicion.class).all();

        posiciones.clear();

        //Gran Estacion 4.647778, -74.101389
        double latGE = 4.647778;
        double longGE = -74.101389;
        posiciones.add(new Posicion("1",latGE, longGE));

        //Universidad de Los Andes
        double latUA = 4.601175;
        double longUA = -74.065661;
        posiciones.add(new Posicion("2", latUA, longUA));

        Iterator<MoviBusVehiculo> iter = mobibuses.iterator();
        while(iter.hasNext()){
            MoviBusVehiculo bus = iter.next();

            long idBus = bus.getId_vehiculo();
            String id = "ID: "+idBus;
            Datos nDatos = bus.getUltimosDatos();
            String longitud = nDatos.getGpsAltitud();
            double dLongitud = Double.parseDouble(longitud);
            String latitud = nDatos.getGpsLatitud();
            double dLatitud = Double.parseDouble(latitud);

            Posicion p = new Posicion(id,dLongitud,dLatitud);
            posiciones.add(p);
        }

        return ok(map.render(posiciones));
    }
}
