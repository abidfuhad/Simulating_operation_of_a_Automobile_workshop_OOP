package com.example.simulating_operation_of_a_automobile_workshop_oop.Nowrin.HRManager.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Shared.Employee;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

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
    private Label joiningDateLable;
    @javafx.fxml.FXML
    private DatePicker joiningDateDatePicker;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private ComboBox statusComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        selectDesignationComboBox.getItems().addAll("HR","Workshop","Technician");
        selectDepartmentComboBox.getItems().addAll("HRManager","Service Advisor");


        employeeIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("employeeID"));
        employeeNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("employeeName"));
        departmentTableColumn.setCellValueFactory(new PropertyValueFactory<>("department"));
        phoneTableColumn.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        designationTableColumn.setCellValueFactory(new PropertyValueFactory<>("designation"));
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
//    int userID, String role, String password, String name, String phone, String email, String department) {

    @javafx.fxml.FXML
    public void addEmployeeButtonOnAction(ActionEvent actionEvent) {
        Employee e = new Employee(
                employeeIdTextField.getText(),
                employeeNameTextField.getText(),
                selectDepartmentComboBox.getValue(),
                selectDesignationComboBox.getValue(),
                phoneNumberTextField.getText(),
                joiningDateDatePicker.getValue(),
                statusComboBox.getValue().toString()

        ) {
            @Override
            public String getName() {
                return super.getName();
            }
        };
        File f = new File("Employee.bin");
        try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(e);

            oos.close();
            fos.close();

            System.out.println("Employee added successfully!");

        } catch (IOException ex) {
            ex.printStackTrace();
        }




    }
}