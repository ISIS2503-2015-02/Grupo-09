package tbc.standalone.models;

import java.util.Date;

/**
 * Created by Usuario on 17/08/2015.
 */

public class Datos
{

    //------------------------------------------------------------------------
    //Constantes
    //------------------------------------------------------------------------

    public final static int TRANVIA=1;

    public final static int MOVIBUS=2;

    //------------------------------------------------------------------------
    //Atributos
    //------------------------------------------------------------------------

    private Long id_datos;

    private String gpsAltitud;

    private String gpsLatitud;

    private Date horaMedicion;

    private boolean sensorChoque;

    private double sensorTermico;

    private boolean botonPanico;

    private double kilometraje;

    private Long id_vehiculo;

    //------------------------------------------------------------------------
    //Constructores
    //------------------------------------------------------------------------

    public Datos()
    {
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

    public Long getId_datos() {
        return id_datos;
    }

    public void setId(Long id) {
        this.id_datos = id;
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

    public Long getId_vehiculo() {
        return id_vehiculo;
    }

    public void setId_vehiculo(Long id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }
}
