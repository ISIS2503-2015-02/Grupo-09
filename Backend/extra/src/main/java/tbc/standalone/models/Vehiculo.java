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

    private Long idVehiculo;

    private String modelo;

    private Date fechaCompra;

    private int estado;

    private int tipoVehiculo;

    private RevisionMecanica ultimaRevision;

    private Datos ultimosDatos;

    private Emergencia ultimaEmergencia;

    private Trayecto ultimoTrayecto;

    private double kilomDesdeUltimaReparacion;

    public Vehiculo()
    {
        modelo="";
        fechaCompra =null;
        estado= DISPONIBLE;
        kilomDesdeUltimaReparacion=0;
    }

    public Vehiculo(Long id, String modelo, Date fechaCompra, int estado,int tipoVehiculo)
    {
        this.idVehiculo = id;
        this.modelo = modelo;
        this.fechaCompra = fechaCompra;
        this.estado=estado;
        this.tipoVehiculo =tipoVehiculo;
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

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
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

    public Long getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Long idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public int getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(int tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
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
