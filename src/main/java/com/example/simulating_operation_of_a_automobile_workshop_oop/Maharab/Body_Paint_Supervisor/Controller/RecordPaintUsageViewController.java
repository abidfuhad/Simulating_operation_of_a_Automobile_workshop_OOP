package com.example.simulating_operation_of_a_automobile_workshop_oop.Maharab.Body_Paint_Supervisor.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class RecordPaintUsageViewController
{
    @javafx.fxml.FXML
    private TableColumn vehicleColumn;
    @javafx.fxml.FXML
    private TextField paintColorField;
    @javafx.fxml.FXML
    private TableView jobsTableView;
    @javafx.fxml.FXML
    private TableColumn statusColumn;
    @javafx.fxml.FXML
    private TableColumn jobIdColumn;
    @javafx.fxml.FXML
    private TextField quantityUsedField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void BackButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/MaharabView/BodyPaintSupervisorView/BodyPaintSupervisorDashboardView.fxml","Body Paint Supervisor Dashboard");
    }

    @javafx.fxml.FXML
    public void saveButton(ActionEvent actionEvent) {
    }
}