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
    private ComboBox<String> categoryCombobox;
    @javafx.fxml.FXML
    private TextField unitpriceField;
    @javafx.fxml.FXML
    private TableView<InventoryItem> additemTableView;
    @javafx.fxml.FXML
    private TableColumn supplierColumn;
    @javafx.fxml.FXML
    private TextField quantityField;
    @javafx.fxml.FXML
    private ComboBox<Supplier> supplierCombobox;
    @javafx.fxml.FXML
    private TextField itemidField;

    private ArrayList<InventoryItem> inventoryItemArrayList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        inventoryItemArrayList = BinaryFileUtil.readList("Data/Maharab/InventoryItem.bin");

        categoryCombobox.getItems().addAll("Engine","Electrical","Paint","Body","Oil");

        supplierCombobox.getItems().addAll("Navana","ACI","RFL");



        itemidColumn.setCellValueFactory(new PropertyValueFactory<>("itemId"));
        NameColumn.setCellValueFactory(new PropertyValueFactory<>("itemName"));
        categoryColumn.setCellValueFactory(new PropertyValueFactory<>("category"));
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        unitpriceColumn.setCellValueFactory(new PropertyValueFactory<>("unitPrice"));
        supplierColumn.setCellValueFactory(new PropertyValueFactory<>("supplier"));

        additemTableView.getItems().setAll(inventoryItemArrayList);
    }

    @javafx.fxml.FXML
    public void BackButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/MaharabView/InventoryManagerView/InventoryManagerDashboardView.fxml","Inventory Manager Dashboard");
    }

    @javafx.fxml.FXML
    public void saveButton(ActionEvent actionEvent) {

    }
}