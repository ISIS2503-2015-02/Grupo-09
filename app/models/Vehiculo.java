package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.JsonNode;

import javax.annotation.Nullable;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import play.libs.Json;
import play.db.ebean.Model;
/**
 * Created by bdrangel10 on 17/08/2015.
 */
@MappedSuperclass
//@JsonInclude(JsonInclude.Include.NON_NULL)

public class Vehiculo extends Model {

    public final static int EN_MARCHA=1;

    public final static int ACCIDENTE=2;

    public final static int DISPONIBLE =0;

    public static Finder finder = new com.avaje.ebean.Model.Finder(Vehiculo.class);

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private String id_vehiculo;

    private String modelo;

    private Date fecha_compra;

    private int estado;

    private String tipo_vehiculo;

    //    @OneToMany(mappedBy = "vehiculo"
//    @JsonInclude(JsonInclude.Include.NON_NULL)
//    @JsonIgnoreType(value = )
    @Transient
    private List<Emergencia> emergencias= new ArrayList<>();


    //@JsonManagedReference(value = "dato")
//    @OneToMany(mappedBy = "vehiculoGenerador",  cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @OneToMany

    @Transient
    private List<Datos> datos = new ArrayList<>() ;


//        @OneToMany(mappedBy = "vehiculo", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Transient
    private List<RevisionMecanica> revisiones = new ArrayList<>();



//    @OneToMany(mappedBy = "vehiculo")
    //@JsonManagedReference(value = "trayecto")
    @Transient
    private List<Trayecto> trayectos = new ArrayList<>();

//    @OneToOne
    private RevisionMecanica ultimaRevision;

//    @OneToOne
    private Datos ultimosDatos;

//    @OneToOne
    private Emergencia ultimaEmergencia;

//    @OneToOne
    private Trayecto ultimoTrayecto;


    private double kilomDesdeUltimaReparacion;

    public Vehiculo()
    {
        modelo="";
        fecha_compra=null;
        estado= DISPONIBLE;
        kilomDesdeUltimaReparacion=0;
        emergencias= new ArrayList<>();
        datos= new ArrayList<>();
        revisiones= new ArrayList<>();
        trayectos= new ArrayList<>();

    }

    public Vehiculo(String id, String modelo, Date fecha_compra, int estado,String tipoVehiculo)
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
        emergencias= new ArrayList<>();
        datos= new ArrayList<>();
        revisiones= new ArrayList<>();
        trayectos= new ArrayList<>();
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

    public List<Datos> getDatos() {
        return datos!=null?datos:new ArrayList<>();
    }


    public List<RevisionMecanica> getRevisiones() {
        return revisiones!=null?revisiones:new ArrayList<>();
    }

    public List<Emergencia> getEmergencias() {
        return emergencias!=null?emergencias:new ArrayList<>();
    }

    public List<Trayecto> getTrayectos() {
        return trayectos!=null?trayectos:new ArrayList<>();
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

    public String getId_vehiculo() {
        return id_vehiculo;
    }
    
    public static Vehiculo bind(JsonNode j)
    {
        return  Json.fromJson(j, Vehiculo.class);
    }

    public void agregarNuevaRevision(RevisionMecanica nuevaRev)
    {
        revisiones.add(nuevaRev);
        ultimaRevision=nuevaRev;
        this.save();
    }

    public void agregarDatos(Datos nuevoDato)
    {
        datos.add(nuevoDato);
        ultimosDatos=nuevoDato;
        double kil =darKilometrajeDesdeUltimaReparacion();
        kilomDesdeUltimaReparacion = kil!=-1?kil:nuevoDato.getKilometraje();
        this.save();
    }

    public void agregarEmergencia (Emergencia nuevaEmergencia)
    {
        emergencias.add(nuevaEmergencia);
        ultimaEmergencia=nuevaEmergencia;
        this.save();
    }

    public void agregarTrayecto(Trayecto nuevoTrayecto)
    {
        trayectos.add(nuevoTrayecto);
        ultimoTrayecto=nuevoTrayecto;
        this.save();
    }

    public double darKilometrajeDesdeUltimaReparacion()
    {
        double kil=-1;
        if(ultimaRevision!=null)
            kil = ultimosDatos.getKilometraje()-ultimaRevision.getKilometraje();
        return kil;
    }

    public void setId_vehiculo(String id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    public String getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    public void setTipo_vehiculo(String tipo_vehiculo) {
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

    public double getKilomDesdeUltimaReparacion() {
        return kilomDesdeUltimaReparacion;
    }

    public void setKilomDesdeUltimaReparacion(double kilomDesdeUltimaReparacion) {
        this.kilomDesdeUltimaReparacion = kilomDesdeUltimaReparacion;
    }


}
