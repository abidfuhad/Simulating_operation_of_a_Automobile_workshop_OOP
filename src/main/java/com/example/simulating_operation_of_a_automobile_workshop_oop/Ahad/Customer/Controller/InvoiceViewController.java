package com.example.simulating_operation_of_a_automobile_workshop_oop.Ahad.Customer.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Model.Invoice;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Model.Vehicle;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class InvoiceViewController
{
    @javafx.fxml.FXML
    private TableView<Invoice> invoicesTbl;
    @javafx.fxml.FXML
    private TableColumn<Invoice,Integer> invoiceNoCol;
    @javafx.fxml.FXML
    private TableColumn<Vehicle,String> vehicleCol;
    @javafx.fxml.FXML
    private TableColumn<Invoice,String> paymentStatusCol;
    @javafx.fxml.FXML
    private TableColumn<Invoice,Double> totalCostCol;

    @javafx.fxml.FXML
    public void initialize() {
        invoiceNoCol.setCellValueFactory(new PropertyValueFactory<>("invoiceID"));
        vehicleCol.setCellValueFactory(new PropertyValueFactory<>("vehicleID"));
        paymentStatusCol.setCellValueFactory(new PropertyValueFactory<>("paymentStatus"));
        totalCostCol.setCellValueFactory(new PropertyValueFactory<>("totalAmount"));
    }

    @javafx.fxml.FXML
    public void backBtn(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/Ahad_View/CustomerView/CustomerDashboardView.fxml","Customer Dashboard");
    }
}