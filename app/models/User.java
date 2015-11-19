package models;

import be.objectify.deadbolt.core.models.Permission;
import be.objectify.deadbolt.core.models.Role;
import be.objectify.deadbolt.core.models.Subject;
import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by USER on 16/08/2015.
 */
@Entity
public class User extends Model implements Subject{

    //------------------------------------------------------------------------
    //Finder
    //------------------------------------------------------------------------

    public static final Model.Finder finder  = new com.avaje.ebean.Model.Finder(User.class);

    //------------------------------------------------------------------------
    // Atributos
    //------------------------------------------------------------------------

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    public Long idUsuario;

    public String fullName;

    public String document;

    public String address;

    public long phoneNumber;

    public long cellphone;

    public String email;

    public Long idVcubAlquilada;

    public Long idUltimaReserva;

    @ManyToMany
    private List<UserRole> roles;


    //------------------------------------------------------------------------
    // Constructors
    //------------------------------------------------------------------------

    public User(){
        roles = new ArrayList<>();
        idVcubAlquilada =null;
        idUltimaReserva =null;
    }

    public User(String fullName, String document, String address, long phoneNumber,
                long cellphone, String email){

        this.fullName = fullName;
        this.document = document;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.cellphone = cellphone;
        this.email = email;
        idVcubAlquilada =null;
        roles = new ArrayList<>();
    }

    //------------------------------------------------------------------------
    // Getters
    //------------------------------------------------------------------------


    public Long getIdUsuario() {
        return idUsuario;
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

    public Long getIdVcubAlquilada() {
        return idVcubAlquilada;
    }

    public Long getIdUltimaReserva() {
        return idUltimaReserva;
    }

    //------------------------------------------------------------------------
    // Setters
    //------------------------------------------------------------------------

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
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

    public void setIdVcubAlquilada(Long idVcubAlquilada) {
        this.idVcubAlquilada = idVcubAlquilada;
    }

    public void setIdUltimaReserva(Long idUltimaReserva) {
        this.idUltimaReserva = idUltimaReserva;
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

    @Override
    public List<? extends Role> getRoles() {
        return roles;
    }

    public void addRole(UserRole r) {
        roles.add(r);
    }

    @Override
    public List<? extends Permission> getPermissions() {
        return new ArrayList<>();
    }

    @Override
    public String getIdentifier() {
        return null;
    }
}
