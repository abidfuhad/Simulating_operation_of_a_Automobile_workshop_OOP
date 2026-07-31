package com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Technician.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class U1G8_serviceRecordDetailsViewController
{
    @javafx.fxml.FXML
    private Label serviceNoteLabel;
    @javafx.fxml.FXML
    private Label vehicleLabel;
    @javafx.fxml.FXML
    private Label partsUsedLabel;
    @javafx.fxml.FXML
    private Label jobIdLabel;
    @javafx.fxml.FXML
    private Label labourHoursLabel;
    @javafx.fxml.FXML
    private Label complaintLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/com/example/simulating_operation_of_a_automobile_workshop_oop/AbidView/TechnicianView/U2G8_repairHistoryView.fxml","repair History");
    }
}