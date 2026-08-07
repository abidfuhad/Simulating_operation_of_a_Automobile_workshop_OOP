package com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.ServiceAdvisor.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Model.JobCard;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.BinaryFileUtil;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class U1G4_updateJobCardViewController
{
    @javafx.fxml.FXML
    private TextArea notesTextArea;
    @javafx.fxml.FXML
    private ComboBox<String > serviceTypeComboBox;
    @javafx.fxml.FXML
    private TextField jobCardIdField;
    @javafx.fxml.FXML
    private TextArea complaintTextArea;
    @javafx.fxml.FXML
    private Label messageLabel;

    private ArrayList<JobCard>  jobCardArrayList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        serviceTypeComboBox.getItems().addAll(
                "Oil Change",
                "Engine Repair",
                "Brake Service",
                "Battery Replacement",
                "Wheel Alignment",
                "General Service"
        );

    }

    @javafx.fxml.FXML
    public void searchButton(ActionEvent actionEvent) {
        messageLabel.setText("");

        jobCardArrayList = BinaryFileUtil.readList("Data/JobCard.bin");
        String jobCardID = jobCardIdField.getText().trim();

        if(jobCardID.isBlank()){
            messageLabel.setText("Enter Job Card ID.");
            return;
        }

        for(JobCard j : jobCardArrayList){
            if(j.getJobCardID().equals(jobCardID)){
                if(!j.getStatus().equals("Pending")){
                    messageLabel.setText(("Only Pending Job Cards can be updated"));
                    return;
                }

                complaintTextArea.setText(j.getComplaint());
                notesTextArea.setText(j.getNotes());
                serviceTypeComboBox.setValue(j.getServiceType());

                messageLabel.setText("Job Card found.");
                return;
            }
        }
        messageLabel.setText("Job Card not found.");

    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/AbidView/ServiceAdvisorView/SerAdvDasboardView.fxml","Advisor Dashboard");
    }

    @javafx.fxml.FXML
    public void updateButton(ActionEvent actionEvent) {

        if(complaintTextArea.getText().isBlank() || serviceTypeComboBox.getValue() == null){
            messageLabel.setText("Please fill required fields");
            return;
        }

        for(JobCard j : jobCardArrayList){
            if(j.getJobCardID().equals(jobCardIdField.getText())){
                j.setComplaint(complaintTextArea.getText());
                j.setNotes(notesTextArea.getText());
                j.setServiceType(serviceTypeComboBox.getValue());
                break;
            }
        }

        BinaryFileUtil.saveList("Data/JobCard.bin", jobCardArrayList);
        messageLabel.setText("Job Card updated successfully.");


        jobCardIdField.clear();
        complaintTextArea.clear();
        notesTextArea.clear();
        serviceTypeComboBox.getSelectionModel().clearSelection();

    }
}