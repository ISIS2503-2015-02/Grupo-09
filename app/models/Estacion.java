package models;

/**
 * Created by gusal on 13/08/2015.
 */

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Estacion extends Model {
    //------------------------------------------------------------------------
    //Finder
    //------------------------------------------------------------------------

    public static final Model.Finder finder  = new com.avaje.ebean.Model.Finder(Estacion.class);

    //------------------------------------------------------------------------
    //Atributos
    //------------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long idEstacion;

    private String nombreEstacion;

    private String ubicacion;

    private int vcubsCapacity;

    @Transient
    private List vcubs;

    public Estacion() {
        // Constructor vacío debido a ppersistencia.
    }


    public Estacion( Long idEstacion, String nombreEstacion, String ubicacion, int vcubsCapacity )
    {
        this.idEstacion = idEstacion;
        this.nombreEstacion = nombreEstacion;
        this.ubicacion = ubicacion;
        this.vcubsCapacity = vcubsCapacity;
        vcubs = new ArrayList<Vcub>();
    }

    public Long getIdEstacion()
    {
        return idEstacion;
    }

    public void setIdEstacion(Long idEstacion)
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

    public int getVcubsCapacity() {
        return vcubsCapacity;
    }

    public void setVcubsCapacity(int vcubsCapacity) {
        this.vcubsCapacity = vcubsCapacity;
    }

    public List<Vcub> getVcubs() {
        return Vcub.finder.where().eq("id_estacion", idEstacion).findList();
    }


    //-------------------------------------------------------------------------------------
    // JsonNode
    //-------------------------------------------------------------------------------------

    //public Estacion( String idEstacion, String nombreEstacion, String ubicacion )

    public static Estacion bind(JsonNode json){

        /**
         String idEstacion = j.findPath("idEstacion").asText();
         String nombreEstacion = j.findPath("nombreEstacion").asText();
         String ubicacion = j.findPath("ubicacion").asText();
         int vcubsCapacity = j.findPath("vcubsCapacity").asInt();

         Estacion station = new Estacion(idEstacion,nombreEstacion,ubicacion,vcubsCapacity);

         return station;
         */
        return Json.fromJson(json, Estacion.class);

    }
}
