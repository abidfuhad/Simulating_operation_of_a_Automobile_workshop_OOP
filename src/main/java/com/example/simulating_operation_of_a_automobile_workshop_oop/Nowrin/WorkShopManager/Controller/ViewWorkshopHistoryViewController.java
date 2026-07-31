package com.example.simulating_operation_of_a_automobile_workshop_oop.Nowrin.WorkShopManager.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ViewWorkshopHistoryViewController
{
    @javafx.fxml.FXML
    private TableColumn completionDateTC;
    @javafx.fxml.FXML
    private Label titleLabel;
    @javafx.fxml.FXML
    private TableColumn assignedTechnicianTC;
    @javafx.fxml.FXML
    private TableColumn completedJobTC;
    @javafx.fxml.FXML
    private TableView historyTV;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
    }
}