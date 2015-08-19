package models;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * Created by gusal on 13/08/2015.
 */
public class Vcub extends Model
{
    //------------------------------------------------------------------------
    // Constantes de estado
    //------------------------------------------------------------------------

    public final static String PRESTADA = "Prestada";
    public final static String SUSTITUIDA = "Sustituida";
    public final static String LIBRE = "Libre";

    //------------------------------------------------------------------------
    // Atributos
    //------------------------------------------------------------------------

    @Id
    private String idVcub;

    private String estado; //Prestada,sustiduida o libre

    @ManyToOne
    private Estacion estacion;

    @OneToOne
    @JoinColumn(name = "userID", nullable = false)
    private User cliente;

    public Vcub(){
    }

    public Vcub(String estado, Estacion estacion)
    {
        this.estado = estado;
        this.estacion = estacion;
    }

    public String getIdCvubs( )
    {
        return idVcub;
    }

    public void setIdCvubs( String idCvubs )
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

    public Estacion getEstacion( )
    {
        return estacion;
    }

    public void setEstacion(Estacion estacion)
    {
        this.estacion = estacion;
    }

    public User getCliente() {
        return cliente;
    }

    public void setCliente(User cliente) {
        this.cliente = cliente;
    }

    //-------------------------------------------------
    // Métodos auxiliares
    //-------------------------------------------------

    //public Vcub(String idCvub, String estado, Estacion estacion)

    public static Vcub bind (JsonNode j){
        String estadoJs = j.findPath("estado").asText();
        String estacionJs = j.findPath("estacion").asText();

        Estacion estacion = (Estacion) new Model.Finder(Estacion.class).byId(estacionJs);

        Vcub vcub = new Vcub(estadoJs, estacion);

        return vcub;
    }

    public Vcub update(JsonNode j){
        estado = j.findPath("estado").asText();
        String estacionId = j.findPath("estacion").asText();

        estacion = (Estacion) new Model.Finder(Estacion.class).byId(estacionId);

        return this;
    }
}
