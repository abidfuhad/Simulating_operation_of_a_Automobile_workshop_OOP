package com.example.simulating_operation_of_a_automobile_workshop_oop.Nowrin.HRManager.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Shared.Employee;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class U1G2_searchEmployeeViewController
{
    @javafx.fxml.FXML
    private TableColumn<Employee,String> designationTC;
    @javafx.fxml.FXML
    private TableView<Employee> employeeTV;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> employeeNameTC;
    @javafx.fxml.FXML
    private TextField employeeNameTextField;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> statusTC;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> departmentTC;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> phoneTC;
    @javafx.fxml.FXML
    private TableColumn<Employee, Integer> employeeIdTC;
    @javafx.fxml.FXML
    private Label searchEmployeeLabel;
    @javafx.fxml.FXML
    private TableColumn employeeIdTC1;
    @javafx.fxml.FXML
    private Label employeeIDLabel;

    @javafx.fxml.FXML
    public void initialize() {

        employeeIdTC.setCellValueFactory(new PropertyValueFactory<>("employeeID"));
        employeeNameTC.setCellValueFactory(new PropertyValueFactory<>("employeeName"));
        departmentTC.setCellValueFactory(new PropertyValueFactory<>("department"));
        designationTC.setCellValueFactory(new PropertyValueFactory<>("designation"));
        phoneTC.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));

    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/NowrinView/HRManagerView/HrManagerDashboardView.fxml", "Back");
    }

    @javafx.fxml.FXML
    public void searchButtonOnAction(ActionEvent actionEvent) {
    }
}