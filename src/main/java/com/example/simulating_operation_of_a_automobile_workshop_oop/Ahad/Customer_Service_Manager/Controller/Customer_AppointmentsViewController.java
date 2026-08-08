package com.example.simulating_operation_of_a_automobile_workshop_oop.Ahad.Customer_Service_Manager.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Ahad.Model.Appointment;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Customer_AppointmentsViewController
{
    @javafx.fxml.FXML
    private TableColumn<Appointment,String> customerCol;
    @javafx.fxml.FXML
    private TableColumn<Appointment,String> statusCol;
    @javafx.fxml.FXML
    private TableColumn<Appointment,String> vehicleCol;
    @javafx.fxml.FXML
    private TableColumn<Appointment,String> appointmentDateCol;
    @javafx.fxml.FXML
    private TableView<Appointment> appointmentsTbl;

    @javafx.fxml.FXML
    public void initialize() {
        customerCol.setCellValueFactory(new PropertyValueFactory<>("customerId"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        vehicleCol.setCellValueFactory(new PropertyValueFactory<>("vehicleId"));
        appointmentDateCol.setCellValueFactory(new PropertyValueFactory<>("appointmentDate"));
    }

    @javafx.fxml.FXML
    public void backBtn(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/Ahad_View/Customer_Service_ManagerView/Customer_Service_ManagerDashboardView.fxml","Customer Service Manager");
    }
}