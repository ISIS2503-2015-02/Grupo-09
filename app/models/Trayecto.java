package models;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    //------------------------------------------------------------------------
    //Finder
    //------------------------------------------------------------------------
    public static Finder finder = new com.avaje.ebean.Model.Finder(Trayecto.class);

    //------------------------------------------------------------------------
    //Constantes
    //------------------------------------------------------------------------

    @Enumerated
    public final static int EN_CURSO=1;
    @Enumerated
    public final static int FINALIZADO=0;

    //------------------------------------------------------------------------
    //Atributos
    //------------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id_trayecto;

    private String ruta;

    @Temporal(TemporalType.DATE)
    private Date hora_inicio;

    @Temporal(TemporalType.DATE)
    private Date hora_fin;

    private int incidentes;

    private int estado;

    @Transient
    private double duracion;

    private Long id_conductor;

    private Long id_vehiculo;

    //------------------------------------------------------------------------
    //Constructores
    //------------------------------------------------------------------------

    public Trayecto() {
    }

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
    }

    //------------------------------------------------------------------------
    //Métodos
    //------------------------------------------------------------------------


    public Long getId_trayecto() {
        return id_trayecto;
    }

    public void setId_trayecto(Long id_trayecto) {
        this.id_trayecto = id_trayecto;
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

    public void setHora_fin(Date hora_fin) {
        this.hora_fin = hora_fin;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }


    public Long getId_conductor() {
        return id_conductor;
    }

    public void setId_conductor(Long id_conductor) {
        this.id_conductor = id_conductor;
    }

    public Long getId_vehiculo() {
        return id_vehiculo;
    }

    public void setId_vehiculo(Long id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
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
        return -1;
    }

    //DataBinder-------------------------------------------------------
    public static Trayecto bind(JsonNode json)
    {
        return Json.fromJson(json, Trayecto.class);
    }


}
