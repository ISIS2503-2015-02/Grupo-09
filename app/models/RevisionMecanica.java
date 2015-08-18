package models;

/**
 * Created by Bdrangel10 on 16/08/2015.
 */
public class RevisionMecanica

{
    private String id;
    private Date fechaRevision;
    private double costo_Revision;
    private double kilometraje;
    private MoviBus movibus;
    private Tranvia tranvia;

    public RevisionMecanica(double kilometraje, String id, Date fechaRevision, double costo_Revision, Tranvia tranvia) {
        this.kilometraje = kilometraje;
        this.id = id;
        this.fechaRevision = fechaRevision;
        this.costo_Revision = costo_Revision;
        this.tranvia=tranvia;
        movibus=null;
    }

    public RevisionMecanica(double kilometraje, String id, Date fechaRevision, double costo_Revision, MoviBus movibus) {
        this.kilometraje = kilometraje;
        this.id = id;
        this.fechaRevision = fechaRevision;
        this.costo_Revision = costo_Revision;
        this.movibus=movibus;
        tranvia=null;
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

    public MoviBus getMovibus()
    {
        return movibus;
    }

    public void setMovibus(MoviBus movibus)
    {
        this.movibus = movibus;
    }

    public Tranvia getTranvia()
    {
        return tranvia;
    }

    public void setTranvia(Tranvia tranvia)
    {
        this.tranvia = tranvia;
    }
}
