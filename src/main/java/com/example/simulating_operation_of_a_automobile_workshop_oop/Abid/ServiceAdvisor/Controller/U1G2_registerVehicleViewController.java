package com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.ServiceAdvisor.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class U1G2_registerVehicleViewController
{
    @javafx.fxml.FXML
    private ComboBox yearComboBox;
    @javafx.fxml.FXML
    private TextField modelField;
    @javafx.fxml.FXML
    private TextField registrationNoField;
    @javafx.fxml.FXML
    private ComboBox customerComboBox;
    @javafx.fxml.FXML
    private Label messageLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/AbidView/ServiceAdvisorView/SerAdvDasboardView.fxml","Advisor Dashboard");
    }

    @javafx.fxml.FXML
    public void addVehicleButton(ActionEvent actionEvent) {
    }
}