package models;

/**
 * Created by gusal on 13/08/2015.
 */

public class Vcub
{
    //------------------------------------------------------------------------
    // Constantes de estado
    //------------------------------------------------------------------------

    public final static String PRESTADA = "Prestada";
    public final static String LIBRE = "Libre";

    //------------------------------------------------------------------------
    // Atributos
    //------------------------------------------------------------------------
    private Long id_vcub;

    private String estado; //Prestada,sustiduida o libre

    private Long id_estacion;

    private Long id_cliente;

    //------------------------------------------------------------------------
    // Constructores
    //------------------------------------------------------------------------

    public Vcub(){
    }

    public Vcub(String estado, Long id_estacion)
    {
        this.estado = estado;
        this.id_estacion = id_estacion;
    }

    //------------------------------------------------------------------------
    // Métodos
    //------------------------------------------------------------------------

    public Long getIdCvubs( )
    {
        return id_vcub;
    }

    public void setIdCvubs( Long idCvubs )
    {
        this.id_vcub = idCvubs;
    }

    public String getEstado( )
    {
        return estado;
    }

    public void setEstado( String estado )
    {
        this.estado = estado;
    }

    public Long getId_estacion()
    {
        return id_estacion;
    }

    public void setId_estacion(Long id_estacion)
    {
        this.id_estacion = id_estacion;
    }

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

}

