package models;


import com.google.common.collect.ArrayListMultimap;

/**
 * Created by  on 17/08/2015.
 */
public class MoviBusVehiculo extends Vehiculo {

    private List<Datos> datos;

    public MoviBusVehiculo(String id, String modelo, Date fecha_compra, int estado)
    {
        super(id,modelo,fecha_compra,estado);
        datos = new List<Datos>();
    }

    public static MoviBusVehiculo bind (JsonNode j)
    {
        String pModelo=j.findPath("modelo").asText();
        String pId=j.findPath("id_vehiculo").asText();
        Date fechac= null;
        int estado = j.findPath("estado").asInt();

        return new MoviBusVehiculo(pId,pModelo,fechac,estado);
    }

    public List<Datos> getDatos() {
        return datos;
    }

    public void setDatos(List<Datos> datos) {
        this.datos = datos;
    }
}
