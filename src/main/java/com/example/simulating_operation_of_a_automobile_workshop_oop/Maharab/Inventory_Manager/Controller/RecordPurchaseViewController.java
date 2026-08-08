package com.example.simulating_operation_of_a_automobile_workshop_oop.Maharab.Inventory_Manager.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Maharab.Model.InventoryItem;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Maharab.Model.Supplier;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class RecordPurchaseViewController
{
    @javafx.fxml.FXML
    private TableView<InventoryItem> purchaseItemsTableView;
    @javafx.fxml.FXML
    private TableColumn<InventoryItem, Integer> quantityColumn;
    @javafx.fxml.FXML
    private TableColumn<InventoryItem , String> itemColumn;
    @javafx.fxml.FXML
    private ComboBox<Supplier> selectSupplierCombobox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void savepurchaseButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/MaharabView/InventoryManagerView/InventoryManagerDashboardView.fxml","Inventory Manager Dashboard");
    }
}