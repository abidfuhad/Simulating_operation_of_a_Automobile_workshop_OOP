package com.example.simulating_operation_of_a_automobile_workshop_oop.Ahad.Customer_Service_Manager.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class Service_HistoryViewController
{
    @javafx.fxml.FXML
    private TableColumn dateCol;
    @javafx.fxml.FXML
    private TextField customerNameTxtFld;
    @javafx.fxml.FXML
    private TableView serviceHistoryTbl;
    @javafx.fxml.FXML
    private TableColumn costCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void searchBtn(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backBtn(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/Ahad_View/Customer_Service_ManagerView/Customer_Service_ManagerDashboardView.fxml","Customer Service Manager");
    }
}