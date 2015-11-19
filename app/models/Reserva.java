package models;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by bdrangel10 on 16/08/2015.
 */
@Entity
public class Reserva extends Model {

    //------------------------------------------------------------------------
    //Finder
    //------------------------------------------------------------------------

    public static final Model.Finder finder  = new com.avaje.ebean.Model.Finder(Reserva.class);

    //------------------------------------------------------------------------
    //Constantes
    //------------------------------------------------------------------------

    public final static String CREADA="CREADA";
    public final static String CONFIRMADA="CONFIRMADA";
    public final static String CANCELADA="CANCELADA";

    //------------------------------------------------------------------------
    // Atributos
    //------------------------------------------------------------------------

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long idReserva;

    @Temporal(TemporalType.DATE)
    private Date horaReserva;

    @Temporal(TemporalType.DATE)
    private Date horaCreacion;

    private double costo;

    private String estado;

    private Long idMovibusReservado;

    private Long idCliente;

    public Reserva(){
        // Constructor vacío debido a ppersistencia.
    }

    public Reserva(Date horaReserva, double costo, Long cliente) {
        this.horaReserva = horaReserva;
        this.costo = costo;
        this.idMovibusReservado = null;
        this.idCliente = cliente;
        horaCreacion =new Date();
        estado=CREADA;
    }

    public Date getHoraReserva() {
        return horaReserva;
    }

    public void setHoraReserva(Date horaReserva) {
        this.horaReserva = horaReserva;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Long getIdMovibusReservado() {
        return idMovibusReservado;
    }

    public void setIdMovibusReservado(Long idMovibusReservado) {
        this.idMovibusReservado = idMovibusReservado;
    }

    public Long getIdReserva() {
        return idReserva;
    }

    public Date getHoraCreacion() {
        return horaCreacion;
    }

    public Long getIdCliente() {
        return idCliente;
    }


    //--------------------------------------------------------------------------------------------
    //DataBinder
    //--------------------------------------------------------------------------------------------
    public static Reserva bind(JsonNode json)
    {
        return Json.fromJson(json, Reserva.class);
    }
}
