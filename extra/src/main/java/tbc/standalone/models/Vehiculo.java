package tbc.standalone.models;

import java.util.Date;
/**
 * Created by bdrangel10 on 17/08/2015.
 */

public class Vehiculo {

    //------------------------------------------------------------------------
    //Constantes
    //------------------------------------------------------------------------

    public final static int EN_MARCHA=1;

    public final static int ACCIDENTE=2;

    public final static int DISPONIBLE =0;

    public final static int MOVIBUS=0;

    public final static int TRANVIA=1;

    //------------------------------------------------------------------------
    //ATRIBUTOS
    //------------------------------------------------------------------------

    private Long id_vehiculo;

    private String modelo;

    private Date fecha_compra;

    private int estado;

    private int tipo_vehiculo;

    private RevisionMecanica ultimaRevision;

    private Datos ultimosDatos;

    private Emergencia ultimaEmergencia;

    private Trayecto ultimoTrayecto;

    private double kilomDesdeUltimaReparacion;

    public Vehiculo()
    {
        modelo="";
        fecha_compra=null;
        estado= DISPONIBLE;
        kilomDesdeUltimaReparacion=0;
    }

    public Vehiculo(Long id, String modelo, Date fecha_compra, int estado,int tipoVehiculo)
    {
        this.id_vehiculo = id;
        this.modelo = modelo;
        this.fecha_compra = fecha_compra;
        this.estado=estado;
        this.tipo_vehiculo=tipoVehiculo;
        ultimaRevision = null;
        ultimosDatos = null;
        ultimaEmergencia = null;
        ultimoTrayecto=null;
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

    public RevisionMecanica getUltimaRevision() {
        return ultimaRevision;
    }

    public Datos getUltimosDatos() {
        return ultimosDatos;
    }

    public Emergencia getUltimaEmergencia() {
        return ultimaEmergencia;
    }

    public Trayecto getUltimoTrayecto() {
        return ultimoTrayecto;
    }

    public Long getId_vehiculo() {
        return id_vehiculo;
    }

    public void setId_vehiculo(Long id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    public int getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    public void setTipo_vehiculo(int tipo_vehiculo) {
        this.tipo_vehiculo = tipo_vehiculo;
    }

    public void setUltimaRevision(RevisionMecanica ultimaRevision) {
        this.ultimaRevision = ultimaRevision;
    }

    public void setUltimosDatos(Datos ultimosDatos) {
        this.ultimosDatos = ultimosDatos;
       }

    public void setUltimaEmergencia(Emergencia ultimaEmergencia) {
        this.ultimaEmergencia = ultimaEmergencia;
    }

    public void setUltimoTrayecto(Trayecto ultimoTrayecto) {
        this.ultimoTrayecto = ultimoTrayecto;
    }

    public double getKilomDesdeUltimaReparacion()
    {
        double kil=0;
        if(ultimosDatos!=null)
        {
            if(ultimaRevision!=null)
                kil = ultimosDatos.getKilometraje()-ultimaRevision.getKilometraje();
            else
                kil=ultimosDatos.getKilometraje();
        }
        return kil;
    }
}
