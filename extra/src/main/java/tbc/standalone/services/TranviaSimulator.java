package tbc.standalone.services;

import com.google.gson.*;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import org.apache.http.entity.StringEntity;
import tbc.standalone.http.HttpConstants;
import tbc.standalone.http.Request;
import tbc.standalone.models.Datos;
import tbc.standalone.models.TranviaVehiculo;

import java.lang.reflect.Type;
import java.util.Date;

/**
 * Created by ryogi on 17/09/15.
 */
public class TranviaSimulator extends Service {

    private TranviaVehiculo tranvia;

    public TranviaSimulator(TranviaVehiculo t) {
        tranvia = t;
    }

    @Override
    protected Task createTask() {
        return new Task() {
            @Override
            protected Object call() throws Exception {

                GsonBuilder builder = new GsonBuilder();

                // Register an adapter to manage the date types as long values
                builder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
                    public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                        return new Date(json.getAsJsonPrimitive().getAsLong());
                    }
                });

                Gson gson = builder.create();
                Datos d = null;

                long latitud = (long) 4.255556;
                long longitud = (long) 78.255556;
                double kil = 25.6;

                while(latitud < 560000) {
                    d = new Datos();

                    d.setGpsAltitud(String.valueOf(latitud));
                    d.setGpsAltitud(String.valueOf(longitud));
                    d.setHoraMedicion(new Date(System.currentTimeMillis()));
                    d.setSensorChoque(false);
                    d.setSensorTermico(60);
                    d.setKilometraje(kil);
                    latitud += 0.00001;
                    longitud += 0.00001;
                    kil++;

                    Request.httpPostJsonRequest(new StringEntity(gson.toJson(d, Datos.class).toString()),
                            HttpConstants.HOST_TRANVIA_DATA.replace(":id", String.valueOf(tranvia.getIdVehiculo())));
                }

                return null;
            }
        };
    }

    @Override
    protected void succeeded() {

    }
}
