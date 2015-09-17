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

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/ui.fxml"));
        primaryStage.setTitle("Tbc/Embeded System");
        primaryStage.setScene(new Scene(root, 850, 610));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}
