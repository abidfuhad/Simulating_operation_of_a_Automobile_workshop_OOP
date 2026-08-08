package com.example.simulating_operation_of_a_automobile_workshop_oop.Ahad.Customer_Service_Manager.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Ahad.Model.Complaint;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class Customer_ComplaintsViewController
{
    @javafx.fxml.FXML
    private ComboBox<Complaint> customerNameCombo;
    @javafx.fxml.FXML
    private TextArea descriptionTxtArea;

    @javafx.fxml.FXML
    public void initialize() {
        customerNameCombo.getItems().addAll();
    }

    @javafx.fxml.FXML
    public void submittedBtn(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backBtn(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/Ahad_View/Customer_Service_ManagerView/Customer_Service_ManagerDashboardView.fxml","Customer Service Manager");
    }
}