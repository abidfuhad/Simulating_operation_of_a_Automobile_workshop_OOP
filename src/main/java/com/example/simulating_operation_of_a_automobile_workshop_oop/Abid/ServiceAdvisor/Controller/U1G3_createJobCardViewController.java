package com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.ServiceAdvisor.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Model.Customer;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Model.JobCard;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Model.Vehicle;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.BinaryFileUtil;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.util.ArrayList;


public class U1G3_createJobCardViewController
{
    @javafx.fxml.FXML
    private ComboBox<String > serviceTypeComboBox;
    @javafx.fxml.FXML
    private ComboBox<String > vehicleComboBox;
    @javafx.fxml.FXML
    private TextArea complaintTextArea;
    @javafx.fxml.FXML
    private ComboBox<String > customerComboBox;
    @javafx.fxml.FXML
    private Label messageLabel;

    ArrayList<JobCard> jobCardArrayList = BinaryFileUtil.readList("Data/JobCard.bin");

    @javafx.fxml.FXML
    public void initialize() {

        ArrayList<Customer> customerArrayList = BinaryFileUtil.readList("Data/Customer.bin");
        for(Customer c: customerArrayList){
            customerComboBox.getItems().add(c.getUserID());
        }

        serviceTypeComboBox.getItems().addAll("Oil Change",
                "Engine Repair",
                "Brake Service",
                "Battery Replacement",
                "Wheel Alignment",
                "General Service");



    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/AbidView/ServiceAdvisorView/SerAdvDasboardView.fxml","Advisor Dashboard");
    }

    @javafx.fxml.FXML
    public void saveJobCardButton(ActionEvent actionEvent) {

        if(!validateInput()){
            return;
        }

        jobCardArrayList = BinaryFileUtil.readList("Data/JobCard.bin");
        String jobCardID = "J" + (jobCardArrayList.size() + 1);

        JobCard jobCard = new JobCard(
                jobCardID,
                customerComboBox.getValue(),
                vehicleComboBox.getValue(),
                complaintTextArea.getText(),
                serviceTypeComboBox.getValue(),
                "Pending",
                "",
                ""
        );
        jobCardArrayList.add((jobCard));

        BinaryFileUtil.saveList("Data/JobCard.bin", jobCardArrayList);
        messageLabel.setText("Job Card " + jobCardID + " created successfully");

        customerComboBox.getSelectionModel().clearSelection();
        vehicleComboBox.getItems().clear();
        serviceTypeComboBox.getSelectionModel().clearSelection();
        complaintTextArea.clear();

    }

    private boolean validateInput(){
        if(customerComboBox.getValue() == null || vehicleComboBox.getValue() == null || serviceTypeComboBox.getValue() == null || complaintTextArea.getText().isBlank()){
            messageLabel.setText("Please fill all fields.");
            return false;
        }
        return true;
    }


    @javafx.fxml.FXML
    public void loadVehicleButton(ActionEvent actionEvent) {
        vehicleComboBox.getItems().clear();
        ArrayList<Vehicle> vehicleArrayList = BinaryFileUtil.readList("Data/Vehicle.bin");
        for(Vehicle v : vehicleArrayList){
            if(v.getCustomerID().equals(customerComboBox.getValue())){
                vehicleComboBox.getItems().add(v.getRegistrationNo());
            }
        }
    }
}