package models;


import com.fasterxml.jackson.databind.JsonNode;
import play.db.ebean.Model;
import play.libs.Json;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by bdrangel10 on 17/08/2015.
 */
@Entity
public class TranviaVehiculo extends Vehiculo {


    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    public Long idVehiculo;

    public String modelo;

    public Date fechaCompra;

    public int estado;

    public int tipoVehiculo;

    @OneToOne
    @JoinColumn(name = "id_revision")
    public RevisionMecanica ultimaRevision;

    @OneToOne
    @JoinColumn(name = "id_datos")
    public Datos ultimosDatos;

    @OneToOne
    @JoinColumn(name = "id_emergencia")
    public Emergencia ultimaEmergencia;


    @OneToOne
    @JoinColumn(name = "id_trayecto")
    public Trayecto ultimoTrayecto;


    @Transient
    public double kilomDesdeUltimaReparacion;


    //------------------------------------------------------------------------
    //Finder
    //------------------------------------------------------------------------
    public static final Model.Finder finder  = new Finder(TranviaVehiculo.class);

    public TranviaVehiculo()
    {
        // Constructor vacío debido a ppersistencia.
    }

    public TranviaVehiculo(Long id, String modelo, Date fechaCompra, int estado)
    {
        super(id,modelo,fechaCompra,estado,Vehiculo.TRANVIA);
    }
    //DataBinder-------------------------------------------------------
    public static TranviaVehiculo bind(JsonNode json)
    {
        return Json.fromJson(json, TranviaVehiculo.class);
    }


}
