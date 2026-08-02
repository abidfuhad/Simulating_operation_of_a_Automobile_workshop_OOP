package com.example.simulating_operation_of_a_automobile_workshop_oop.Ahad.Customer.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class InvoiceViewController
{
    @javafx.fxml.FXML
    private TableView invoicesTbl;
    @javafx.fxml.FXML
    private TableColumn invoiceNoCol;
    @javafx.fxml.FXML
    private TableColumn vehicleCol;
    @javafx.fxml.FXML
    private TableColumn paymentStatusCol;
    @javafx.fxml.FXML
    private TableColumn totalCostCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backBtn(ActionEvent actionEvent) {
    }
}