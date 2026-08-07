package com.example.simulating_operation_of_a_automobile_workshop_oop.Nowrin.HRManager.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Nowrin.HRManager.Model.HRManager;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Shared.Employee;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.BinaryFileUtil;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class U1G1_addEmployeeViewController
{
    @javafx.fxml.FXML
    private TextField phoneNumberTextField;
    @javafx.fxml.FXML
    private Label addEmployeeLabel;
    @javafx.fxml.FXML
    private Label employeeIdLabel;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> employeeNameTableColumn;
    @javafx.fxml.FXML
    private Label departmentLabel;
    @javafx.fxml.FXML
    private TextField employeeIdTextField;
    @javafx.fxml.FXML
    private TableView<Employee> employeeTableView;
    @javafx.fxml.FXML
    private ComboBox <String>selectDepartmentComboBox;
    @javafx.fxml.FXML
    private TableColumn<Employee, String>  employeeIdTableColumn;
    @javafx.fxml.FXML
    private TextField employeeNameTextField;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> departmentTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> phoneTableColumn;
    @javafx.fxml.FXML
    private ComboBox <String>selectDesignationComboBox;
    @javafx.fxml.FXML
    private Label designationLabel;
    @javafx.fxml.FXML
    private AnchorPane mainPane;
    @javafx.fxml.FXML
    private TableColumn designationTableColumn;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private ComboBox<String> statusComboBox;
    @javafx.fxml.FXML
    private TextField passwordTextField;
    @javafx.fxml.FXML
    private TextField emailTextField;
    @javafx.fxml.FXML
    private Label emailLabel;
    @javafx.fxml.FXML
    private TextField salaryTextField;

    ArrayList<Employee> employeearraylist= new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        selectDesignationComboBox.getItems().addAll("HR","Workshop","Technician");
        selectDepartmentComboBox.getItems().addAll("HRManager","Service Advisor");


        employeeIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("employeeID"));
        employeeNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("employeeName"));
        departmentTableColumn.setCellValueFactory(new PropertyValueFactory<>("department"));
        phoneTableColumn.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        designationTableColumn.setCellValueFactory(new PropertyValueFactory<>("designation"));

        employeeTableView.getItems().addAll(employeearraylist);
    }

    @Deprecated
    public void saveButtonOnAction(ActionEvent actionEvent) {
    }

    @Deprecated
    public void clearButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/NowrinView/HRManagerView/HrManagerDashboardView.fxml", "Back");
    }
//     public Employee(String userID, String name, String phone, String email, String password, double salary, String designation) {

    @javafx.fxml.FXML
    public void addEmployeeButtonOnAction(ActionEvent actionEvent) {
        Employee e = new HRManager(
                employeeIdTextField.getText(),
                employeeNameTextField.getText(),
                phoneNumberTextField.getText(),
                emailTextField.getText(),
                passwordTextField.getText(),
                Double.parseDouble(salaryTextField.getText()),
                selectDesignationComboBox.getValue()


        );
        employeearraylist.add(e);
        BinaryFileUtil.saveList("Data/Nowrin/Employee.bin",employeearraylist);
        employeeTableView.getItems().setAll(employeearraylist);




        }




    }
