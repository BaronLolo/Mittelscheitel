package sample;

import bll.Auto;
import dal.DataBaseManager;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.w3c.dom.CDATASection;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class adminPanelController implements Initializable {
    @FXML
    private TextField tbMarke;
    @FXML
    private TextField tbName;
    @FXML
    private TextField tbPreis;
    @FXML
    private TextField tbPS;
    @FXML
    private TextField tbHubraum;
    @FXML
    private TextField tbGewicht;
    @FXML
    private TextField tbTreibstoff;
    @FXML
    private TextField tbAntrieb;
    @FXML
    private TextField tbColor;
    @FXML
    private TextField tbYtVideo;
    @FXML
    private ListView<Auto> lvAutos;
    private List<Auto> cars;
    private Auto currentAuto;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cars = new ArrayList<>(DataBaseManager.getInstance().getAllAutos());
        showCars();
        this.lvAutos.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        this.lvAutos.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {
            public void changed(ObservableValue observable, Object oldValue, Object newValue) {
                currentAuto = (Auto)newValue;
                showCarsProperties();
            }
        });
        this.lvAutos.getSelectionModel().select(0);
        currentAuto = this.lvAutos.getSelectionModel().getSelectedItem();
    }

    public void getCarList(List<Auto> autos){
        cars = new ArrayList<>(autos);
    }

    private void showCars(){
        this.lvAutos.setItems(FXCollections.observableArrayList(cars));
    }

    private void showCarsProperties(){
        if(this.currentAuto != null){
            this.tbAntrieb.setText(this.currentAuto.getAntrieb());
            this.tbGewicht.setText(String.valueOf(this.currentAuto.getGewicht()));
            this.tbMarke.setText(this.currentAuto.getMarke());
            this.tbHubraum.setText(String.valueOf(this.currentAuto.getHubraum()));
            this.tbName.setText(this.currentAuto.getName());
            this.tbPreis.setText(String.valueOf(this.currentAuto.getPreis()));
            this.tbPS.setText(String.valueOf(this.currentAuto.getPs()));
            this.tbTreibstoff.setText(this.currentAuto.getTreibstoff());
            this.tbYtVideo.setText(this.currentAuto.getYtVideo());
        }
    }

    @FXML
    private void btnAdd(ActionEvent actionEvent) {
        Auto car = new Auto("new", "new", 0, 0, 0, 0, "new", "new", "new", "new");
        currentAuto = car;
        cars.add(car);
        showCars();
    }

    @FXML
    private void btnUpdate(ActionEvent actionEvent) {
        if(this.currentAuto != null){
            this.currentAuto.setMarke(tbMarke.getText());
            this.currentAuto.setName(tbName.getText());
            this.currentAuto.setPreis(Integer.parseInt(tbPreis.getText()));
            this.currentAuto.setPs(Integer.parseInt(tbPS.getText()));
            this.currentAuto.setHubraum(Integer.parseInt(tbHubraum.getText()));
            this.currentAuto.setGewicht(Integer.parseInt(tbGewicht.getText()));
            this.currentAuto.setTreibstoff(tbTreibstoff.getText());            this.currentAuto.setName(tbName.getText());
            this.currentAuto.setAntrieb(tbAntrieb.getText());
            this.currentAuto.setYtVideo(tbYtVideo.getText());
            showCars();
        }
    }

    @FXML
    private void btnDelete(ActionEvent actionEvent) {
        DataBaseManager.getInstance().deleteAuto(currentAuto);
        cars.remove(currentAuto);
        showCars();
    }

    @FXML
    private void btnCancle(ActionEvent actionEvent) {
        showCarsProperties();
    }

    private Stage createWindow(String fxml, String title) throws IOException {
        FXMLLoader loader = null;
        Parent root = null;

        loader  = new FXMLLoader( getClass().getResource(fxml));
        root = loader.load();

        Stage newStage = new Stage();
        newStage.setTitle(title);
        newStage.getIcons().add( new Image("file:icon.png"));
        Scene scene = new Scene(root);
        newStage.setScene(scene);
        return newStage;
    }


    @FXML
    private void btnLeave(ActionEvent actionEvent) {
        for (Auto car : cars) {
            if(car.getId() == -1){
                DataBaseManager.getInstance().addAuto(car);
            }else{
                DataBaseManager.getInstance().updateAuto(car);
            }
        }

    }
}
