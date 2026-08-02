package com.example.simulating_operation_of_a_automobile_workshop_oop.Ahad.Customer_Service_Manager.Controller;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class Update_Job_StatusViewController
{
    @javafx.fxml.FXML
    private TableColumn customerCol;
    @javafx.fxml.FXML
    private TableColumn statusCol;
    @javafx.fxml.FXML
    private TextArea customerNoteTxtArea;
    @javafx.fxml.FXML
    private TableColumn jobCardIDCol;
    @javafx.fxml.FXML
    private ComboBox newStatusCombo;
    @javafx.fxml.FXML
    private TableView jobCardsTbl;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void updateBtn(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleJobCardSelected(Event event) {
    }

    @javafx.fxml.FXML
    public void backBtn(ActionEvent actionEvent) {
    }
}