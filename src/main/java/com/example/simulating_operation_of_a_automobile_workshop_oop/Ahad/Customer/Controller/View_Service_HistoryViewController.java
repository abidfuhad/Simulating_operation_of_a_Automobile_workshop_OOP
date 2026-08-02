package com.example.simulating_operation_of_a_automobile_workshop_oop.Ahad.Customer.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class View_Service_HistoryViewController
{
    @javafx.fxml.FXML
    private ComboBox selectVehicleCombo;
    @javafx.fxml.FXML
    private TableColumn erviceDateCol;
    @javafx.fxml.FXML
    private TableView serviceHistoryTbl;
    @javafx.fxml.FXML
    private TableColumn totalCostCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backBtn(ActionEvent actionEvent) {
    }
}