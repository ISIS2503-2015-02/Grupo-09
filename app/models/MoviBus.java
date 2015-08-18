package models;

import com.avaje.ebean.Model;

/**
 * Created by gusal on 13/08/2015.
 */
public class MoviBus extends Model
{

    //---------------------------------------------------------------------------------------------
    // Constants
    //---------------------------------------------------------------------------------------------

    public final static String RESERVADO = "Reservado";
    public final static String EN_USO = "En uso";
    public final static String DISPONIBLE = "Disponible";

    //---------------------------------------------------------------------------------------------
    // Attributes
    //---------------------------------------------------------------------------------------------

    private String position;

    private String busState;

    private String driverName;

    /**
     * Either is reserved, on use, or available
     */
    private String actualState;

    public MoviBus(){

    }

    public MoviBus(String position, String busState, String driverName){
        this.position = position;
        this.busState = busState;
        this.driverName = driverName;
        this.actualState = DISPONIBLE;
    }



}
