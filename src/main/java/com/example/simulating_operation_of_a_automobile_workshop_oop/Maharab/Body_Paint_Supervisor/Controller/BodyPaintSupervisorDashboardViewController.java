package com.example.simulating_operation_of_a_automobile_workshop_oop.Maharab.Body_Paint_Supervisor.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class BodyPaintSupervisorDashboardViewController
{
    @javafx.fxml.FXML
    private Label idLabel;
    @javafx.fxml.FXML
    private Label nameLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void completedJobsButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/MaharabView/BodyPaintSupervisorView/CompletedBodyJobsView.fxml","CompletedBodyJobs");
    }

    @javafx.fxml.FXML
    public void bodyRepairReportButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/MaharabView/BodyPaintSupervisorView/BodyRepairReportView.fxml","BodyRepairReport");
    }

    @javafx.fxml.FXML
    public void addRepairNotesButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/MaharabView/BodyPaintSupervisorView/AddRepairNotesView.fxml","AddRepairNotes");
    }

    @javafx.fxml.FXML
    public void updateRepairStatusButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/MaharabView/BodyPaintSupervisorView/UpdateBodyRepairStatusView.fxml","UpdateBodyRepairStatus");
    }

    @javafx.fxml.FXML
    public void bodyRepairJobsButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/MaharabView/BodyPaintSupervisorView/BodyRepairJobsView.fxml","BodyRepairJobs");
    }

    @javafx.fxml.FXML
    public void FinalbodyButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/MaharabView/BodyPaintSupervisorView/FinalBodyInspectionView.fxml","FinalBodyInspection");

    }

    @javafx.fxml.FXML
    public void recordPaintUsageButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/MaharabView/BodyPaintSupervisorView/RecordPaintUsageView.fxml","RecordPaintUsage");
    }

    @javafx.fxml.FXML
    public void assignBodyRepairTechnicianButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/MaharabView/BodyPaintSupervisorView/AssignBodyRepairTechnicianView.fxml","AssignBodyRepairTechnician");
    }
}