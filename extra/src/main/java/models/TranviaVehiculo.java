package models;


import java.util.Date;

/**
 * Created by bdrangel10 on 17/08/2015.
 */
public class TranviaVehiculo extends Vehiculo {

    public TranviaVehiculo()
    {

    }

    public TranviaVehiculo(Long id, String modelo, Date fecha_compra, int estado)
    {
        super(id,modelo,fecha_compra,estado,Vehiculo.TRANVIA);
    }


}
