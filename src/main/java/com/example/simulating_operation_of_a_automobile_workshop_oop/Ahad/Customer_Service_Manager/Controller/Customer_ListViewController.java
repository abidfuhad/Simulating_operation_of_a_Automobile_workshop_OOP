package com.example.simulating_operation_of_a_automobile_workshop_oop.Ahad.Customer_Service_Manager.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Ahad.Model.Customer;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class Customer_ListViewController
{
    @javafx.fxml.FXML
    private TableColumn<Customer,String> phoneCol;
    @javafx.fxml.FXML
    private TableView<Customer> customerListTbl;
    @javafx.fxml.FXML
    private TableColumn<Customer,String> nameCol;
    @javafx.fxml.FXML
    private TableColumn<Customer,String> customerIDCol;
    @javafx.fxml.FXML
    private TableColumn<Customer,String> emailCol;
    @javafx.fxml.FXML
    private TextField searchTxtFld;

    @javafx.fxml.FXML
    public void initialize() {
        phoneCol.setCellValueFactory(new PropertyValueFactory<>("phone"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        customerIDCol.setCellValueFactory(new PropertyValueFactory<>("userID"));
        emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));

    }

    @javafx.fxml.FXML
    public void searchBtn(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backBtn(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/Ahad_View/Customer_Service_ManagerView/Customer_Service_ManagerDashboardView.fxml","Customer Service Manager");
    }
}