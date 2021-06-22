package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
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

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void btnAdd(ActionEvent actionEvent) {
    }

    @FXML
    private void btnUpdate(ActionEvent actionEvent) {
    }

    @FXML
    private void btnDelete(ActionEvent actionEvent) {
    }

    @FXML
    private void btnCancle(ActionEvent actionEvent) {
    }

    @FXML
    private void btnLeave(ActionEvent actionEvent) {
    }
}
