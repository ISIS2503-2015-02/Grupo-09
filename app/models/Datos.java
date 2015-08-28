package models;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.JsonNode;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Usuario on 17/08/2015.
 */
@Entity
public class Datos extends Model
{
    @Enumerated
    public final static int TRANVIA=1;

    @Enumerated
    public final static int MOVIBUS=2;

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private String idDatos;

    private String gpsAltitud;

    private String gpsLatitud;

    @Temporal(TemporalType.DATE)
    private Date horaMedicion;

    private boolean sensorChoque;

    private double sensorTermico;

    private boolean botonPanico;

    private double kilometraje;


//    @JsonBackReference(value = "dato")
//    @ManyToOne
    @JsonIgnoreProperties
    private Vehiculo vehiculoGenerador;

    public Datos() {
    }



    public Datos(String gpsAltitud, String gpsLatitud, Date horaMedicion, boolean sensorChoque, double sensorTermico, boolean botonPanico, double kilometraje, Vehiculo vehiculoGenerador) {
        this.gpsAltitud = gpsAltitud;
        this.gpsLatitud = gpsLatitud;
        this.horaMedicion = horaMedicion;
        this.sensorChoque = sensorChoque;
        this.sensorTermico = sensorTermico;
        this.botonPanico = botonPanico;
        this.kilometraje = kilometraje;
        this.vehiculoGenerador = vehiculoGenerador;
    }

    public String getId() {
        return idDatos;
    }

    public void setId(String id) {
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

    public Vehiculo getVehiculoGenerador() {
        return vehiculoGenerador;
    }

    public void setVehiculoGenerador(Vehiculo vehiculoGenerador) {
        this.vehiculoGenerador = vehiculoGenerador;
    }

    public String getIdDatos() {
        return idDatos;
    }

    public void setIdDatos(String idDatos) {
        this.idDatos = idDatos;
    }

    //-------------------------------------------------
    // Mtodos auxiliares
    //-------------------------------------------------

    /**
     * Retorna unos Datos con un veh�culo null.
     * @param j El JsonNode que contiene la informaci�n a ser convertida a Datos
     * @return
     */
    public static Datos bind (JsonNode j)
    {
        String gpsAltitudJs = j.findPath("gpsAltitud").asText();
        String gpsLatitudJs = j.findPath("gpsLatitud").asText();
        Date horaMedicionJs = new Date(j.findPath("horaMedicion").asLong());
        boolean sensorChoqueJs = j.findPath("sensorChoque").asBoolean();
        double sensorTermicoJs = j.findPath("sensorTermico").asDouble();
        boolean sensorPanicoJs = j.findPath("sensorPanico").asBoolean();
        double kilometrajeJs = j.findPath("kilometraje").asDouble();
        return new Datos(gpsAltitudJs,gpsLatitudJs,horaMedicionJs,sensorChoqueJs,sensorTermicoJs,sensorPanicoJs,kilometrajeJs,null);


    }
}
