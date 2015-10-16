package tbc.standalone.services;

import com.google.gson.*;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import org.apache.http.entity.StringEntity;
import tbc.standalone.http.HttpConstants;
import tbc.standalone.http.Request;
import tbc.standalone.models.Datos;
import tbc.standalone.models.MoviBusVehiculo;
import tbc.standalone.models.TranviaVehiculo;

import java.lang.reflect.Type;
import java.util.Date;
import java.util.Random;

/**
 * Created by ryogi on 17/09/15.
 */
public class MobiSimulator extends Service {

    private MoviBusVehiculo tranvia;

    public MobiSimulator(MoviBusVehiculo t) {
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

                Random r = new Random();

                double latitud = (r.nextInt(5000000 - 4000000) + 4000000) * 0.000001;
                double longitud = (r.nextInt(75000000 - 74000000) + 74000000) * 0.000001;

                while(latitud < 560000) {
                    Datos d = new Datos();

                    d.setGpsAltitud(String.valueOf(latitud));
                    d.setGpsAltitud(String.valueOf(longitud));
                    d.setHoraMedicion(new Date(System.currentTimeMillis()));
                    d.setSensorChoque(false);
                    d.setSensorTermico(60);
                    d.setKilometraje((r.nextInt(990 - 100) + 100 * 0.1));
                    latitud += 0.00001;
                    longitud += 0.00001;

                    Request.httpPostJsonRequest(new StringEntity(gson.toJson(d, Datos.class).toString()),
                            HttpConstants.HOST_MOBI_DATA.replace(":id", String.valueOf(tranvia.getIdVehiculo())));
                }

                return null;
            }
        };
    }

    @Override
    protected void succeeded() {

    }
}
