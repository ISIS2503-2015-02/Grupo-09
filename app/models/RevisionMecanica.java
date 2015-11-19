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

    public static final Model.Finder finder = new com.avaje.ebean.Model.Finder(RevisionMecanica.class);

    //------------------------------------------------------------------------
    //Atributos
    //------------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long idRevision;

    @Temporal(TemporalType.DATE)
    private Date fechaRevision;

    private double costoRevision;

    private double kilometraje;

    private Long idVehiculo;

    //------------------------------------------------------------------------
    //Constructores
    //------------------------------------------------------------------------

    public RevisionMecanica() {
        // Constructor vacío debido a ppersistencia.
    }

    public RevisionMecanica(Date fechaRevision, double costoRevision, double kilometraje, Long idVehiculo) {
        this.fechaRevision = fechaRevision;
        this.costoRevision = costoRevision;
        this.kilometraje = kilometraje;
        this.idVehiculo = idVehiculo;
    }

    public Long getIdRevision()
    {
        return idRevision;
    }

    public void setIdRevision(Long idRevision)
    {
        this.idRevision = idRevision;
    }

    public Date getFechaRevision()
    {
        return fechaRevision;
    }

    public void setFechaRevision(Date fechaRevision)
    {
        this.fechaRevision = fechaRevision;
    }

    public double getCostoRevision()
    {
        return costoRevision;
    }

    public void setCostoRevision(double costoRevision)
    {
        this.costoRevision = costoRevision;
    }

    public double getKilometraje()
    {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje)
    {
        this.kilometraje = kilometraje;
    }

    public Long getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Long idVehiculo) {
        this.idVehiculo = idVehiculo;
    }



    //DataBinder------------------------------------------------------------
    public static RevisionMecanica bind(JsonNode json)
    {
        return play.libs.Json.fromJson(json, RevisionMecanica.class);
    }
}
