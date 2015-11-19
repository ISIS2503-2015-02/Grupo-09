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
public class Trayecto extends Model{

    //------------------------------------------------------------------------
    //Finder
    //------------------------------------------------------------------------
    public static final Model.Finder finder  = new com.avaje.ebean.Model.Finder(Trayecto.class);

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
    private Long idTrayecto;

    private String ruta;

    @Temporal(TemporalType.DATE)
    private Date horaInicio;

    @Temporal(TemporalType.DATE)
    private Date horaFin;

    private int incidentes;

    private int estado;

    @Transient
    private double duracion;

    private Long idConductor;

    private Long idVehiculo;

    //------------------------------------------------------------------------
    //Constructores
    //------------------------------------------------------------------------

    public Trayecto() {
        // Constructor vacío debido a ppersistencia.
    }

    public Trayecto(String ruta, Date horaInicio)
    {
        this.ruta = ruta;
        this.horaInicio = horaInicio;
        this.horaFin = null;
        this.incidentes = 0;
        this.estado = EN_CURSO;
        if(horaInicio ==null)
        {
            horaInicio =new Date();
        }
    }

    //------------------------------------------------------------------------
    //Métodos
    //------------------------------------------------------------------------


    public Long getIdTrayecto() {
        return idTrayecto;
    }

    public void setIdTrayecto(Long idTrayecto) {
        this.idTrayecto = idTrayecto;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFin() {
        return horaFin;
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

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }


    public Long getIdConductor() {
        return idConductor;
    }

    public void setIdConductor(Long idConductor) {
        this.idConductor = idConductor;
    }

    public Long getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Long idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    /**
     * Indica cuánto ha durado el trayecto
     * @return duracion Duración del trayecto en minutos.
     */
    public double getDuracion()
    {
        if(estado==FINALIZADO)
        {
            duracion= (horaFin.getTime()- horaInicio.getTime())/(1000*60);
        }
        return -1;
    }

    //DataBinder-------------------------------------------------------
    public static Trayecto bind(JsonNode json)
    {
        return Json.fromJson(json, Trayecto.class);
    }


}
