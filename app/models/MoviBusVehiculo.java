package models;


import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.collect.ArrayListMultimap;
import play.libs.Json;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by bdrangel10 on 17/08/2015.
 */
@Entity
public class MoviBusVehiculo extends Vehiculo {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    public long id_vehiculo;

    public String modelo;

    public Date fecha_compra;

    public int estado;

    public int tipo_vehiculo;

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
    public static Finder finder = new com.avaje.ebean.Model.Finder(MoviBusVehiculo.class);

    public MoviBusVehiculo()
    {

    }

    public MoviBusVehiculo(Long id, String modelo, Date fecha_compra, int estado)
    {
        super(id,modelo,fecha_compra,estado, Vehiculo.MOVIBUS);
    }


    //DataBinder-------------------------------------------------------
    public static MoviBusVehiculo bind(JsonNode json)
    {
        return Json.fromJson(json, MoviBusVehiculo.class);
    }


}
