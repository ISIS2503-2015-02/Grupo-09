package models;

import com.fasterxml.jackson.databind.JsonNode;
import play.api.libs.json.Json;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Bdrangel10 on 16/08/2015.
 */
public class RevisionMecanica

{
    @Id
    private String id;

    private Date fechaRevision;
    private double costo_Revision;
    private double kilometraje;
    @ManyToOne
    private Vehiculo vehiculo;

    public RevisionMecanica(Date fechaRevision, double costo_Revision, double kilometraje, Vehiculo vehiculo) {
        this.fechaRevision = fechaRevision;
        this.costo_Revision = costo_Revision;
        this.kilometraje = kilometraje;
        this.vehiculo = vehiculo;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public Date getFechaRevision()
    {
        return fechaRevision;
    }

    public void setFechaRevision(Date fechaRevision)
    {
        this.fechaRevision = fechaRevision;
    }

    public double getCosto_Revision()
    {
        return costo_Revision;
    }

    public void setCosto_Revision(double costo_Revision)
    {
        this.costo_Revision = costo_Revision;
    }

    public double getKilometraje()
    {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje)
    {
        this.kilometraje = kilometraje;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }



    //DataBinder-------------------------------------------------------
    public static RevisionMecanica bind(JsonNode json)
    {
        return play.libs.Json.fromJson(json, RevisionMecanica.class);
    }
}
