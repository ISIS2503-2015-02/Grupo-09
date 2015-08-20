package models;


import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.collect.ArrayListMultimap;
import play.libs.Json;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by bdrangel10 on 17/08/2015.
 */
@Entity
public class MoviBusVehiculo extends Vehiculo {


    public static Finder finder = new com.avaje.ebean.Model.Finder(MoviBusVehiculo.class);

    public MoviBusVehiculo(String id, String modelo, Date fecha_compra, int estado)
    {
        super(id,modelo,fecha_compra,estado,"MoviBus");
    }


    //DataBinder-------------------------------------------------------
    public static MoviBusVehiculo bind(JsonNode json)
    {
        return Json.fromJson(json, MoviBusVehiculo.class);
    }


}
