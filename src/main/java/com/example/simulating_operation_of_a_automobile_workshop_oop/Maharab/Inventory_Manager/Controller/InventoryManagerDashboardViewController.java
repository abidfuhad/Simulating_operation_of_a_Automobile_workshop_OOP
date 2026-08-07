package com.example.simulating_operation_of_a_automobile_workshop_oop.Maharab.Inventory_Manager.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.SessionManager;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class InventoryManagerDashboardViewController
{
    @javafx.fxml.FXML
    private Label InventoryManagerIDLabel;
    @javafx.fxml.FXML
    private Label InventoryManagerNameLabel;

    @javafx.fxml.FXML
    public void initialize() {
        InventoryManagerNameLabel.setText(SessionManager.employee.getName());
        InventoryManagerIDLabel.setText(SessionManager.employee.getUserID());
    }

    @javafx.fxml.FXML
    public void lowStockButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/MaharabView/InventoryManagerView/LowStockItemsView.fxml","LowStockItemsView");
    }

    @javafx.fxml.FXML
    public void AddItemButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/MaharabView/InventoryManagerView/InventoryManagementView.fxml","InventoryManagement");
    }

    @javafx.fxml.FXML
    public void UpdateInventoryButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/MaharabView/InventoryManagerView/UpdateInventoryitemView.fxml","UpdateInventoryitem");
    }

    @javafx.fxml.FXML
    public void updateStockQuantityButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/MaharabView/InventoryManagerView/UpdateStockQuantityView.fxml","UpdateStockQuantity");
    }

    @javafx.fxml.FXML
    public void ViewstockHistoryButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/MaharabView/InventoryManagerView/ViewStockHistoryView.fxml","ViewStockHistory");
    }

    @javafx.fxml.FXML
    public void ViewinventoryReportButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/MaharabView/InventoryManagerView/InventoryReportView.fxml","InventoryReport");
    }

    @javafx.fxml.FXML
    public void searchInventoryButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/MaharabView/InventoryManagerView/SearchInventoryView.fxml","SearchInventory");
    }

    @javafx.fxml.FXML
    public void recordPurchaseButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/MaharabView/InventoryManagerView/InventoryManagementView.fxml","InventoryManagement");
    }

    @javafx.fxml.FXML
    public void logOutButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/LoginView/loginView.fxml","login");
    }
}