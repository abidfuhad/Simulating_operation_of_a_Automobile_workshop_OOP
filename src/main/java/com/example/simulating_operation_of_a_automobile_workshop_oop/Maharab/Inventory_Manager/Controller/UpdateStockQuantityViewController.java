package com.example.simulating_operation_of_a_automobile_workshop_oop.Maharab.Inventory_Manager.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Maharab.Model.InventoryItem;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.BinaryFileUtil;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class UpdateStockQuantityViewController
{
    @javafx.fxml.FXML
    private ComboBox<InventoryItem> selectItemCombobox;
    @javafx.fxml.FXML
    private TextField quantityAddedField;
    @javafx.fxml.FXML
    private TextField quantityRemovedField;

    private ArrayList<InventoryItem>inventoryItemArrayList = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {

        inventoryItemArrayList = BinaryFileUtil.readList("Data/Maharab/InventoryItem.bin");
        selectItemCombobox.getItems().addAll(inventoryItemArrayList);

    }

    @javafx.fxml.FXML
    public void BackButon(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/MaharabView/InventoryManagerView/InventoryManagerDashboardView.fxml","Inventory Manager Dashboard");
    }

    @javafx.fxml.FXML
    public void saveButton(ActionEvent actionEvent) {
    }
}