package com.example.simulating_operation_of_a_automobile_workshop_oop.Maharab.Inventory_Manager.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Maharab.Model.InventoryItem;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.BinaryFileUtil;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class LowStockItemsViewController
{
    @javafx.fxml.FXML
    private TableColumn<InventoryItem,Integer> quantityColumn;
    @javafx.fxml.FXML
    private TableView<InventoryItem> lowStockTableView;
    @javafx.fxml.FXML
    private TableColumn<InventoryItem,String> nameColumn;
    @javafx.fxml.FXML
    private TableColumn<InventoryItem,String> itemIdColumn;

    private ArrayList<InventoryItem> inventoryItemArrayList = new ArrayList<>();



    @javafx.fxml.FXML
    public void initialize() {
        inventoryItemArrayList = BinaryFileUtil.readList("Data/Maharab/InventoryItem.bin");
        itemIdColumn.setCellValueFactory(new PropertyValueFactory<>("itemId"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("itemName"));
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/MaharabView/InventoryManagerView/InventoryManagerDashboardView.fxml","Inventory Manager Dashboard");
    }
}