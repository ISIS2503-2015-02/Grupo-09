package models;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Bdrangel10 on 16/08/2015.
 */
@Entity
public class RevisionMecanica extends Model
{

    //------------------------------------------------------------------------
    //Finder
    //------------------------------------------------------------------------

    public static Model.Finder finder = new com.avaje.ebean.Model.Finder(RevisionMecanica.class);

    //------------------------------------------------------------------------
    //Atributos
    //------------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id_revision;

    @Temporal(TemporalType.DATE)
    private Date fechaRevision;

    private double costo_Revision;

    private double kilometraje;

    private Long id_vehiculo;

    //------------------------------------------------------------------------
    //Constructores
    //------------------------------------------------------------------------

    public RevisionMecanica() {
    }

    public RevisionMecanica(Date fechaRevision, double costo_Revision, double kilometraje, Long id_vehiculo) {
        this.fechaRevision = fechaRevision;
        this.costo_Revision = costo_Revision;
        this.kilometraje = kilometraje;
        this.id_vehiculo = id_vehiculo;
    }

    public Long getId_revision()
    {
        return id_revision;
    }

    public void setId_revision(Long id_revision)
    {
        this.id_revision = id_revision;
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

    public Long getId_vehiculo() {
        return id_vehiculo;
    }

    public void setId_vehiculo(Long id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }



    //DataBinder------------------------------------------------------------
    public static RevisionMecanica bind(JsonNode json)
    {
        return play.libs.Json.fromJson(json, RevisionMecanica.class);
    }
}
