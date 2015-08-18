package models;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;

import javax.persistence.Id;

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

    private Estacion estacion;

    public Vcub(){

    }

    public Vcub(String idCvub, String estado, Estacion estacion)
    {
        this.idVcub = idCvub;
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

    //-------------------------------------------------
    // Métodos auxiliares
    //-------------------------------------------------

    //public Vcub(String idCvub, String estado, Estacion estacion)

    public static Vcub bind (JsonNode j){
        String idVcub = j.findPath("idVcub").asText();
        String estado = j.findPath("estado").asText();
        String estacion = j.findPath("estacion").asText();

        Vcub vcub = new Vcub();

        return vcub;
    }
}
