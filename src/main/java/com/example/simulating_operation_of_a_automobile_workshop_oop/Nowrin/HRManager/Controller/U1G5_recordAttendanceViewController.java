package com.example.simulating_operation_of_a_automobile_workshop_oop.Nowrin.HRManager.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class U1G5_recordAttendanceViewController
{
    @javafx.fxml.FXML
    private Label dateLabel;
    @javafx.fxml.FXML
    private ComboBox attendanceStatusComboBox;
    @javafx.fxml.FXML
    private ComboBox employeeIdComboBox;
    @javafx.fxml.FXML
    private Label attendanceStatusLabel;
    @javafx.fxml.FXML
    private Label employeeNameLabel;
    @javafx.fxml.FXML
    private TextField employeeNameTextField;
    @javafx.fxml.FXML
    private Label employeeIdLabel;
    @javafx.fxml.FXML
    private DatePicker attendanceDateDatePicker;

    @javafx.fxml.FXML
    public void initialize() {
        attendanceStatusComboBox.getItems().addAll("Present", "Absent", "Late");
        employeeIdComboBox.getItems().addAll("Em1","Em2");
    }

    @javafx.fxml.FXML
    public void saveButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/NowrinView/HRManagerView/HrManagerDashboardView.fxml", "Back");
    }
}