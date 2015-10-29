package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;

/**
 * Created by USER on 10/10/2015.
 */
@Entity
public class Posicion {

    public String idVehiculo;

    public double longitud;

    public double latitud;

    public static Model.Finder finder = new com.avaje.ebean.Model.Finder(Posicion.class);

    public Posicion(String id, double longitud, double latitud){
        idVehiculo=id;
        this.longitud = longitud;
        this.latitud = latitud;
    }

}
