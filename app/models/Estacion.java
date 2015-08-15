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



    public Estacion( String idEstacion, String nombreEstacion, String ubicacion )
    {
        this.idEstacion = idEstacion;
        this.nombreEstacion = nombreEstacion;
        this.ubicacion = ubicacion;
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
}
