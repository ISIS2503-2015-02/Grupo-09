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
public class Trayecto extends Model
{
    public final static int EN_CURSO=1;
    public final static int FINALIZADO=0;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String id_trayecto;

    private String ruta;
    private Date hora_inicio;
    private Date hora_fin;
    private int incidentes;
    private int estado;
    private double duracion;

    @ManyToOne
    private Driver conductor;

    @ManyToOne
    private Vehiculo vehiculo;

    public Trayecto(String ruta, Date hora_inicio)
    {
        this.ruta = ruta;
        this.hora_inicio = hora_inicio;
        this.hora_fin = null;
        this.incidentes = 0;
        this.estado = EN_CURSO;
        if(hora_inicio==null)
        {
            hora_inicio=new Date();
        }
        duracion=0;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public Date getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(Date hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public Date getHora_fin() {
        return hora_fin;
    }


    public int getIncidentes() {
        return incidentes;
    }

    public void setIncidentes(int incidentes) {
        this.incidentes = incidentes;
    }

    public int getEstado() {
        return estado;
    }

    /**
     * Finaliza el trayecto
     * @param hora_fin    Hora final del trayecto, si es null toma la hora del sistema
     *@param nIncidentes Cantidad de incidentes que ocurrieron durante el trayecto
     */
    public void finalizarTrayecto(Date hora_fin, int nIncidentes){
        this.estado = FINALIZADO;
        this.hora_fin=hora_fin;
        if(hora_fin==null)
        {
            hora_fin=new Date();
        }
        incidentes=nIncidentes;
        getDuracion();
    }

    public Driver getConductor() {
        return conductor;
    }

    public void setConductor(Driver conductor) {
        this.conductor = conductor;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * Indica cuánto ha durado el trayecto
     * @return duracion Duración del trayecto en minutos.
     */
    public double getDuracion()
    {
        if(estado==FINALIZADO)
        {
            duracion= (hora_fin.getTime()-hora_inicio.getTime())/(1000*60);
        }
        return duracion;
    }

    //DataBinder-------------------------------------------------------
    public static Trayecto bind(JsonNode json)
    {
        return Json.fromJson(json, Trayecto.class);
    }


}
