package com.example.simulating_operation_of_a_automobile_workshop_oop.Login.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Model.ServiceAdvisor;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Shared.Employee;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Shared.User;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.BinaryFileUtil;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class loginViewController {

import java.util.ArrayList;

public class loginViewController
{

    @javafx.fxml.FXML
    private PasswordField passwordField;
    @javafx.fxml.FXML
    private TextField userIdField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void loginButton(ActionEvent actionEvent) {
        String userID = userIdField.getText();
        String password = passwordField.getText();

        if (userID.length() == 4) {
            if (userID.equals("0001") && password.equals("0001")) {
                SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/AbidView/ServiceAdvisorView/SerAdvDasboardView.fxml", "ServiceAdvisor Dashboard");
            } else if (userID.equals("0002") && password.equals("0002")) {
                SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/AbidView/TechnicianView/TechnicianDashboardView.fxml", "Technician Dashboard");
            } else if (userID.equals("7001") && password.equals("7001")) {
                SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/NowrinView/HRManagerView/HrManagerDashboardView.fxml", "HrManager Dashboard");
            } else if (userID.equals("7002") && password.equals("7002")) {
                SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/NowrinView/WorkShopManagerView/U2G1_workshopManagerDashboardView.fxml", "WorkshopManager Dashboard");
            } else if (userID.equals("5001") && password.equals("5001")) {
                SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/Ahad_View/CustomerView/CustomerDashboardView.fxml", "Customer Dashboard");
            } else if (userID.equals("6001") && password.equals("6001")) {
                SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/Ahad_View/Customer_Service_ManagerView/Customer_Service_ManagerDashboardView.fxml", "Customer Service Manager Dashboard");
            }

        }