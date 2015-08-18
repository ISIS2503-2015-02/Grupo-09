package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.util.Date;

/**
 * Created by bdrangel10 on 17/08/2015.
 */
@Entity
public class Vehiculo {

    public final static int EN_MARCHA=1;

    public final static int ACCIDENTE=2;

    public final static int FUERA_DE_SERVICIO=0;

    @Id
    private String id_vehiculo;

    private String modelo;

    private Date fecha_compra;

    private int estado;

    public Vehiculo(String id, String modelo, Date fecha_compra, int estado)
    {
        this.id_vehiculo = id;
        this.modelo = modelo;
        this.fecha_compra = fecha_compra;
        this.estado=estado;
    }

    public String getId() {
        return id_vehiculo;
    }

    public void setId(String id) {
        this.id_vehiculo = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }


}
