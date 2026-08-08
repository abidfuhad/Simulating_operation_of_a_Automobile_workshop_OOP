package com.example.simulating_operation_of_a_automobile_workshop_oop.Ahad.Customer.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Model.JobCard;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Model.Vehicle;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

public class View_Job_StatusViewController
{
    @javafx.fxml.FXML
    private TableColumn<JobCard,String> statusCol;
    @javafx.fxml.FXML
    private TableColumn<JobCard,String> jobIDCol;
    @javafx.fxml.FXML
    private TableColumn<Vehicle,String> vehicleCol;
    @javafx.fxml.FXML
    private Label jobStatusTbl;

    @javafx.fxml.FXML
    public void initialize() {
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        jobIDCol.setCellValueFactory(new PropertyValueFactory<>("jobCardID"));
        vehicleCol.setCellValueFactory(new PropertyValueFactory<>("vehicleID"));
    }

    @javafx.fxml.FXML
    public void backBtn(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/Ahad_View/CustomerView/CustomerDashboardView.fxml","Customer Dashboard");
    }
}