package tbc.standalone.models;

/**
 * Created by gusal on 13/08/2015.
 */

import java.util.ArrayList;
import java.util.List;



public class Estacion {
    //------------------------------------------------------------------------
    //Atributos
    //------------------------------------------------------------------------
    private Long id_estacion;

    private String nombreEstacion;

    private String ubicacion;

    private int vcubsCapacity;

    private List vcubs;

    public Estacion() {
    }


    public Estacion( Long idEstacion, String nombreEstacion, String ubicacion, int vcubsCapacity )
    {
        this.id_estacion = idEstacion;
        this.nombreEstacion = nombreEstacion;
        this.ubicacion = ubicacion;
        this.vcubsCapacity = vcubsCapacity;
        vcubs = new ArrayList<Vcub>();
    }

    public Long getId_estacion()
    {
        return id_estacion;
    }

    public void setId_estacion(Long idEstacion)
    {
        this.id_estacion = idEstacion;
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

    public int getVcubsCapacity() {
        return vcubsCapacity;
    }

    public void setVcubsCapacity(int vcubsCapacity) {
        this.vcubsCapacity = vcubsCapacity;
    }


}
