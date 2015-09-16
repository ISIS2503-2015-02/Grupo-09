package tbc.standalone.models;

/**
 * Created by gusal on 15/08/2015.
 */

public class Emergencia {


    //------------------------------------------------------------------------
    //Constantes
    //------------------------------------------------------------------------
    public final static int CONTROLADA=1;

    public final static int VIGENTE=0;


    //------------------------------------------------------------------------
    //Atributsos
    //------------------------------------------------------------------------
    private String id_emergencia;

    private int emergencyType;

    private String emergencyDate;

    private String comments;

    private String place;

    private String emergencyLevel;

    private int estado;

    private Long id_vehiculo;



    public Emergencia(){
        estado=VIGENTE;
    }


    public String getId_emergencia() {
        return id_emergencia;
    }

    public void setId_emergencia(String id_emergencia) {
        this.id_emergencia = id_emergencia;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }


    public Emergencia( int emerType, String emerDate, String comments, String place, String emerLevel){
        emergencyType = emerType;
        emergencyDate = emerDate;
        this.comments = comments;
        this.place = place;
        emergencyLevel = emerLevel;
        estado=VIGENTE;
    }

    public Long getId_vehiculo() {
        return id_vehiculo;
    }

    public void setId_vehiculo(Long id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    public int getEmergencyType(){
        return emergencyType;
    }

    public String getEmergencyDate() {
        return emergencyDate;
    }

    public String getComments() {
        return comments;
    }

    public String getEmergencyLevel() {
        return emergencyLevel;
    }

    public String getPlace() {
        return place;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setEmergencyDate(String emergencyDate) {
        this.emergencyDate = emergencyDate;
    }

    public void setEmergencyLevel(String emergencyLevel) {
        this.emergencyLevel = emergencyLevel;
    }

    public void setEmergencyType(int emergencyType) {
        this.emergencyType = emergencyType;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void reportarEmergenciaControlada()
    {
        estado=CONTROLADA;
    }

    public int getEstado() {
        return estado;
    }

}
