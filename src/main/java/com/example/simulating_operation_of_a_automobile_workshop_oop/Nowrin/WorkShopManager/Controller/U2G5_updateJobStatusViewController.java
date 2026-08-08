package com.example.simulating_operation_of_a_automobile_workshop_oop.Nowrin.WorkShopManager.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class U2G5_updateJobStatusViewController
{
    @javafx.fxml.FXML
    private TableColumn jobIdTC;
    @javafx.fxml.FXML
    private TableView jobCardTV;
    @javafx.fxml.FXML
    private Label titleLabel;
    @javafx.fxml.FXML
    private TableColumn vehicleIdTC;
    @javafx.fxml.FXML
    private TableColumn statusTC;
    @javafx.fxml.FXML
    private ComboBox statusCB;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void updateButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/NowrinView/WorkShopManagerView/U2G1_workshopManagerDashboardView.fxml", "Back");
    }
}