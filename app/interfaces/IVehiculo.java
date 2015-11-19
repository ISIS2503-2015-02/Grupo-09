package interfaces;

import com.fasterxml.jackson.databind.JsonNode;
import models.Datos;
import models.Emergencia;
import models.RevisionMecanica;
import models.Trayecto;
import play.libs.Json;

import java.util.Date;

/**
 * Created by ryogi on 12/11/15.
 */
public interface IVehiculo {

    public String getModelo();

    public void setModelo(String modelo);

    public Date getFecha_compra();

    public void setFecha_compra(Date fechaCompra);

    public int getEstado();

    public void setEstado(int estado);

    public RevisionMecanica getUltimaRevision();

    public Datos getUltimosDatos();

    public Emergencia getUltimaEmergencia();

    public Trayecto getUltimoTrayecto();

    public Long getId_vehiculo();

    //public void setId_vehiculo(Long idVehiculo);

    public int getTipo_vehiculo();

    public void setTipo_vehiculo(int tipoVehiculo);

    public void setUltimaRevision(RevisionMecanica ultimaRevision);

    public void setUltimosDatos(Datos ultimosDatos);

    public void setUltimaEmergencia(Emergencia ultimaEmergencia);

    public void setUltimoTrayecto(Trayecto ultimoTrayecto);

    public double getKilomDesdeUltimaReparacion();

    public static IVehiculo bind(JsonNode j)
    {
        return  Json.fromJson(j, IVehiculo.class);
    }

}
