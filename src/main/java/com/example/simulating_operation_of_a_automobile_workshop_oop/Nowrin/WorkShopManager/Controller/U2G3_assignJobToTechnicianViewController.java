package com.example.simulating_operation_of_a_automobile_workshop_oop.Nowrin.WorkShopManager.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Model.JobCard;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class U2G3_assignJobToTechnicianViewController
{
    @javafx.fxml.FXML
    private TableColumn<JobCard, String> jobIdTC;
    @javafx.fxml.FXML
    private ComboBox<String> technicianCB;
    @javafx.fxml.FXML
    private Label titleLabel;
    @javafx.fxml.FXML
    private TableColumn<JobCard,String> vehicleIdTC;
    @javafx.fxml.FXML
    private TableView  jobTV;
    @javafx.fxml.FXML
    private Label technicianLabel;
    @javafx.fxml.FXML
    private TableColumn<JobCard,String> statusTC;
    @javafx.fxml.FXML
    private TableColumn<JobCard, String> jobTypeTC;

    @javafx.fxml.FXML
    public void initialize() {

        technicianCB.getItems().addAll("Technician 1", "Technician 2", "Technician 3");


        jobIdTC.setCellValueFactory(new PropertyValueFactory<>("jobId"));
        vehicleIdTC.setCellValueFactory(new PropertyValueFactory<>("vehicleId"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));
        jobTypeTC.setCellValueFactory(new PropertyValueFactory<>("jobType"));
    }

    @Deprecated
    public void assignButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/NowrinView/WorkShopManagerView/U2G1_workshopManagerDashboardView.fxml", "Back");
    }


    @javafx.fxml.FXML
    public void assignJobButtonOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/NowrinView/WorkShopManagerView/U2G1_workshopManagerDashboardView.fxml", "Back");

    }
}