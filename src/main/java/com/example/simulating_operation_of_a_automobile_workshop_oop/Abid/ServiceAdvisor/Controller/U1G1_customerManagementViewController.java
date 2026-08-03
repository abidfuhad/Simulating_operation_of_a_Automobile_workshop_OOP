package com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.ServiceAdvisor.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Model.Customer;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.BinaryFileUtil;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;
import java.util.Currency;

public class U1G1_customerManagementViewController
{
    @javafx.fxml.FXML
    private TableColumn<Customer, String> addressColumn;
    @javafx.fxml.FXML
    private TableColumn<Customer, String> nameColumn;
    @javafx.fxml.FXML
    private TextField searchField;
    @javafx.fxml.FXML
    private TextField updatePhoneField;
    @javafx.fxml.FXML
    private TextField updateEmailField;
    @javafx.fxml.FXML
    private TableView<Customer> customerTableView;
    @javafx.fxml.FXML
    private TableColumn<Customer, String> customerIdColumn;
    @javafx.fxml.FXML
    private TableColumn<Customer, String> phoneColumn;
    @javafx.fxml.FXML
    private TableColumn<Customer, String> emailColumn;

    private ArrayList<Customer> customerArrayList = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {




        customerIdColumn.setCellValueFactory(new PropertyValueFactory<>("userID"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        phoneColumn.setCellValueFactory(new PropertyValueFactory<>("phone"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));
        addressColumn.setCellValueFactory(new PropertyValueFactory<>("address"));

        loadTV();
    }

    private void loadTV(){
        customerArrayList = BinaryFileUtil.readList("Data/Customer.bin");


        customerTableView.getItems().setAll(customerArrayList);

    }

    @javafx.fxml.FXML
    public void searchButton(ActionEvent actionEvent) {
        loadTV();

        String phone = searchField.getText().trim();

        if(phone.isEmpty()){
            return;
        }

        customerTableView.getItems().clear();

        for(Customer c : customerArrayList){
            if(c.getPhone().contains(phone)){
                customerTableView.getItems().add(c);
            }
        }



    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {

        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/AbidView/ServiceAdvisorView/SerAdvDasboardView.fxml","ServiceAdvisor Dashboard");
    }

    @javafx.fxml.FXML
    public void updateCustomerButton(ActionEvent actionEvent) {

        Customer selectedCustomer = customerTableView.getSelectionModel().getSelectedItem();

        if(selectedCustomer == null){
            return;
        }

        if(updatePhoneField.getText().isBlank() && updateEmailField.getText().isBlank()){
            return;
        }

        for(Customer c : customerArrayList){
            if(c.getUserID().equals(selectedCustomer.getUserID())){
                if(!updatePhoneField.getText().isBlank()){
                    c.setPhone(updatePhoneField.getText());
                }
                if(!updateEmailField.getText().isBlank()){
                    c.setEmail(updateEmailField.getText());
                }
                break;
            }
        }

        BinaryFileUtil.saveList("Data/Customer.bin", customerArrayList);
        loadTV();

        updateEmailField.clear();
        updatePhoneField.clear();




    }

    @javafx.fxml.FXML
    public void addCustomerButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/AbidView/ServiceAdvisorView/U1G1_addCustomerView.fxml","Add Customer");
    }
}