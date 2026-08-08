package com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.ServiceAdvisor.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Model.Vehicle;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Ahad.Model.Customer;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.BinaryFileUtil;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.time.Year;
import java.util.ArrayList;

public class U1G2_registerVehicleViewController
{
    @javafx.fxml.FXML
    private ComboBox<Integer> yearComboBox;
    @javafx.fxml.FXML
    private TextField modelField;
    @javafx.fxml.FXML
    private TextField registrationNoField;
    @javafx.fxml.FXML
    private ComboBox<String> customerComboBox;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TextField brandField;

    ArrayList<Vehicle> vehicleArrayList = BinaryFileUtil.readList("Data/Vehicle.bin");

    @javafx.fxml.FXML
    public void initialize() {

        ArrayList<Customer> customerArrayList = BinaryFileUtil.readList("Data/Customer.bin");

        customerComboBox.getItems().clear();
        for(Customer c : customerArrayList){
            customerComboBox.getItems().add(c.getUserID());
        }

        int curYear = Year.now().getValue();
        for(int i = curYear; i>= 1990; i--){
            yearComboBox.getItems().add(i);
        }

    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/AbidView/ServiceAdvisorView/SerAdvDasboardView.fxml","Advisor Dashboard");
    }

    @javafx.fxml.FXML
    public void addVehicleButton(ActionEvent actionEvent) {

        if(!validateInput()){
            return;
        }
        if(registrationNoExists(registrationNoField.getText())){
            messageLabel.setText("Registration number already exists.");
            return;
        }

        String vehicleID = "v" + (vehicleArrayList.size() + 1);

        Vehicle vehicle = new Vehicle(
                vehicleID,
                customerComboBox.getValue(),
                yearComboBox.getValue(),
                modelField.getText(),
                brandField.getText(),
                registrationNoField.getText()
        );

        vehicleArrayList.add(vehicle);
        BinaryFileUtil.saveList("Data/Vehicle.bin", vehicleArrayList);
        clearFields();
        messageLabel.setText("Vehicle registered successfully.");




    }

    private boolean validateInput(){
        if(registrationNoField.getText().isBlank() ||
                brandField.getText().isBlank() ||
                modelField.getText().isBlank() ||
                customerComboBox.getValue() == null ||
                yearComboBox.getValue() == null){
            messageLabel.setText("Please fill all fields.");
            return false;
        }
        return true;
    }

    private boolean registrationNoExists(String registrationNo){

        for(Vehicle v: vehicleArrayList){
            if(v.getRegistrationNo().equals(registrationNo)) {
                return true;
            }
        }
        return false;
    }

    private void clearFields(){
        registrationNoField.clear();
        brandField.clear();
        modelField.clear();
        customerComboBox.getSelectionModel().clearSelection();
        yearComboBox.getSelectionModel().clearSelection();
        messageLabel.setText("");
    }
}