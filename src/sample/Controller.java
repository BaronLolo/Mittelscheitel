package sample;

import bll.Auto;
import dal.DataBaseManager;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private ListView<Auto> lvAutos;
    private List<Auto> cars;
    private Auto currentAuto;
    @FXML
    private Label lbMarkeOutput;
    @FXML
    private Label lbNameOutput;
    @FXML
    private Label lbPreisOutput;
    @FXML
    private Label lbPsOutput;
    @FXML
    private Label lbHubraumOutput;
    @FXML
    private Label lbGewichtOutput;
    @FXML
    private Label lbTreibstoffOuput;
    @FXML
    private Label lbAntriebOutput;
    @FXML
    private WebView webView;
    @FXML
    private TextArea taRechnung;
    @FXML
    private ColorPicker colorPicker;

    @FXML
    private void btnKaufenClicked(ActionEvent actionEvent) {
        taRechnung.lookup(".content").setStyle("-fx-background-color:" + colorPicker.getValue().toString().replace("0x", "#"));
        taRechnung.setFont(Font.font("Verdana", FontWeight.BOLD, 14));
        taRechnung.setText(currentAuto.getRechnung());
    }

    @FXML
    private void btnAdminClicked(ActionEvent actionEvent) {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
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

    private void showCars(){
        this.lvAutos.setItems(FXCollections.observableArrayList(cars));
    }

    private void showCarsProperties(){
        lbMarkeOutput.setText(currentAuto.getMarke());
        lbNameOutput.setText(currentAuto.getName());
        lbPreisOutput.setText(String.valueOf(currentAuto.getPreis()));
        lbPsOutput.setText(String.valueOf(currentAuto.getPs()));
        lbHubraumOutput.setText(String.valueOf(currentAuto.getHubraum()));
        lbGewichtOutput.setText(String.valueOf(currentAuto.getGewicht()));
        lbTreibstoffOuput.setText(currentAuto.getTreibstoff());
        lbAntriebOutput.setText(currentAuto.getAntrieb());

        webView.getEngine().load(currentAuto.getYtVideo());
    }
}
