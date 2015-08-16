package models;

/**
 * Created by gusal on 13/08/2015.
 */



import javax.persistence.*;


@Entity
public class Estacion
{
    private String idEstacion;

    private String nombreEstacion;

    private String ubicacion;

    private int capacidadEstacion;



    public Estacion( String idEstacion, String nombreEstacion, String ubicacion, int capacidadEstacion )
    {
        this.idEstacion = idEstacion;
        this.nombreEstacion = nombreEstacion;
        this.ubicacion = ubicacion;
        this.capacidadEstacion=capacidadEstacion;
    }

    public String getIdEstacion()
    {
        return idEstacion;
    }

    public void setIdEstacion(String idEstacion)
    {
        this.idEstacion = idEstacion;
    }

    public String getNombreEstacion( )
    {
        return nombreEstacion;
    }

    public void setNombreEstacion( String nombreEstacion )
    {
        this.nombreEstacion = nombreEstacion;
    }

    public String getUbicacion( )
    {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion)
    {
        this.ubicacion = ubicacion;
    }

    public int getCapacidadEstacion()
    {
        return capacidadEstacion;
    }

    public void setCapacidadEstacion(int capacidadEstacion)
    {
        this.capacidadEstacion = capacidadEstacion;
    }
}
