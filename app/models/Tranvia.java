package models;

/**
 * Created by gusal on 13/08/2015.
 */

@Entity
public class Tranvia
{
    @Id
    private String idTranvia;

    private Linea linea;

    private String estado;

    private Emergencia magnitudEmergencia; // Si est� en nivel 0 quiere decir que no hay emergencia, manejemoslo de 0 a 5.

    private Driver conductor;

    public Tranvia( String idTranvia, Linea linea, String estado, Emergencia magnitudEmergencia, Driver conductor )
    {
        this.idTranvia = idTranvia;
        this.linea = linea;
        this.estado = estado;
        this.magnitudEmergencia = magnitudEmergencia;
        this.conductor = conductor;
    }

    /**
     * Metodo que retorna el id del tranv�a
     * @return idTranvia
     */
    public String getId( )
    {
        return id;
    }

    /**
     * M�todo que registra el id del tranv�a
     * @param idTranvia
     */
    public void setId(String idTranvia)
    {
        this.idTranvia = idTranvia;
    }

    /**
     * Metodo que retorna la l�nea en la que transita el tranv�a
     * @return linea
     */
    public Linea getLinea( )
    {
        return linea;
    }

    /**
     * M�todo que registra la l�nea en la que transita el tranv�a
     * @param linea
     */
    public void setLinea(Linea linea)
    {
        this.linea = linea;
    }

    /**
     * Metodo que retorna el estado en el que se encuentra el tranv�a
     * @return estado
     */
    public String getEstado( )
    {
        return estado;
    }

    /**
     * M�todo que registra el estado en el que est� el tranv�a
     * @param estado
     */
    public void setEstado(String estado)
    {
        this.estado = estado;
    }

    /**
     * Metodo que retorna la magnitud de la emergencia en la que est� el tranv�a
     * @return magnitudEmergencia
     */
    public Emergencia getEmergencia( )
    {
        return magnitudEmergencia;
    }

    /**
     * M�todo que registra la magnitud de la emergencia en la que est� el tranv�a
     * @param magnitudEmergencia
     */
    public void setLinea(Emergencia magnitudEmergencia)
    {
        this.magnitudEmergencia = magnitudEmergencia;
    }

    /**
     * Metodo que retorna al conductor del tranv�a
     * @return conductor
     */
    public Driver getDriver( )
    {
        return conductor;
    }

    /**
     * M�todo que registra al conductor del tranv�a
     * @param conductor
     */
    public void setDriver(Driver conductor)
    {
        this.conductor = conductor;
    }


}
