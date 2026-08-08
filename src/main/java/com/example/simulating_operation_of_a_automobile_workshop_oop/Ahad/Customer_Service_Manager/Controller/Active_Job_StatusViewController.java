package com.example.simulating_operation_of_a_automobile_workshop_oop.Ahad.Customer_Service_Manager.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Model.JobCard;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Active_Job_StatusViewController
{
    @javafx.fxml.FXML
    private TableColumn<JobCard,String> customerCol;
    @javafx.fxml.FXML
    private TableColumn<JobCard,String> technicianCol;
    @javafx.fxml.FXML
    private TableColumn<JobCard,String> statusCol;
    @javafx.fxml.FXML
    private TableColumn<JobCard,String> jobIDCol;
    @javafx.fxml.FXML
    private TableView<JobCard> activeJobsTbl;

    @javafx.fxml.FXML
    public void initialize() {
        customerCol.setCellValueFactory(new PropertyValueFactory<>("customerID"));
        technicianCol.setCellValueFactory(new PropertyValueFactory<>("technicianID"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        jobIDCol.setCellValueFactory(new PropertyValueFactory<>("jobCardID"));
    }

    @javafx.fxml.FXML
    public void backBtn(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/Ahad_View/Customer_Service_ManagerView/Customer_Service_ManagerDashboardView.fxml","Customer Service Manager");
    }
}