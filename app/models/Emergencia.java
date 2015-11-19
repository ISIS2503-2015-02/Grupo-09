package models;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by gusal on 15/08/2015.
 */
@Entity
public class Emergencia extends Model{


    //------------------------------------------------------------------------
    //Constantes
    //------------------------------------------------------------------------
    @Enumerated
    public final static int CONTROLADA=1;

    @Enumerated
    public final static int VIGENTE=0;

    //------------------------------------------------------------------------
    //Finder
    //------------------------------------------------------------------------

    public static final Model.Finder finder  = new com.avaje.ebean.Model.Finder(Emergencia.class);

    //------------------------------------------------------------------------
    //Atributsos
    //------------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private String idEmergencia;

    private int emergencyType;

    @Temporal(TemporalType.DATE)
    private Date emergencyDate;

    private String comments;

    private String place;

    private String emergencyLevel;

    private int estado;

    private Long idVehiculo;



    public Emergencia(){
        estado=VIGENTE;
    }


    public String getIdEmergencia() {
        return idEmergencia;
    }

    public void setIdEmergencia(String idEmergencia) {
        this.idEmergencia = idEmergencia;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }


    public Emergencia( int emerType, Date emerDate, String comments, String place, String emerLevel){
        emergencyType = emerType;
        emergencyDate = emerDate;
        this.comments = comments;
        this.place = place;
        emergencyLevel = emerLevel;
        estado=VIGENTE;
    }

    public Long getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Long idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public int getEmergencyType(){
        return emergencyType;
    }

    public Date getEmergencyDate() {
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

    public void setEmergencyDate(Date emergencyDate) {
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

    //-------------------------------------------------------------------------------------
    // JsonNode
    //-------------------------------------------------------------------------------------

    //public Emergencia(String emerType, Date emerDate, String comments, String place, String emerLevel){

    public static Emergencia bind(JsonNode j){

        /**
        String emergencyID = j.findPath("emergencyID").asText();
        int emergencyType = j.findPath("emergencyType").asInt();
        String emergencyDate = j.findPath("emergencyDate").asText();
        String comments = j.findPath("comments").asText();
        String place = j.findPath("place").asText();
        String emergencyLevel = j.findPath("emergencyLevel").asText();

        Emergencia emergency = new Emergencia(emergencyType,emergencyDate,comments,place,emergencyLevel);
         **/

        return Json.fromJson(j, Emergencia.class);
    }
}
