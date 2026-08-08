package com.example.simulating_operation_of_a_automobile_workshop_oop.Ahad.Customer.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Ahad.Model.Appointment;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class View_My_AppointmentsViewController
{
    @javafx.fxml.FXML
    private TableColumn<Appointment,String> appointmentIDCol;
    @javafx.fxml.FXML
    private TableColumn<Appointment,String> dateCol;
    @javafx.fxml.FXML
    private TableColumn<Appointment,String> statusCol;
    @javafx.fxml.FXML
    private TableColumn<Appointment,String> vehicleCol;
    @javafx.fxml.FXML
    private TableView<Appointment> appointmentsTbl;

    @javafx.fxml.FXML
    public void initialize() {
        appointmentIDCol.setCellValueFactory(new PropertyValueFactory<>("appointmentId"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("appointmentDate"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        vehicleCol.setCellValueFactory(new PropertyValueFactory<>("vehicleId"));
        appointmentIDCol.setCellValueFactory(new PropertyValueFactory<>("appointmentId"));
    }

    @javafx.fxml.FXML
    public void backBtn(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/Ahad_View/CustomerView/CustomerDashboardView.fxml","Customer Dashboard");
    }
}