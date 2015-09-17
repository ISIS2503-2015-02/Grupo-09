package tbc.standalone.ui.controllers;

import javafx.collections.ObservableList;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import tbc.standalone.models.MoviBusVehiculo;
import tbc.standalone.models.TranviaVehiculo;
import tbc.standalone.models.Vcub;

import java.util.ArrayList;


public class Controller {

    @FXML
    private ListView<Vcub> vcubsList;

    private ObservableList<Vcub> vcubsItems;

    private ArrayList<Vcub> vcubs;


    @FXML
    private ListView<TranviaVehiculo> tranviaList;

    private ObservableList<String> tranviasItems;

    private ArrayList<TranviaVehiculo> tranvias;

    @FXML
    private ListView<MoviBusVehiculo> movibusList;

    private ObservableList<MoviBusVehiculo> MovisItems;

    private ArrayList<MoviBusVehiculo> mobis;

    @FXML
    public void initialize() {

        final Service s = new Service() {
            @Override
            protected Task createTask() {

            }
        };
    }

    public void addVcub(Vcub v) {

    }


}
