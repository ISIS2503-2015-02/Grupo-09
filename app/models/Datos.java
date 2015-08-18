package models;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Usuario on 17/08/2015.
 */
@Entity
public class Datos
{
    public final static int TRANVIA=1;
    public final static int MOVIBUS=2;

    @Id
    private String id;

    private String gpsAltitud;

    private String gpsLatitud;

    private Date horaMedicion;

    private boolean sensorChoque;

    private double sensorTermico;

    private boolean botonPanico;

    private double kilometraje;

    private MoviBus moviBus;

    private Tranvia tranvia;

    private int tipoVehiculo;

    public Datos(String id, String gpsAltitud, String gpsLatitud, Date horaMedicion, boolean sensorChoque,
                 double sensorTermico, boolean botonPanico, double kilometraje,  MoviBus moviBus)
    {
        this.id = id;
        this.gpsAltitud = gpsAltitud;
        this.gpsLatitud = gpsLatitud;
        this.horaMedicion = horaMedicion;
        this.sensorChoque = sensorChoque;
        this.sensorTermico = sensorTermico;
        this.botonPanico = botonPanico;
        this.kilometraje = kilometraje;
        this.tipoVehiculo = tipoVehiculo;
        this.moviBus = moviBus;
        this.tranvia=null;
        tipoVehiculo =MOVIBUS;
    }

    public Datos(String id, String gpsAltitud, String gpsLatitud, Date horaMedicion, boolean sensorChoque,
                 double sensorTermico, boolean botonPanico, double kilometraje, Tranvia tranvia)
    {
        this.id = id;
        this.gpsAltitud = gpsAltitud;
        this.gpsLatitud = gpsLatitud;
        this.horaMedicion = horaMedicion;
        this.sensorChoque = sensorChoque;
        this.sensorTermico = sensorTermico;
        this.botonPanico = botonPanico;
        this.kilometraje = kilometraje;
        this.tranvia = tranvia;
        this.moviBus=null;
        this.tipoVehiculo = tipoVehiculo;
        tipoVehiculo =TRANVIA;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public MoviBus getMoviBus() {
        return moviBus;
    }

    public void setMoviBus(MoviBus moviBus) {
        this.moviBus = moviBus;
    }

    public Tranvia getTranvia() {
        return tranvia;
    }

    public void setTranvia(Tranvia tranvia) {
        this.tranvia = tranvia;
    }

    public int getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(int tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    //-------------------------------------------------
    // Mtodos auxiliares
    //-------------------------------------------------

    public static Datos bind (JsonNode j)
    {
        String idJs = j.findPath("vehiculoId").asText();
        String gpsAltitudJs = j.findPath("gpsAltitud").asText();
        String gpsLatitudJs = j.findPath("gpsLatitud").asText();
        Date horaMedicionJs = new Date(j.findPath("horaMedicion").asLong());
        boolean sensorChoqueJs = j.findPath("sensorChoque").asBoolean();
        double sensorTermicoJs = j.findPath("sensorTermico").asDouble();
        boolean sensorPanicoJs = j.findPath("sensorPanico").asBoolean();
        double kilometrajeJs = j.findPath("kilometraje").asDouble();
        int tipoVehiculoJs = j.findPath("tipoVehiculo").asInt();

        if(tipoVehiculoJs == 1) {
            Tranvia t = (Tranvia) new Model.Finder(Tranvia.class).byId(idJs);
            return new Datos(idJs, gpsAltitudJs, gpsLatitudJs, horaMedicionJs, sensorChoqueJs, sensorTermicoJs,
                    sensorPanicoJs, kilometrajeJs, t);
        }

        MoviBus m = (MoviBus) new Model.Finder(MoviBus.class).byId(idJs);
        return new Datos(idJs, gpsAltitudJs, gpsLatitudJs, horaMedicionJs, sensorChoqueJs, sensorTermicoJs,
                sensorPanicoJs, kilometrajeJs, m);

    }
}
