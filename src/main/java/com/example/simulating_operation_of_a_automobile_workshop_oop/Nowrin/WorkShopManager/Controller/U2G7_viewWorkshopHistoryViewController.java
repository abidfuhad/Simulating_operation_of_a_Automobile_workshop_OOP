package com.example.simulating_operation_of_a_automobile_workshop_oop.Nowrin.WorkShopManager.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class U2G7_viewWorkshopHistoryViewController
{
    @javafx.fxml.FXML
    private TableColumn completionDateTC;
    @javafx.fxml.FXML
    private TableColumn assignedTechnicianTC;
    @javafx.fxml.FXML
    private TableColumn completedJobTC;
    @javafx.fxml.FXML
    private TableView historyTV;
    @javafx.fxml.FXML
    private Label viewWorkshopHistoryLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/NowrinView/WorkShopManagerView/U2G1_workshopManagerDashboardView.fxml", "Back");
    }
}