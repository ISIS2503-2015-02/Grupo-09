package tbc.standalone.models;


import java.util.Date;

/**
 * Created by bdrangel10 on 16/08/2015.
 */
public class Reserva {

    //------------------------------------------------------------------------
    //Constantes
    //------------------------------------------------------------------------

    public final static String CREADA="CREADA";
    public final static String CONFIRMADA="CONFIRMADA";
    public final static String CANCELADA="CANCELADA";

    //------------------------------------------------------------------------
    // Atributos
    //------------------------------------------------------------------------
    private Long id_reserva;

    private Date hora_reserva;

    private Date hora_creacion;

    private double costo;

    private String estado;

    private Long id_movibus_reservado;

    private Long id_cliente;

    public Reserva(){

    }

    public Reserva(Date hora_reserva, double costo, Long cliente) {
        this.hora_reserva = hora_reserva;
        this.costo = costo;
        this.id_movibus_reservado = null;
        this.id_cliente = cliente;
        hora_creacion=new Date();
        estado=CREADA;
    }

    public Date getHora_reserva() {
        return hora_reserva;
    }

    public void setHora_reserva(Date hora_reserva) {
        this.hora_reserva = hora_reserva;
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

    public Long getId_movibus_reservado() {
        return id_movibus_reservado;
    }

    public void setId_movibus_reservado(Long id_movibus_reservado) {
        this.id_movibus_reservado = id_movibus_reservado;
    }

    public Long getId_reserva() {
        return id_reserva;
    }

    public Date getHora_creacion() {
        return hora_creacion;
    }

    public Long getId_cliente() {
        return id_cliente;
    }

}
