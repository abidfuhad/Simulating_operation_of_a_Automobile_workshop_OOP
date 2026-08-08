package com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.ServiceAdvisor.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Ahad.Model.Customer;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.BinaryFileUtil;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class U1G1_addCustomerViewController
{
    @javafx.fxml.FXML
    private TextField nameField;
    @javafx.fxml.FXML
    private TextField emailField;
    @javafx.fxml.FXML
    private TextField addressField;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TextField phoneField;
    @javafx.fxml.FXML
    private TextField idField;
    @javafx.fxml.FXML
    private TextField passwordField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/AbidView/ServiceAdvisorView/U1G1_customerManagementView.fxml","Customer Management");
    }

    @javafx.fxml.FXML
    public void saveButton(ActionEvent actionEvent) {

        if(!validateInput()){
            return;
        }

        if(customerExists(idField.getText())){
            messageLabel.setText("Customer ID already exists.");
            return;
        }


        Customer customer = new Customer(
                idField.getText(),
                nameField.getText(),
                phoneField.getText(),
                emailField.getText(),
                passwordField.getText(),
                addressField.getText()
        );

        ArrayList<Customer> customerArrayList = BinaryFileUtil.readList("Data/Customer.bin");
        customerArrayList.add(customer);
        BinaryFileUtil.saveList("Data/Customer.bin", customerArrayList);
        messageLabel.setText("Customer added successfully.");


        clearFields();

    }

    private boolean validateInput(){
        if(idField.getText().isBlank()  || nameField.getText().isBlank() || phoneField.getText().isBlank() || emailField.getText().isBlank() || passwordField.getText().isBlank() || addressField.getText().isBlank()){
            messageLabel.setText(("Please fill all fields."));
            return false;
        }
        else{
            return true;
        }
    }

    private boolean customerExists(String id){

        ArrayList<Customer> customerArrayList = BinaryFileUtil.readList("Data/Customer.bin");

        for(Customer c : customerArrayList){
            if(c.getUserID().equals(id)){
                return true;
            }
        }
        return  false;
    }

    private void clearFields(){
        idField.clear();
        nameField.clear();
        phoneField.clear();
        emailField.clear();
        passwordField.clear();
        addressField.clear();
    }
}