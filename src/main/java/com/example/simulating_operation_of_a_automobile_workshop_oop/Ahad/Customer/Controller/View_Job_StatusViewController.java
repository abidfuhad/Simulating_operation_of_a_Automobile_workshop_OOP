package com.example.simulating_operation_of_a_automobile_workshop_oop.Ahad.Customer.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;

public class View_Job_StatusViewController
{
    @javafx.fxml.FXML
    private TableColumn statusCol;
    @javafx.fxml.FXML
    private TableColumn jobIDCol;
    @javafx.fxml.FXML
    private TableColumn vehicleCol;
    @javafx.fxml.FXML
    private Label jobStatusTbl;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backBtn(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/Ahad_View/CustomerView/CustomerDashboardView.fxml","Customer Dashboard");
    }
}