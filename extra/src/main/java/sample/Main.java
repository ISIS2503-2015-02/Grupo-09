package sample;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import models.MoviBusVehiculo;
import models.TranviaVehiculo;
import models.Vcub;
import testpilot.helpers.http.HttpConstants;
import testpilot.helpers.http.Request;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main extends Application {

    private Gson gson;

    public Main() {
        gson = new Gson();
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    public List<Vcub> getVcubs() {
        String response = Request.httpGetJsonRequest(HttpConstants.HOSTNAME + "/vcubs");
        Type token = new TypeToken<Collection<Vcub>>() {}.getType();
        Collection<Vcub> result = gson.fromJson(response, token);

        return new ArrayList<Vcub>(result);

    }

    public List<TranviaVehiculo> getTranvias() {
        String response = Request.httpGetJsonRequest(HttpConstants.HOSTNAME + "/tranvias");
        Type token = new TypeToken<Collection<TranviaVehiculo>>() {}.getType();
        Collection<TranviaVehiculo> result = gson.fromJson(response, token);

        return new ArrayList<TranviaVehiculo>(result);

    }

    public List<MoviBusVehiculo> getMoviBus() {
        String response = Request.httpGetJsonRequest(HttpConstants.HOSTNAME + "/mobibuses");
        Type token = new TypeToken<Collection<MoviBusVehiculo>>() {}.getType();
        Collection<MoviBusVehiculo> result = gson.fromJson(response, token);

        return new ArrayList<MoviBusVehiculo>(result);

    }

}
