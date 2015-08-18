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

    private String GPS_altitud;

    private String GPS_latitud;

    private Date hora_medicion;

    private boolean sensor_choque;

    private double sensor_termino;

    private boolean boton_panico;

    private double kilometraje;

    private MoviBus moviBus;

    private Tranvia tranvia;

    private int tipo_Vehiculo;

    public Datos(String id, String GPS_altitud, String GPS_latitud, Date hora_medicion, boolean sensor_choque,
                 double sensor_termino, boolean boton_panico, double kilometraje,  MoviBus moviBus)
    {
        this.id = id;
        this.GPS_altitud = GPS_altitud;
        this.GPS_latitud = GPS_latitud;
        this.hora_medicion = hora_medicion;
        this.sensor_choque = sensor_choque;
        this.sensor_termino = sensor_termino;
        this.boton_panico = boton_panico;
        this.kilometraje = kilometraje;
        this.tipo_Vehiculo = tipo_Vehiculo;
        this.moviBus = moviBus;
        this.tranvia=null;
        tipo_Vehiculo=MOVIBUS;
    }

    public Datos(String id, String GPS_altitud, String GPS_latitud, Date hora_medicion, boolean sensor_choque,
                 double sensor_termino, boolean boton_panico, double kilometraje, Tranvia tranvia)
    {
        this.id = id;
        this.GPS_altitud = GPS_altitud;
        this.GPS_latitud = GPS_latitud;
        this.hora_medicion = hora_medicion;
        this.sensor_choque = sensor_choque;
        this.sensor_termino = sensor_termino;
        this.boton_panico = boton_panico;
        this.kilometraje = kilometraje;
        this.tranvia = tranvia;
        this.moviBus=null;
        this.tipo_Vehiculo = tipo_Vehiculo;
        tipo_Vehiculo=TRANVIA;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGPS_altitud() {
        return GPS_altitud;
    }

    public void setGPS_altitud(String GPS_altitud) {
        this.GPS_altitud = GPS_altitud;
    }

    public String getGPS_latitud() {
        return GPS_latitud;
    }

    public void setGPS_latitud(String GPS_latitud) {
        this.GPS_latitud = GPS_latitud;
    }

    public Date getHora_medicion() {
        return hora_medicion;
    }

    public void setHora_medicion(Date hora_medicion) {
        this.hora_medicion = hora_medicion;
    }

    public boolean isSensor_choque() {
        return sensor_choque;
    }

    public void setSensor_choque(boolean sensor_choque) {
        this.sensor_choque = sensor_choque;
    }

    public double getSensor_termino() {
        return sensor_termino;
    }

    public void setSensor_termino(double sensor_termino) {
        this.sensor_termino = sensor_termino;
    }

    public boolean isBoton_panico() {
        return boton_panico;
    }

    public void setBoton_panico(boolean boton_panico) {
        this.boton_panico = boton_panico;
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

    public int getTipo_Vehiculo() {
        return tipo_Vehiculo;
    }

    public void setTipo_Vehiculo(int tipo_Vehiculo) {
        this.tipo_Vehiculo = tipo_Vehiculo;
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
