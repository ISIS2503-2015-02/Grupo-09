package models;

/**
 * Created by gusal on 13/08/2015.
 */

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import play.libs.Json;


@Entity
public class Estacion extends Model {
    //------------------------------------------------------------------------
    //Finder
    //------------------------------------------------------------------------

    public static Finder finder = new com.avaje.ebean.Model.Finder(Estacion.class);

    //------------------------------------------------------------------------
    //Atributos
    //------------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id_estacion;

    private String nombreEstacion;

    private String ubicacion;

    private int vcubsCapacity;

    @Transient
    private List vcubs;

    public Estacion() {
    }


    public Estacion( Long idEstacion, String nombreEstacion, String ubicacion, int vcubsCapacity )
    {
        this.id_estacion = idEstacion;
        this.nombreEstacion = nombreEstacion;
        this.ubicacion = ubicacion;
        this.vcubsCapacity = vcubsCapacity;
        vcubs = new ArrayList<Vcub>();
    }

    public Long getId_estacion()
    {
        return id_estacion;
    }

    public void setId_estacion(Long idEstacion)
    {
        this.id_estacion = idEstacion;
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
        return Vcub.finder.where().eq("id_estacion",id_estacion).findList();
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
