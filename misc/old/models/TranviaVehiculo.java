package models;


import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;

import javax.persistence.Entity;
import java.util.Date;

/**
 * Created by bdrangel10 on 17/08/2015.
 */
@Entity
public class TranviaVehiculo extends Vehiculo {

    //------------------------------------------------------------------------
    //Finder
    //------------------------------------------------------------------------
    public static Finder finder = new Finder(TranviaVehiculo.class);

    public TranviaVehiculo()
    {

    }

    public TranviaVehiculo(Long id, String modelo, Date fecha_compra, int estado)
    {
        super(id,modelo,fecha_compra,estado,Vehiculo.TRANVIA);
    }
    //DataBinder-------------------------------------------------------
    public static TranviaVehiculo bind(JsonNode json)
    {
        return Json.fromJson(json, TranviaVehiculo.class);
    }


}
