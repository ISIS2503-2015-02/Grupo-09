package tbc.standalone.models;

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
    private Long idVcub;

    private String estado; //Prestada,sustiduida o libre

    private Long idEstacion;

    private Long idCliente;

    //------------------------------------------------------------------------
    // Constructores
    //------------------------------------------------------------------------

    public Vcub(){
    }

    public Vcub(String estado, Long idEstacion)
    {
        this.estado = estado;
        this.idEstacion = idEstacion;
    }

    //------------------------------------------------------------------------
    // Métodos
    //------------------------------------------------------------------------

    public Long getIdVcubs()
    {
        return idVcub;
    }

    public void setIdCvubs( Long idCvubs )
    {
        this.idVcub = idCvubs;
    }

    public String getEstado( )
    {
        return estado;
    }

    public void setEstado( String estado )
    {
        this.estado = estado;
    }

    public Long getIdEstacion()
    {
        return idEstacion;
    }

    public void setIdEstacion(Long idEstacion)
    {
        this.idEstacion = idEstacion;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "Vcubs:Id:" + this.getIdVcubs();
    }

}

