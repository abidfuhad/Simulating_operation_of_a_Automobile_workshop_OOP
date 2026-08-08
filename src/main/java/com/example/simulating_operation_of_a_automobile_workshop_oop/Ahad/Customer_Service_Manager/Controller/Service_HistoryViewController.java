package com.example.simulating_operation_of_a_automobile_workshop_oop.Ahad.Customer_Service_Manager.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Model.Invoice;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Model.ServiceRecord;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class Service_HistoryViewController
{
    @javafx.fxml.FXML
    private TableColumn<ServiceRecord,String> dateCol;
    @javafx.fxml.FXML
    private TextField customerNameTxtFld;
    @javafx.fxml.FXML
    private TableView<ServiceRecord> serviceHistoryTbl;
    @javafx.fxml.FXML
    private TableColumn<Invoice,String> costCol;

    @javafx.fxml.FXML
    public void initialize() {
        dateCol.setCellValueFactory(new PropertyValueFactory<>(""));
        costCol.setCellValueFactory(new PropertyValueFactory<>("totalAmount"));
    }

    @javafx.fxml.FXML
    public void searchBtn(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backBtn(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/Ahad_View/Customer_Service_ManagerView/Customer_Service_ManagerDashboardView.fxml","Customer Service Manager");
    }
}