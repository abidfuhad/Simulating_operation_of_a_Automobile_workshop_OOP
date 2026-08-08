package com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Technician.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.SessionManager;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class TechnicianDashboardViewController
{
    @javafx.fxml.FXML
    private Label technicianNameLabel;
    @javafx.fxml.FXML
    private Label technicianIdLabel;

    @javafx.fxml.FXML
    public void initialize() {

        technicianNameLabel.setText(SessionManager.employee.getName());
        technicianIdLabel.setText(SessionManager.employee.getUserID());

    }

    @javafx.fxml.FXML
    public void addServiceNoteButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/com/example/simulating_operation_of_a_automobile_workshop_oop/AbidView/TechnicianView/U2G4_addServiceNotesView.fxml","add Service Notes");
    }

    @javafx.fxml.FXML
    public void repairHistoryButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/com/example/simulating_operation_of_a_automobile_workshop_oop/AbidView/TechnicianView/U2G8_repairHistoryView.fxml","repair History");
    }

    @javafx.fxml.FXML
    public void updateRepairStatusButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/com/example/simulating_operation_of_a_automobile_workshop_oop/AbidView/TechnicianView/U2G3_updateRepairStatusView.fxml","update Repair Status");
    }

    @javafx.fxml.FXML
    public void myAssignedJobsButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/com/example/simulating_operation_of_a_automobile_workshop_oop/AbidView/TechnicianView/U2G1_assigendJobsView.fxml","assigend Jobs");
    }

    @javafx.fxml.FXML
    public void acceptJobButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/com/example/simulating_operation_of_a_automobile_workshop_oop/AbidView/TechnicianView/U2G2_acceptJobView.fxml","accept Job");
    }

    @javafx.fxml.FXML
    public void recordUsedPartsButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/com/example/simulating_operation_of_a_automobile_workshop_oop/AbidView/TechnicianView/U2G5_recordUsedPartsView.fxml","record Used Parts");
    }

    @javafx.fxml.FXML
    public void markJobCompleteButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/com/example/simulating_operation_of_a_automobile_workshop_oop/AbidView/TechnicianView/U2G7_markJobCompleteView.fxml","mark Job Complete");
    }

    @javafx.fxml.FXML
    public void logoutButton(ActionEvent actionEvent) {
        SessionManager.employee = null;
        SceneSwitcher.switchScene(actionEvent,"/com/example/simulating_operation_of_a_automobile_workshop_oop/LoginView/loginView.fxml","Login");
    }

    @javafx.fxml.FXML
    public void recordLabourHoursButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/com/example/simulating_operation_of_a_automobile_workshop_oop/AbidView/TechnicianView/U2G6_recordLabourHoursView.fxml","record Labour Hours");
    }
}