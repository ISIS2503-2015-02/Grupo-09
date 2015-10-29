package models;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;

import javax.persistence.*;

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
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id_usuario;

    private String fullName;

    private String document;

    private String address;

    private long phoneNumber;

    private long cellphone;

    private String email;

    private Long id_vcub_alquilada;

    private Long id_ultimaReserva;


    //------------------------------------------------------------------------
    // Constructors
    //------------------------------------------------------------------------

    public User(){
        id_vcub_alquilada=null;
        id_ultimaReserva =null;
    }

    public User(String fullName, String document, String address, long phoneNumber,
                long cellphone, String email){

        this.fullName = fullName;
        this.document = document;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.cellphone = cellphone;
        this.email = email;
        id_vcub_alquilada =null;
    }

    //------------------------------------------------------------------------
    // Getters
    //------------------------------------------------------------------------


    public Long getId_usuario() {
        return id_usuario;
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

    public Long getId_vcub_alquilada() {
        return id_vcub_alquilada;
    }

    public Long getId_ultimaReserva() {
        return id_ultimaReserva;
    }

    //------------------------------------------------------------------------
    // Setters
    //------------------------------------------------------------------------

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
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

    public void setId_vcub_alquilada(Long id_vcub_alquilada) {
        this.id_vcub_alquilada = id_vcub_alquilada;
    }

    public void setId_ultimaReserva(Long id_ultimaReserva) {
        this.id_ultimaReserva = id_ultimaReserva;
    }

    //------------------------------------------------------------------------
    // Aditional Methods
    //------------------------------------------------------------------------

    //public User(String fullName, String document, String address, long phoneNumber, long cellphone, String email){
    public static User bind(JsonNode j){
        /**
        String fullName = j.findPath("fullName").asText();
        String document = j.findPath("document").asText();
        String address = j.findPath("address").asText();
        long phoneNumber = j.findPath("phoneNumber").asLong();
        long cellphone = j.findPath("cellphone").asLong();
        String email = j.findPath("email").asText();
        User user = new User(fullName,document,address,phoneNumber,cellphone,email);
        return user;
         **/

        return  Json.fromJson(j, User.class);
    }

    public User update(JsonNode j)
    {
        fullName = j.findPath("fullName").asText();
        document = j.findPath("document").asText();
        address = j.findPath("address").asText();
        phoneNumber = j.findPath("phoneNumber").asLong();
        cellphone = j.findPath("cellphone").asLong();
        email = j.findPath("email").asText();
        return this;
    }
}
