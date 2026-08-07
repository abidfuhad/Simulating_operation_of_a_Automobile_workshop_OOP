package com.example.simulating_operation_of_a_automobile_workshop_oop.Maharab.Body_Paint_Supervisor.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class BodyRepairReportViewController
{
    @javafx.fxml.FXML
    private Label inprogressLabel;
    @javafx.fxml.FXML
    private Label pendingLabel;
    @javafx.fxml.FXML
    private Label completedLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/MaharabView/BodyPaintSupervisorView/BodyPaintSupervisorDashboardView.fxml","Body Paint Supervisor Dashboard");
    }
}