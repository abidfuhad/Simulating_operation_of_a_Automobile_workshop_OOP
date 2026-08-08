package com.example.simulating_operation_of_a_automobile_workshop_oop.Nowrin.HRManager.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class U1G7_viewEmployeeListViewController
{
    @javafx.fxml.FXML
    private Label viewEmployeeListLabel;
    @javafx.fxml.FXML
    private TableView employeeTV;
    @javafx.fxml.FXML
    private TableColumn employeeNameTC;
    @javafx.fxml.FXML
    private TableColumn statusTC;
    @javafx.fxml.FXML
    private Label employeeIdLabel;
    @javafx.fxml.FXML
    private TableColumn departmentTC;
    @javafx.fxml.FXML
    private TableColumn phoneTC;
    @javafx.fxml.FXML
    private TableColumn employeeIdTC;
    @javafx.fxml.FXML
    private ComboBox departmentComboBox;
    @javafx.fxml.FXML
    private Label departmentLabel;
    @javafx.fxml.FXML
    private TextField employeeIdTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/NowrinView/HRManagerView/HrManagerDashboardView.fxml", "Back");
    }

    @javafx.fxml.FXML
    public void searchButtonOnAction(ActionEvent actionEvent) {
    }
}