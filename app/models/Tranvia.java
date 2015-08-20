package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;
import models.*;
import java.io.*;

/**
 * Created by gusal on 13/08/2015.
 */

@Entity
public class Tranvia extends Model
{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String idTranvia;

    private Linea linea;

    private String estado;

    private Emergencia magnitudEmergencia; // Si está en nivel 0 quiere decir que no hay emergencia, manejemoslo de 0 a 5.

    private Driver conductor;

    public Tranvia(Linea linea, String estado, Emergencia magnitudEmergencia, Driver conductor )
    {
        this.linea = linea;
        this.estado = estado;
        this.magnitudEmergencia = magnitudEmergencia;
        this.conductor = conductor;
    }

    /**
     * Metodo que retorna el id del tranvía
     * @return idTranvia
     */
    public String getId( )
    {
        return idTranvia;
    }

    /**
     * Método que registra el id del tranvía
     * @param idTranvia
     */
    public void setId(String idTranvia)
    {
        this.idTranvia = idTranvia;
    }

    /**
     * Metodo que retorna la línea en la que transita el tranvía
     * @return linea
     */
    public Linea getLinea( )
    {
        return linea;
    }

    /**
     * Método que registra la línea en la que transita el tranvía
     * @param linea
     */
    public void setLinea(Linea linea)
    {
        this.linea = linea;
    }

    /**
     * Metodo que retorna el estado en el que se encuentra el tranvía
     * @return estado
     */
    public String getEstado( )
    {
        return estado;
    }

    /**
     * Método que registra el estado en el que está el tranvía
     * @param estado
     */
    public void setEstado(String estado)
    {
        this.estado = estado;
    }

    /**
     * Metodo que retorna la magnitud de la emergencia en la que está el tranvía
     * @return magnitudEmergencia
     */
    public Emergencia getEmergencia( )
    {
        return magnitudEmergencia;
    }

    /**
     * Método que registra la magnitud de la emergencia en la que está el tranvía
     * @param magnitudEmergencia
     */
    public void setLinea(Emergencia magnitudEmergencia)
    {
        this.magnitudEmergencia = magnitudEmergencia;
    }

    /**
     * Metodo que retorna al conductor del tranvía
     * @return conductor
     */
    public Driver getDriver( )
    {
        return conductor;
    }

    /**
     * Método que registra al conductor del tranvía
     * @param conductor
     */
    public void setDriver(Driver conductor)
    {
        this.conductor = conductor;
    }

    /**
     * Mapea la información obtenida del Json a una instancia de este objeto
     */
    public static Tranvia bind(JsonNode j) {

        Linea lineaJs = Linea.forValue(j.findParent("linea").asText());

        String estadoJs = j.findPath(("estado")).asText();

        String idConductor = j.findPath("idConductor").asText();

        Driver driverJs = (Driver) new Model.Finder(Driver.class).byId(idConductor);

        Tranvia t = new Tranvia(lineaJs, estadoJs, null, driverJs);

        return t;

    }

    public Tranvia update(JsonNode j) {

        linea = Linea.forValue(j.findParent("linea").asText());

        estado = j.findPath(("estado")).asText();

        String idConductor = j.findPath("idConductor").asText();

        conductor = (Driver) new Model.Finder(Driver.class).byId(idConductor);


        return this;
    }


}
