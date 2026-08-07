package com.example.simulating_operation_of_a_automobile_workshop_oop.Nowrin.HRManager.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class U1G8_viewEmployeeSummaryViewController
{
    @javafx.fxml.FXML
    private Label activeEmployeesLabel;
    @javafx.fxml.FXML
    private Label titleLabel;
    @javafx.fxml.FXML
    private Label departmentsLabel;
    @javafx.fxml.FXML
    private Label totalEmployeesLabel;
    @javafx.fxml.FXML
    private Label inactiveEmployeesLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/NowrinView/HRManagerView/HrManagerDashboardView.fxml", "Back");
    }
}