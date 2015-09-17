package tbc.standalone.ui.controllers;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import tbc.standalone.http.HttpConstants;
import tbc.standalone.http.Request;
import tbc.standalone.models.MoviBusVehiculo;
import tbc.standalone.models.TranviaVehiculo;
import tbc.standalone.models.Vcub;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;


public class Controller {

    @FXML
    private ListView<Vcub> vcubsList;

    private ObservableList<Vcub> vcubsItems;

    private ArrayList<Vcub> vcubs;


    @FXML
    private ListView<TranviaVehiculo> tranviaList;

    private ObservableList<TranviaVehiculo> tranviasItems;

    private ArrayList<TranviaVehiculo> tranvias;

    @FXML
    private ListView<MoviBusVehiculo> movibusList;

    private ObservableList<MoviBusVehiculo> movisItems;

    private ArrayList<MoviBusVehiculo> mobis;

    private Gson gson;

    @FXML
    public void initialize() {

        // Creates the json object which will manage the information received
        GsonBuilder builder = new GsonBuilder();

        // Register an adapter to manage the date types as long values
        builder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
            public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                return new Date(json.getAsJsonPrimitive().getAsLong());
            }
        });

        gson = builder.create();

        final Service s = new Service() {
            @Override
            protected Task createTask() {
                return new Task() {
                    @Override
                    protected Object call() throws Exception {
                        String response = Request.httpGetJsonRequest(HttpConstants.HOSTNAME + "/vcubs");
                        Type token = new TypeToken<Collection<Vcub>>(){}.getType();
                        Collection<Vcub> resultVcubs = gson.fromJson(response, token);

                        vcubs = new ArrayList<Vcub>(resultVcubs);

                        response = Request.httpGetJsonRequest(HttpConstants.HOSTNAME + "/tranvias");
                        token = new TypeToken<Collection<Vcub>>(){}.getType();
                        Collection<TranviaVehiculo> resultTranvias = gson.fromJson(response, token);

                        tranvias = new ArrayList<TranviaVehiculo>(resultTranvias);

                        response = Request.httpGetJsonRequest(HttpConstants.HOSTNAME + "/mobibuses");
                        token = new TypeToken<Collection<MoviBusVehiculo>>(){}.getType();
                        Collection<MoviBusVehiculo> resultMobis = gson.fromJson(response, token);

                        mobis = new ArrayList<MoviBusVehiculo>(resultMobis);
                        System.out.println("carga " + tranvias.size() + " " + vcubs.size() + " " + mobis.size());

                        return null;
                    }
                };
            }

            @Override
            protected void succeeded() {
                vcubsItems = FXCollections.observableArrayList(vcubs);
                vcubsList.setItems(vcubsItems);

                tranviasItems = FXCollections.observableArrayList(tranvias);
                tranviaList.setItems(tranviasItems);

                movisItems = FXCollections.observableArrayList(mobis);
                movibusList.setItems(movisItems);

                System.out.println("succ");
            }
        };

        s.start();
    }
}
