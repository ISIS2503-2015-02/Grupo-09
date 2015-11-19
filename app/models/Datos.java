package models;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Usuario on 17/08/2015.
 */
@Entity
public class Datos extends Model
{

    //------------------------------------------------------------------------
    //Finder
    //------------------------------------------------------------------------
    public static final Model.Finder finder  = new com.avaje.ebean.Model.Finder(Datos.class);

    //------------------------------------------------------------------------
    //Constantes
    //------------------------------------------------------------------------

    @Enumerated
    public final static int TRANVIA=1;

    @Enumerated
    public final static int MOVIBUS=2;

    //------------------------------------------------------------------------
    //Atributos
    //------------------------------------------------------------------------

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long idDatos;

    private String gpsAltitud;

    private String gpsLatitud;

    @Temporal(TemporalType.DATE)
    private Date horaMedicion;

    private boolean sensorChoque;

    private double sensorTermico;

    private boolean botonPanico;

    private double kilometraje;

    private Long idVehiculo;

    //------------------------------------------------------------------------
    //Constructores
    //------------------------------------------------------------------------

    public Datos()
    {
        // Constructor vacío debido a ppersistencia.
    }

    public Datos(String gpsAltitud, String gpsLatitud, Date horaMedicion, boolean sensorChoque, double sensorTermico, boolean botonPanico, double kilometraje)
    {
        this.gpsAltitud = gpsAltitud;
        this.gpsLatitud = gpsLatitud;
        this.horaMedicion = horaMedicion;
        this.sensorChoque = sensorChoque;
        this.sensorTermico = sensorTermico;
        this.botonPanico = botonPanico;
        this.kilometraje = kilometraje;
    }

    //------------------------------------------------------------------------
    //Métodos
    //------------------------------------------------------------------------

    public Long getIdDatos() {
        return idDatos;
    }

    public void setId(Long id) {
        this.idDatos = id;
    }

    public String getGpsAltitud() {
        return gpsAltitud;
    }

    public void setGpsAltitud(String gpsAltitud) {
        this.gpsAltitud = gpsAltitud;
    }

    public String getGpsLatitud() {
        return gpsLatitud;
    }

    public void setGpsLatitud(String gpsLatitud) {
        this.gpsLatitud = gpsLatitud;
    }

    public Date getHoraMedicion() {
        return horaMedicion;
    }

    public void setHoraMedicion(Date horaMedicion) {
        this.horaMedicion = horaMedicion;
    }

    public boolean isSensorChoque() {
        return sensorChoque;
    }

    public void setSensorChoque(boolean sensorChoque) {
        this.sensorChoque = sensorChoque;
    }

    public double getSensorTermico() {
        return sensorTermico;
    }

    public void setSensorTermico(double sensorTermico) {
        this.sensorTermico = sensorTermico;
    }

    public boolean isBotonPanico() {
        return botonPanico;
    }

    public void setBotonPanico(boolean botonPanico) {
        this.botonPanico = botonPanico;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public Long getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Long idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    //-------------------------------------------------
    // Mtodos auxiliares
    //-------------------------------------------------

    /**
     * Retorna unos Datos con un veh�culo null.
     * @param j El JsonNode que contiene la informaci�n a ser convertida a Datos
     * @return
     */
   /* public static Datos bind (JsonNode j)
    {
        String gpsAltitudJs = j.findPath("gpsAltitud").asText();
        String gpsLatitudJs = j.findPath("gpsLatitud").asText();
        Date horaMedicionJs = new Date(j.findPath("horaMedicion").asLong());
        boolean sensorChoqueJs = j.findPath("sensorChoque").asBoolean();
        double sensorTermicoJs = j.findPath("sensorTermico").asDouble();
        boolean sensorPanicoJs = j.findPath("sensorPanico").asBoolean();
        double kilometrajeJs = j.findPath("kilometraje").asDouble();
        return new Datos(gpsAltitudJs,gpsLatitudJs,horaMedicionJs,sensorChoqueJs,sensorTermicoJs,sensorPanicoJs,kilometrajeJs,null);


    }*/

    public static Datos bind(JsonNode json)
    {
        return Json.fromJson(json, Datos.class);
    }
}
