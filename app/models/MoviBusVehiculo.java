package models;


import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.collect.ArrayListMultimap;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by bdrangel10 on 17/08/2015.
 */

public class MoviBusVehiculo extends Vehiculo {



    public MoviBusVehiculo(String id, String modelo, Date fecha_compra, int estado)
    {
        super(id,modelo,fecha_compra,estado);
    }

    public static MoviBusVehiculo bind (JsonNode j)
    {
        String pModelo=j.findPath("modelo").asText();
        String pId=j.findPath("id_vehiculo").asText();
        Date fechac= null;
        int estado = j.findPath("estado").asInt();

        return new MoviBusVehiculo(pId,pModelo,fechac,estado);
    }


}
