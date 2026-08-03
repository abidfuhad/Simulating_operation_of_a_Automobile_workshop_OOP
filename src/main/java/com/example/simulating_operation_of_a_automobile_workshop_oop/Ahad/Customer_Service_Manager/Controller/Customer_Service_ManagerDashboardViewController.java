package com.example.simulating_operation_of_a_automobile_workshop_oop.Ahad.Customer_Service_Manager.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Customer_Service_ManagerDashboardViewController
{
    @javafx.fxml.FXML
    private Label idLabel;
    @javafx.fxml.FXML
    private Label nameLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void logoutBtn(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/LoginView/loginView.fxml","Login Page");
    }

    @javafx.fxml.FXML
    public void customerFeedbackBtn(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/Ahad_View/Customer_Service_ManagerView/Customer_FeedbackView.fxml","Customer Feedback");
    }

    @javafx.fxml.FXML
    public void changePasswordBtn(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/LoginView/changePasswordView.fxml","Forget password Page");
    }

    @javafx.fxml.FXML
    public void generateCustomerServiceSummaryBtn(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/Ahad_View/Customer_Service_ManagerView/Service_SummaryView.fxml","Generate Customer Service Summary");
    }

    @javafx.fxml.FXML
    public void customerListBtn(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/Ahad_View/Customer_Service_ManagerView/Customer_ListView.fxml","Customer List");
    }

    @javafx.fxml.FXML
    public void activeJobStatusBtn(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/Ahad_View/Customer_Service_ManagerView/Active_Job_StatusView.fxml","Active Job Status");
    }

    @javafx.fxml.FXML
    public void customerAppointmentsBtn(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/Ahad_View/Customer_Service_ManagerView/Customer_AppointmentsView.fxml","Customer Appointments");
    }

    @javafx.fxml.FXML
    public void customerComplaintsBtn(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/Ahad_View/Customer_Service_ManagerView/Customer_ComplaintsView.fxml","Customer Complaints");
    }

    @javafx.fxml.FXML
    public void jobStatusBtn(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/Ahad_View/Customer_Service_ManagerView/Service_HistoryView.fxml","Job Status");
    }

    @javafx.fxml.FXML
    public void serviceHistoryBtn(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/Ahad_View/Customer_Service_ManagerView/Service_HistoryView.fxml","Service History");
    }
}