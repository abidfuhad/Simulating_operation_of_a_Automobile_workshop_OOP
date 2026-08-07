package com.example.simulating_operation_of_a_automobile_workshop_oop.Nowrin.HRManager.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Shared.Employee;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class U1G3_updateEmployeeInformationViewController
{
    @javafx.fxml.FXML
    private Label updateEmployeeInformationLabel;
    @javafx.fxml.FXML
    private TextField phoneTF;
    @javafx.fxml.FXML
    private Button updateButtonOnAction;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> departmentTC;
    @javafx.fxml.FXML
    private TextField employeeIdTF;
    @javafx.fxml.FXML
    private ComboBox<String> departmentComboBox;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> employeeIdTC;
    @javafx.fxml.FXML
    private Label departmentLabel;
    @javafx.fxml.FXML
    private Label phoneLabel;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> designationTC;
    @javafx.fxml.FXML
    private TableView<Employee> employeeTV;
    @javafx.fxml.FXML
    private ComboBox<String> designationComboBox;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> phoneTC;
    @javafx.fxml.FXML
    private Label designationLabel;

    @javafx.fxml.FXML
    public void initialize() {
        departmentComboBox.getItems().addAll("Workshop", "Service", "Customer Service", "Vehicle");

        designationComboBox.getItems().addAll("Workshop Manager", "HR Manager", "Technician", "Service Advisor");


        employeeIdTC.setCellValueFactory(new PropertyValueFactory<>("employeeId"));
        departmentTC.setCellValueFactory(new PropertyValueFactory<>("department"));
        designationTC.setCellValueFactory(new PropertyValueFactory<>("designation"));
        phoneTC.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
    }


    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/NowrinView/HRManagerView/HrManagerDashboardView.fxml", "Back");


    }
}