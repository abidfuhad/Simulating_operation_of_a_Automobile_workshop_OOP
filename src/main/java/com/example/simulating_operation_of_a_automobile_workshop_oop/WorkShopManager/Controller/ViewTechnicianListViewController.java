package com.example.simulating_operation_of_a_automobile_workshop_oop.WorkShopManager.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ViewTechnicianListViewController
{
    @javafx.fxml.FXML
    private Label titleLabel;
    @javafx.fxml.FXML
    private TableView technicianTV;
    @javafx.fxml.FXML
    private TableColumn assignedJobsTC;
    @javafx.fxml.FXML
    private TableColumn statusTC;
    @javafx.fxml.FXML
    private TableColumn technicianNameTC;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
    }
}