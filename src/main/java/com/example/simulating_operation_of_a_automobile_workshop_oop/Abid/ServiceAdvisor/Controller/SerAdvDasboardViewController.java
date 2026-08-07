package com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.ServiceAdvisor.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.SessionManager;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class SerAdvDasboardViewController
{
    @javafx.fxml.FXML
    private Label advisorIdLabel;
    @javafx.fxml.FXML
    private Label advisorNameLabel;

    @javafx.fxml.FXML
    public void initialize() {

        advisorNameLabel.setText(SessionManager.employee.getName());
        advisorIdLabel.setText(SessionManager.employee.getUserID());

    }

    @javafx.fxml.FXML
    public void vehicleManagementButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/com/example/simulating_operation_of_a_automobile_workshop_oop/AbidView/ServiceAdvisorView/U1G2_registerVehicleView.fxml","Vehicle Management");
    }

    @javafx.fxml.FXML
    public void assignTechnicianButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/AbidView/ServiceAdvisorView/U1G5_assignTechnicianView.fxml","Assign Technician");
    }

    @Deprecated
    public void changePasswordButton(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void logOutButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/com/example/simulating_operation_of_a_automobile_workshop_oop/LoginView/loginView.fxml","Login");
    }

    @javafx.fxml.FXML
    public void updateJobCardButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/AbidView/ServiceAdvisorView/U1G4_updateJobCardView.fxml","updateJobCard");
    }

    @javafx.fxml.FXML
    public void createJobCardButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/AbidView/ServiceAdvisorView/U1G3_createJobCardView.fxml","createJobCard");
    }

    @javafx.fxml.FXML
    public void jobStatusButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/AbidView/ServiceAdvisorView/U1G6_jobStatusView.fxml","jobStatus");
    }

    @javafx.fxml.FXML
    public void invoicesButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/AbidView/ServiceAdvisorView/U1G7_generateInvoiceView.fxml","generateInvoice");
    }

    @javafx.fxml.FXML
    public void customerManagementButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/com/example/simulating_operation_of_a_automobile_workshop_oop/AbidView/ServiceAdvisorView/U1G1_customerManagementView.fxml","Customer Management");
    }

    @javafx.fxml.FXML
    public void closeJobButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/AbidView/ServiceAdvisorView/U1G8_closeJobView.fxml","closeJob");
    }
}