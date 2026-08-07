package com.example.simulating_operation_of_a_automobile_workshop_oop.Nowrin.HRManager.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class hrManagerDashboardViewController
{
    @javafx.fxml.FXML
    private Label totalEmployeesLabel;
    @javafx.fxml.FXML
    private Label dashboardTitleLabel;
    @javafx.fxml.FXML
    private Label hrManagerIdLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void searchEmployeeButtonOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/NowrinView/HRManagerView/U1G2_searchEmployeeView.fxml","Search Employee");
    }

    @javafx.fxml.FXML
    public void employeeListButtonOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/NowrinView/HRManagerView/U1G7_viewEmployeeListView.fxml","View Employee List");
    }

    @javafx.fxml.FXML
    public void employeeSummaryButtonOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/NowrinView/HRManagerView/U1G8_viewEmployeeSummaryView.fxml","View Employee Summary");
    }

    @javafx.fxml.FXML
    public void logoutButtonOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/LoginView/loginView.fxml","Login");
    }

    @javafx.fxml.FXML
    public void updateEmployeeStatusButtonOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/NowrinView/HRManagerView/U1G4_updateEmployeeStatusView.fxml","Update Employee Status");
    }

    @javafx.fxml.FXML
    public void attendanceReportButtonOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/NowrinView/HRManagerView/U1G6_viewAttendanceReportView.fxml","View Attendance Report");
    }

    @javafx.fxml.FXML
    public void updateEmployeeButtonOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/NowrinView/HRManagerView/U1G3_updateEmployeeInformationView.fxml","Update Employee Information");
    }

    @javafx.fxml.FXML
    public void addEmployeeButtonOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/NowrinView/HRManagerView/U1G1_addEmployeeView.fxml","add Employee");
    }

    @javafx.fxml.FXML
    public void recordAttendanceButtonOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/NowrinView/HRManagerView/U1G5_recordAttendanceView.fxml","Record Attendance");
    }

}