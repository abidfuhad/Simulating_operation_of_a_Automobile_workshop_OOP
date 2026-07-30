package com.example.simulating_operation_of_a_automobile_workshop_oop.HRManager.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RecordAttendanceViewController
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
    }

    @javafx.fxml.FXML
    public void saveButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
    }
}