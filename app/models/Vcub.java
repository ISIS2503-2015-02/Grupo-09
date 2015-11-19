package models;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

    public static final Model.Finder finder  = new com.avaje.ebean.Model.Finder(Datos.class);

    //------------------------------------------------------------------------
    // Atributos
    //------------------------------------------------------------------------

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idVcub;

    private String estado; //Prestada,sustiduida o libre

    private Long idEstacion;

    private Long idCliente;

    //------------------------------------------------------------------------
    // Constructores
    //------------------------------------------------------------------------

    public Vcub(){
        // Constructor vacío debido a ppersistencia.
    }

    public Vcub(String estado, Long idEstacion)
    {
        this.estado = estado;
        this.idEstacion = idEstacion;
    }

    //------------------------------------------------------------------------
    // Métodos
    //------------------------------------------------------------------------

    public Long getIdVcub( )
    {
        return idVcub;
    }

    public void setIdVcub( Long idCvubs )
    {
        this.idVcub = idCvubs;
    }

    public String getEstado( )
    {
        return estado;
    }

    public void setEstado( String estado )
    {
        this.estado = estado;
    }

    public Long getIdEstacion()
    {
        return idEstacion;
    }

    public void setIdEstacion(Long idEstacion)
    {
        this.idEstacion = idEstacion;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
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

