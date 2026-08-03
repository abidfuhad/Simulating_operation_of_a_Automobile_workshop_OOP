package com.example.simulating_operation_of_a_automobile_workshop_oop.Ahad.Customer.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class Book_Service_AppointmentViewController
{
    @javafx.fxml.FXML
    private DatePicker datePik;
    @javafx.fxml.FXML
    private ComboBox vehicleCombo;
    @javafx.fxml.FXML
    private ComboBox serviceTypeCombo;
    @javafx.fxml.FXML
    private Label appointmentConfermationLabel;

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