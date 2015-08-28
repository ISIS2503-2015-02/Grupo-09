package models;

/**
 * Created by gusal on 13/08/2015.
 */

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import play.libs.Json;


@Entity
public class Estacion extends Model {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private String idEstacion;

    private String nombreEstacion;

    private String ubicacion;

    private int vcubsCapacity;

//    @OneToMany(mappedBy = "estacion")
    //  @JoinColumn(name="idVcub", nullable = false)
    private List<Vcub> vcubs;

    public Estacion() {
    }

    public Estacion(String nombreEstacion, String ubicacion) {
        this.nombreEstacion = nombreEstacion;
        this.ubicacion = ubicacion;
    }

    public Estacion( String idEstacion, String nombreEstacion, String ubicacion, int vcubsCapacity )
    {
        this.idEstacion = idEstacion;
        this.nombreEstacion = nombreEstacion;
        this.ubicacion = ubicacion;
        this.vcubsCapacity = vcubsCapacity;
        vcubs = new ArrayList<Vcub>();
    }

    public String getIdEstacion()
    {
        return idEstacion;
    }

    public void setIdEstacion(String idEstacion)
    {
        this.idEstacion = idEstacion;
    }

    public String getNombreEstacion( )
    {
        return nombreEstacion;
    }

    public void setNombreEstacion( String nombreEstacion )
    {
        this.nombreEstacion = nombreEstacion;
    }

    public String getUbicacion( )
    {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion)
    {
        this.ubicacion = ubicacion;
    }

    public int getVcubsCapacity() {
        return vcubsCapacity;
    }

    public void setVcubsCapacity(int vcubsCapacity) {
        this.vcubsCapacity = vcubsCapacity;
    }

    public List<Vcub> getVcubs() {
        return vcubs;
    }

    public void devolverVcub(Vcub devolver)
    {
        vcubs.add(devolver);
        User teniaAlquilada = devolver.getCliente();
        teniaAlquilada.setAlquilada(null);
        devolver.setEstado(Vcub.LIBRE);
        devolver.setEstacion(this);
        teniaAlquilada.save();
        devolver.setCliente(null);
        devolver.save();
        this.save();

    }

    /*
        Presta una bicicleta al usuario que llega por parámetro, la elimina de las bicicletas de la estación.
     */
    public Vcub alquilarVcub(User usuarioAlquila)
    {
        Vcub prestar = null;
        if(vcubs.size()>0)
        {
            prestar=vcubs.get(0);
            vcubs.remove(prestar);
            prestar.setCliente(usuarioAlquila);
            prestar.setEstado(Vcub.PRESTADA);
            prestar.setEstacion(null);
            prestar.save();
            usuarioAlquila.setAlquilada(prestar);
            usuarioAlquila.save();
        }
        this.save();
        return prestar;
    }

    //-------------------------------------------------------------------------------------
    // JsonNode
    //-------------------------------------------------------------------------------------

    //public Estacion( String idEstacion, String nombreEstacion, String ubicacion )

    public static Estacion bind(JsonNode json){

        /**
         String idEstacion = j.findPath("idEstacion").asText();
         String nombreEstacion = j.findPath("nombreEstacion").asText();
         String ubicacion = j.findPath("ubicacion").asText();
         int vcubsCapacity = j.findPath("vcubsCapacity").asInt();

         Estacion station = new Estacion(idEstacion,nombreEstacion,ubicacion,vcubsCapacity);

         return station;
         */
        return Json.fromJson(json, Estacion.class);

    }
}
