package com.example.simulating_operation_of_a_automobile_workshop_oop.Ahad.Customer.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Register_VehicleViewController
{
    @javafx.fxml.FXML
    private TextField makeTxtFld;
    @javafx.fxml.FXML
    private TextField modelTxtFld;
    @javafx.fxml.FXML
    private TextField yearTxtFld;
    @javafx.fxml.FXML
    private TextField registrationNoTxtFld;
    @javafx.fxml.FXML
    private Label registrationConfirmLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backBtn(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/Ahad_View/CustomerView/CustomerDashboardView.fxml","Customer Dashboard");
    }

    @javafx.fxml.FXML
    public void saveBtn(ActionEvent actionEvent) {
    }
}