package models;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;

import javax.persistence.*;

/**
 * Created by gusal on 13/08/2015.
 */
@Entity
public class Vcub extends Model
{
    //------------------------------------------------------------------------
    // Constantes de estado
    //------------------------------------------------------------------------

    public final static String PRESTADA = "Prestada";
    public final static String LIBRE = "Libre";

    //------------------------------------------------------------------------
    //Finder
    //------------------------------------------------------------------------

    public static Finder finder = new com.avaje.ebean.Model.Finder(Datos.class);

    //------------------------------------------------------------------------
    // Atributos
    //------------------------------------------------------------------------

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id_vcub;

    private String estado; //Prestada,sustiduida o libre

    private Long id_estacion;

    private Long id_cliente;

    //------------------------------------------------------------------------
    // Constructores
    //------------------------------------------------------------------------

    public Vcub(){
    }

    public Vcub(String estado, Long id_estacion)
    {
        this.estado = estado;
        this.id_estacion = id_estacion;
    }

    //------------------------------------------------------------------------
    // Métodos
    //------------------------------------------------------------------------

    public Long getIdVcub( )
    {
        return id_vcub;
    }

    public void setIdVcub( Long idCvubs )
    {
        this.id_vcub = idCvubs;
    }

    public String getEstado( )
    {
        return estado;
    }

    public void setEstado( String estado )
    {
        this.estado = estado;
    }

    public Long getId_estacion()
    {
        return id_estacion;
    }

    public void setId_estacion(Long id_estacion)
    {
        this.id_estacion = id_estacion;
    }

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    //-------------------------------------------------
    // Métodos auxiliares
    //-------------------------------------------------

    public static Vcub bind(JsonNode j)
    {
        return  Json.fromJson(j, Vcub.class);
    }
}

    /**
    public static Vcub bind (JsonNode j){
        String estadoJs = j.findPath("estado").asText();
        String estacionJs = j.findPath("id_estacion").asText();

        Estacion estacion = (Estacion) new Model.Finder(Estacion.class).byId(estacionJs);

        Vcub vcub = new Vcub(estadoJs, estacion);

        return vcub;
    }

    public Vcub update(JsonNode j){
        estado = j.findPath("estado").asText();
        String estacionId = j.findPath("id_estacion").asText();

        id_estacion = (Estacion) new Model.Finder(Estacion.class).byId(estacionId);

        return this;
    }
     **/

