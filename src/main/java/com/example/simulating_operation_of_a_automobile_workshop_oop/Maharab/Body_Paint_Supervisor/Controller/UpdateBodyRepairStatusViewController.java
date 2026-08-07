package com.example.simulating_operation_of_a_automobile_workshop_oop.Maharab.Body_Paint_Supervisor.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class UpdateBodyRepairStatusViewController
{
    @javafx.fxml.FXML
    private TableColumn vehicleColumn;
    @javafx.fxml.FXML
    private TableView jobsTableView;
    @javafx.fxml.FXML
    private TableColumn statusColumn;
    @javafx.fxml.FXML
    private TableColumn jobIdColumn;
    @javafx.fxml.FXML
    private ComboBox newstatusCombobox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/MaharabView/BodyPaintSupervisorView/BodyPaintSupervisorDashboardView.fxml","Body Paint Supervisor Dashboard");
    }

    @javafx.fxml.FXML
    public void updateButton(ActionEvent actionEvent) {
    }
}