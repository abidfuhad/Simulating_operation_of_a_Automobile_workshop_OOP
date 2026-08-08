package com.example.simulating_operation_of_a_automobile_workshop_oop.Nowrin.HRManager.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Shared.Employee;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class U1G7_viewEmployeeListViewController
{
    @javafx.fxml.FXML
    private Label viewEmployeeListLabel;
    @javafx.fxml.FXML
    private TableView employeeTV;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> employeeNameTC;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> statusTC;
    @javafx.fxml.FXML
    private Label employeeIdLabel;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> departmentTC;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> phoneTC;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> employeeIdTC;
    @javafx.fxml.FXML
    private ComboBox<String> departmentComboBox;
    @javafx.fxml.FXML
    private Label departmentLabel;
    @javafx.fxml.FXML
    private TextField employeeIdTextField;

    @javafx.fxml.FXML
    public void initialize() {
        departmentComboBox.getItems().addAll("HR", "Workshop", "Service");

        employeeNameTC.setCellValueFactory(new PropertyValueFactory<>("employeeName"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));
        departmentTC.setCellValueFactory(new PropertyValueFactory<>("department"));
        phoneTC.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        employeeIdTC.setCellValueFactory(new PropertyValueFactory<>("employeeID"));
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/NowrinView/HRManagerView/HrManagerDashboardView.fxml", "Back");
    }

    @javafx.fxml.FXML
    public void searchButtonOnAction(ActionEvent actionEvent) {
    }
}