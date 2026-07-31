package com.example.simulating_operation_of_a_automobile_workshop_oop.Customer_Service_Manager.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class Active_Job_StatusViewController
{
    @javafx.fxml.FXML
    private TableColumn customerCol;
    @javafx.fxml.FXML
    private TableColumn technicianCol;
    @javafx.fxml.FXML
    private TableColumn statusCol;
    @javafx.fxml.FXML
    private TableColumn jobIDCol;
    @javafx.fxml.FXML
    private TableView activeJobsTbl;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backBtn(ActionEvent actionEvent) {
    }
}