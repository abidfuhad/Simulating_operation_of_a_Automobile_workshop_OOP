package com.example.simulating_operation_of_a_automobile_workshop_oop.Inventory_Manager.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class InventoryManagementViewController
{
    @javafx.fxml.FXML
    private TableColumn NameColumn;
    @javafx.fxml.FXML
    private TextField nameField;
    @javafx.fxml.FXML
    private TableColumn unitpriceColumn;
    @javafx.fxml.FXML
    private TableColumn categoryColumn;
    @javafx.fxml.FXML
    private TableColumn itemidColumn;
    @javafx.fxml.FXML
    private TableColumn quantityColumn;
    @javafx.fxml.FXML
    private ComboBox categoryCombobox;
    @javafx.fxml.FXML
    private TextField unitpriceField;
    @javafx.fxml.FXML
    private TableView additemTableView;
    @javafx.fxml.FXML
    private TableColumn supplierColumn;
    @javafx.fxml.FXML
    private TextField quantityField;
    @javafx.fxml.FXML
    private ComboBox supplierCombobox;
    @javafx.fxml.FXML
    private TextField itemidField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void BackButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void saveButton(ActionEvent actionEvent) {
    }
}