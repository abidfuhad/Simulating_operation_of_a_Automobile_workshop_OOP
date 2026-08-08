package com.example.simulating_operation_of_a_automobile_workshop_oop.Ahad.Customer.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.SessionManager;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class CustomerDashboardViewController
{
    @javafx.fxml.FXML
    private Label idLabel;
    @javafx.fxml.FXML
    private Label nameLabel;

    @javafx.fxml.FXML
    public void initialize() {
        nameLabel.setText(SessionManager.customer.getName());
        idLabel.setText(SessionManager.customer.getUserID());
    }

    @javafx.fxml.FXML
    public void viewInvoiceBtn(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/Ahad_View/CustomerView/InvoiceView.fxml","View Invoice");
    }

    @javafx.fxml.FXML
    public void profileUpdateBtn(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/Ahad_View/CustomerView/Update_ProfileView.fxml","Profile Update");
    }

    @javafx.fxml.FXML
    public void logoutBtn(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/LoginView/loginView.fxml","Customer Login Page");

    }

    @javafx.fxml.FXML
    public void viewJobStatusBtn(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/Ahad_View/CustomerView/View_Job_StatusView.fxml","View Job Status");
    }

    @javafx.fxml.FXML
    public void bookServiceAppointmentBtn(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/Ahad_View/CustomerView/Book_Service_AppointmentView.fxml","Book Service Appointment");
    }

    @javafx.fxml.FXML
    public void submitFeedbackBtn(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/Ahad_View/CustomerView/Submit_FeedbackView.fxml","Submit Feedback");
    }

    @javafx.fxml.FXML
    public void viewServiceHistoryBtn(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/Ahad_View/CustomerView/View_Service_HistoryView.fxml","View Service History");
    }

    @javafx.fxml.FXML
    public void viewMyAppointmentsBtn(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/Ahad_View/CustomerView/View_My_AppointmentsView.fxml","View My Appointments");
    }

    @javafx.fxml.FXML
    public void registerVehicleBtn(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/Ahad_View/CustomerView/Register_VehicleView.fxml","Register Vehicle");
    }
}