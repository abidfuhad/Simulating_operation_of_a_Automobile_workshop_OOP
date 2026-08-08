package com.example.simulating_operation_of_a_automobile_workshop_oop.Nowrin.WorkShopManager.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Model.JobCard;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class U2G2_approveCompletedJobViewController
{
    @javafx.fxml.FXML
    private TableColumn<JobCard, String> jobIdTC;
    @javafx.fxml.FXML
    private TableColumn<JobCard, String> technicianTC;
    @javafx.fxml.FXML
    private TableView jobCardTV;
    @javafx.fxml.FXML
    private Label titleLabel;
    @javafx.fxml.FXML
    private TableColumn<JobCard, String> vehicleIdTC;
    @javafx.fxml.FXML
    private TableColumn<JobCard, String> statusTC;
    @javafx.fxml.FXML
    private Button backButtonOnAction;

    @javafx.fxml.FXML
    public void initialize() {
        jobIdTC.setCellValueFactory(new PropertyValueFactory<>("jobId"));
        technicianTC.setCellValueFactory(new PropertyValueFactory<>("technician"));
        vehicleIdTC.setCellValueFactory(new PropertyValueFactory<>("vehicleId"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    @javafx.fxml.FXML
    public void reviewButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void approveButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/NowrinView/WorkShopManagerView/U2G1_workshopManagerDashboardView.fxml", "Back");
    }
}