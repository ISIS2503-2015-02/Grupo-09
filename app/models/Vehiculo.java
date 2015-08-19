package models;

import com.fasterxml.jackson.databind.JsonNode;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import play.libs.Json;
/**
 * Created by bdrangel10 on 17/08/2015.
 */
@Entity
public class Vehiculo extends Model {

    public final static int EN_MARCHA=1;

    public final static int ACCIDENTE=2;

    public final static int FUERA_DE_SERVICIO=0;

    @Id
    private String id_vehiculo;

    private String modelo;

    private Date fecha_compra;

    private int estado;

    @OneToMany
    private List<RevisionMecanica> revisiones;

    @OneToMany
    private List<Datos> datos;

    @OneToMany
    private List<Emergencia> emergencias;

    private RevisionMecanica ultimaRevision;

    private Datos ultimosDatos;

    private Emergencia ultimaEmergencia;

    public Vehiculo()
    {
        modelo="";
        fecha_compra=null;
        estado=FUERA_DE_SERVICIO;
    }

    public Vehiculo(String id, String modelo, Date fecha_compra, int estado)
    {
        this.id_vehiculo = id;
        this.modelo = modelo;
        this.fecha_compra = fecha_compra;
        this.estado=estado;
        revisiones=new ArrayList<RevisionMecanica>();
        datos = new ArrayList<Datos>();
        emergencias = new ArrayList<Emergencia>();
        ultimaRevision = null;
        ultimosDatos = null;
        ultimaEmergencia = null;
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
        return datos;
    }

    public List<RevisionMecanica> getRevisiones() {
        return revisiones;
    }

    public List<Emergencia> getEmergencias() {
        return emergencias;
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
        this.save();
    }

    public void agregarEmergencia (Emergencia nuevaEmergencia)
    {
        emergencias.add(nuevaEmergencia);
        ultimaEmergencia=nuevaEmergencia;
        this.save();
    }

    public double darKilometrajeDesdeUltimaReparacion()
    {
        return ultimosDatos.getKilometraje()-ultimaRevision.getKilometraje();
    }


}
