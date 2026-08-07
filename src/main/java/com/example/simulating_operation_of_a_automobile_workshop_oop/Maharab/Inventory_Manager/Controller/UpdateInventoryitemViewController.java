package com.example.simulating_operation_of_a_automobile_workshop_oop.Maharab.Inventory_Manager.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Maharab.Model.InventoryItem;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Maharab.Model.Supplier;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.BinaryFileUtil;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;
import java.util.Locale;

public class UpdateInventoryitemViewController
{
    @javafx.fxml.FXML
    private TableColumn itemIdColumn;
    @javafx.fxml.FXML
    private TableColumn unitPriceColumn;
    @javafx.fxml.FXML
    private TextField itemIdField;
    @javafx.fxml.FXML
    private TextField nameField;
    @javafx.fxml.FXML
    private TextField unitPriceField;
    @javafx.fxml.FXML
    private TableColumn categoryColumn;
    @javafx.fxml.FXML
    private TableColumn quantityColumn;
    @javafx.fxml.FXML
    private ComboBox<String> categoryComboBox;
    @javafx.fxml.FXML
    private TableColumn nameColumn;
    @javafx.fxml.FXML
    private TableView<InventoryItem> inventoryTableView;
    @javafx.fxml.FXML
    private TableColumn supplierColumn;
    @javafx.fxml.FXML
    private TextField quantityField;
    @javafx.fxml.FXML
    private ComboBox<Supplier> supplierComboBox;

    private ArrayList<InventoryItem> inventoryItemArrayList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        inventoryItemArrayList = BinaryFileUtil.readList("Data/Maharab/InventoryItem.bin");

        categoryComboBox.getItems().addAll("Engine","Electrical","Paint","Body","Oil");




        itemIdColumn.setCellValueFactory(new PropertyValueFactory<>("itemId"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("itemName"));
        categoryColumn.setCellValueFactory(new PropertyValueFactory<>("category"));
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        unitPriceColumn.setCellValueFactory(new PropertyValueFactory<>("unitPrice"));
        supplierColumn.setCellValueFactory(new PropertyValueFactory<>("supplier"));

        inventoryTableView.getItems().setAll(inventoryItemArrayList);


    }

    @javafx.fxml.FXML
    public void UpdateButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void BackButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/MaharabView/InventoryManagerView/InventoryManagerDashboardView.fxml","Inventory Manager Dashboard");
    }
}