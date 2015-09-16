package models;


import java.util.Date;

/**
 * Created by bdrangel10 on 17/08/2015.
 */

public class MoviBusVehiculo extends Vehiculo {

    public MoviBusVehiculo()
    {

    }

    public MoviBusVehiculo(Long id, String modelo, Date fecha_compra, int estado)
    {
        super(id,modelo,fecha_compra,estado, Vehiculo.MOVIBUS);
    }


}
