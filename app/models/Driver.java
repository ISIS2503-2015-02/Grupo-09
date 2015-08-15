package models;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * Created by USER on 14/08/2015.
 */
public class Driver extends Model {

    //----------------------------------
    // Atributos
    //----------------------------------

    private String fullName;

    private String documentNumber;

    private long homePhone;

    private long mobilePhone;

    private String address;

    //----------------------------------
    // Constructor
    //----------------------------------

    public Driver(){

    }

    public Driver(String name, String docNum, long homeP, long mobileP, String address){
        fullName = name;
        documentNumber = docNum;
        homePhone = homeP;
        mobilePhone = mobileP;
        this.address = address;
    }

    //----------------------------------
    // Métodos
    //----------------------------------

    public String getFullName(){
        return fullName;
    }

    public String getDocumentNumber(){
        return documentNumber;
    }

    public long getHomePhone(){
        return homePhone;
    }

    public String getAddress() {
        return address;
    }

    public long getMobilePhone() {
        return mobilePhone;
    }

    public void setFullName(String nFullName){
        fullName = nFullName;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setHomePhone(long homePhone) {
        this.homePhone = homePhone;
    }

    public void setMobilePhone(long mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    //-------------------------------------------------
    // Métodos auxiliares
    //-------------------------------------------------

    public static Driver bind (JsonNode j){
        String name = j.findPath("fullName").asText();
        String docNum = j.findPath("documentNumber").asText();
        long homeP = j.findPath("homePhone").asLong();
        long mobileP = j.findPath("mobilePhone").asLong();
        String address = j.findPath("address").asText();

        Driver driver = new Driver(name,docNum,homeP,mobileP,address);

        return driver;
    }
}