package com.example.simulating_operation_of_a_automobile_workshop_oop.Nowrin.HRManager.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class U1G4_updateEmployeeStatusViewController
{
    @javafx.fxml.FXML
    private TableView<Employee> employeeTV;
    @javafx.fxml.FXML
    private Label titleLabel;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> employeeNameTC;
    @javafx.fxml.FXML
    private ComboBox<String> statusCB;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> statusTC;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> departmentTC;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    public void initialize() {
        statusCB.getItems().addAll("Active", "Inactive");

        employeeNameTC.setCellValueFactory(new PropertyValueFactory<>("employeeName"));
        departmentTC.setCellValueFactory(new PropertyValueFactory<>("department"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    @javafx.fxml.FXML
    public void saveButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/NowrinView/HRManagerView/HrManagerDashboardView.fxml", "Back");
    }
}