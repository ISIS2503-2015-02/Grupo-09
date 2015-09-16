package tbc.standalone.ui;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import tbc.standalone.models.MoviBusVehiculo;
import tbc.standalone.models.TranviaVehiculo;
import tbc.standalone.models.Vcub;
import tbc.standalone.http.HttpConstants;
import tbc.standalone.http.Request;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class Main extends Application {

    private Gson gson;

    public Main() {
        // Creates the json object which will manage the information received
        GsonBuilder builder = new GsonBuilder();

        // Register an adapter to manage the date types as long values
        builder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
            public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                return new Date(json.getAsJsonPrimitive().getAsLong());
            }
        });

        gson = builder.create();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/ui.fxml"));
        primaryStage.setTitle("Tbc/Embeded System");
        primaryStage.setScene(new Scene(root, 850, 610));
        primaryStage.show();

        //ArrayList<MoviBusVehiculo> a = new ArrayList<MoviBusVehiculo>(getMoviBus());
        //System.out.println("vcubs " + a.size());
    }


    public static void main(String[] args) {
        launch(args);
    }

    public List<Vcub> getVcubs() {
        String response = Request.httpGetJsonRequest(HttpConstants.HOSTNAME + "/vcubs");
        Type token = new TypeToken<Collection<Vcub>>() {
        }.getType();
        Collection<Vcub> result = gson.fromJson(response, token);

        return new ArrayList<Vcub>(result);

    }

    public List<TranviaVehiculo> getTranvias() {
        String response = Request.httpGetJsonRequest(HttpConstants.HOSTNAME + "/tranvias");
        Type token = new TypeToken<Collection<TranviaVehiculo>>() {
        }.getType();
        Collection<TranviaVehiculo> result = gson.fromJson(response, token);

        return new ArrayList<TranviaVehiculo>(result);

    }

    public List<MoviBusVehiculo> getMoviBus() {
        String response = Request.httpGetJsonRequest(HttpConstants.HOSTNAME + "/mobibuses");
        Type token = new TypeToken<Collection<MoviBusVehiculo>>() {
        }.getType();
        Collection<MoviBusVehiculo> result = gson.fromJson(response, token);

        return new ArrayList<MoviBusVehiculo>(result);

    }

}
