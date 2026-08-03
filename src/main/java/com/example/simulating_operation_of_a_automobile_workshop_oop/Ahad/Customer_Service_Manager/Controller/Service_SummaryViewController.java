package com.example.simulating_operation_of_a_automobile_workshop_oop.Ahad.Customer_Service_Manager.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class Service_SummaryViewController
{
    @javafx.fxml.FXML
    private TableView serviceSummaryTbl;
    @javafx.fxml.FXML
    private TableColumn totalCustomersCol;
    @javafx.fxml.FXML
    private TableColumn completedJobsCol;
    @javafx.fxml.FXML
    private TableColumn appointmentsCol;
    @javafx.fxml.FXML
    private TableColumn openComplaintsCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backBtn(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/Ahad_View/Customer_Service_ManagerView/Customer_Service_ManagerDashboardView.fxml","Customer Service Manager");
    }
}