package tbc.standalone.models;

import java.util.Date;

/**
 * Created by Bdrangel10 on 16/08/2015.
 */
public class RevisionMecanica
{


    //------------------------------------------------------------------------
    //Atributos
    //------------------------------------------------------------------------
    private Long id_revision;

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

}
