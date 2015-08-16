package models;

/**
 * Created by gusal on 13/08/2015.
 */

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;

import javax.persistence.*;


@Entity
public class Estacion extends Model {

    @Id
    private String idEstacion;

    private String nombreEstacion;

    private String ubicacion;

    private int vcubsCapacity;

    public Estacion(){

    }

    public Estacion( String idEstacion, String nombreEstacion, String ubicacion, int vcubsCapacity )
    {
        this.idEstacion = idEstacion;
        this.nombreEstacion = nombreEstacion;
        this.ubicacion = ubicacion;
        this.vcubsCapacity = vcubsCapacity;
    }

    public String getIdEstacion()
    {
        return idEstacion;
    }

    public void setIdEstacion(String idEstacion)
    {
        this.idEstacion = idEstacion;
    }

    public String getNombreEstacion( )
    {
        return nombreEstacion;
    }

    public void setNombreEstacion( String nombreEstacion )
    {
        this.nombreEstacion = nombreEstacion;
    }

    public String getUbicacion( )
    {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion)
    {
        this.ubicacion = ubicacion;
    }

    //-------------------------------------------------------------------------------------
    // JsonNode
    //-------------------------------------------------------------------------------------

    //public Estacion( String idEstacion, String nombreEstacion, String ubicacion )

    public static Estacion bind(JsonNode j){

        String idEstacion = j.findPath("idEstacion").asText();
        String nombreEstacion = j.findPath("nombreEstacion").asText();
        String ubicacion = j.findPath("ubicacion").asText();
        int vcubsCapacity = j.findPath("vcubsCapacity").asInt();

        Estacion station = new Estacion(idEstacion,nombreEstacion,ubicacion,vcubsCapacity);

        return station;
    }
}
