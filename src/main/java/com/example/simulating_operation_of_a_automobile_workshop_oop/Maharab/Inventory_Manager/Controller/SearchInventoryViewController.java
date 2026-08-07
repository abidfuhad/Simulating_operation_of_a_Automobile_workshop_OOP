package com.example.simulating_operation_of_a_automobile_workshop_oop.Maharab.Inventory_Manager.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Maharab.Model.InventoryItem;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.BinaryFileUtil;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class SearchInventoryViewController
{

    @javafx.fxml.FXML
    private TableColumn<InventoryItem, Integer> quantityColumn;
    @javafx.fxml.FXML
    private TextField searchField;
    @javafx.fxml.FXML
    private TableColumn<InventoryItem, String> nameColumn;
    @javafx.fxml.FXML
    private TableColumn<InventoryItem, String> itemIdColumn;
    @javafx.fxml.FXML
    private TableView<InventoryItem> resultsTableView;
    @javafx.fxml.FXML
    private TableColumn categoryColumn;

    private ArrayList<InventoryItem> inventoryItemArrayList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        inventoryItemArrayList = BinaryFileUtil.readList("Data/Maharab/InventoryItem.bin");

        itemIdColumn.setCellValueFactory(new PropertyValueFactory<>("itemId"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("itemName"));
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        categoryColumn.setCellValueFactory(new PropertyValueFactory<>("category"));

        resultsTableView.getItems().setAll(inventoryItemArrayList);



    }

    @javafx.fxml.FXML
    public void searchButton(ActionEvent actionEvent) {
    }


    @Deprecated
    public void BackButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/MaharabView/InventoryManagerView/InventoryManagerDashboardView.fxml","Inventory Manager Dashboard");
    }

    @Deprecated
    public void saveButton(ActionEvent actionEvent) {
    }
}