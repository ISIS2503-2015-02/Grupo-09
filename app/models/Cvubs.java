package models;

import com.avaje.ebean.Model;
import models.Estacion;
/**
 * Created by gusal on 13/08/2015.
 */
public class Cvubs extends Model
{
    private String idCvubs;

    private String estado; //Prestada,sustiduida o libre

    private Estacion estacion;


    public Cvubs( String idCvubs, String estado, Estacion estacion )
    {
        this.idCvubs = idCvubs;
        this.estado = estado;
        this.estacion = estacion;
    }

    public String getIdCvubs( )
    {
        return idCvubs;
    }

    public void setIdCvubs( String idCvubs )
    {
        this.idCvubs = idCvubs;
    }

    public String getEstado( )
    {
        return estado;
    }

    public void setEstado( String estado )
    {
        this.estado = estado;
    }

    public Estacion getEstacion( )
    {
        return estacion;
    }

    public void setEstacion(Estacion estacion)
    {
        this.estacion = estacion;
    }
}
