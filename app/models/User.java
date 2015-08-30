package models;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by USER on 16/08/2015.
 */
@Entity
public class User extends Model {

    //------------------------------------------------------------------------
    //Finder
    //------------------------------------------------------------------------

    public static Finder finder = new com.avaje.ebean.Model.Finder(User.class);

    //------------------------------------------------------------------------
    // Atributos
    //------------------------------------------------------------------------

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String userID;

    private String fullName;

    private String document;

    private String address;

    private long phoneNumber;

    private long cellphone;

    private String email;


//    @OneToOne
    private Vcub alquilada;

//    @OneToMany(mappedBy = "cliente")
    private Reserva reservas;




    //------------------------------------------------------------------------
    // Constructors
    //------------------------------------------------------------------------

    public User(){

    }

    public User(String fullName, String document, String address, long phoneNumber,
                long cellphone, String email){

        this.fullName = fullName;
        this.document = document;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.cellphone = cellphone;
        this.email = email;
        alquilada=null;
        reservas = new Reserva();
    }

    //------------------------------------------------------------------------
    // Getters
    //------------------------------------------------------------------------


    public String getUserID() {
        return userID;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDocument() {
        return document;
    }

    public String getAddress() {
        return address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public long getCellphone() {
        return cellphone;
    }

    public String getEmail() {
        return email;
    }

    public Vcub getAlquilada() {
        return alquilada;
    }

    //------------------------------------------------------------------------
    // Setters
    //------------------------------------------------------------------------


    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCellphone(long cellphone) {
        this.cellphone = cellphone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAlquilada(Vcub alquilada) {
        this.alquilada = alquilada;
    }

    //------------------------------------------------------------------------
    // Aditional Methods
    //------------------------------------------------------------------------

    //public User(String fullName, String document, String address, long phoneNumber, long cellphone, String email){
    public static User bind(JsonNode j){

        String fullName = j.findPath("fullName").asText();
        String document = j.findPath("document").asText();
        String address = j.findPath("address").asText();
        long phoneNumber = j.findPath("phoneNumber").asLong();
        long cellphone = j.findPath("cellphone").asLong();
        String email = j.findPath("email").asText();

        User user = new User(fullName,document,address,phoneNumber,cellphone,email);

        return user;
    }

    public User update(JsonNode j) {

        fullName = j.findPath("fullName").asText();
        document = j.findPath("document").asText();
        address = j.findPath("address").asText();
        phoneNumber = j.findPath("phoneNumber").asLong();
        cellphone = j.findPath("cellphone").asLong();
        email = j.findPath("email").asText();

        return this;
    }

    public void agregarReserva(Reserva nReserva)
    {
        reservas.setCliente(this);
    }

    public Reserva getReservas() {
        return reservas;
    }

    public void setReservas(Reserva reservas) {
        this.reservas = reservas;
    }
}
