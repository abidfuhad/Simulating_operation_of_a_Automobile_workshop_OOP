package com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Technician.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Model.JobCard;
import com.example.simulating_operation_of_a_automobile_workshop_oop.SessionManager;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.BinaryFileUtil;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class U1G6_recordLabourHoursViewController
{
    @javafx.fxml.FXML
    private TableView<JobCard> assignedJobTableView;
    @javafx.fxml.FXML
    private TableColumn<JobCard, String > vehicleColumn;
    @javafx.fxml.FXML
    private TextField startTimeField;
    @javafx.fxml.FXML
    private TextField endTimeField;
    @javafx.fxml.FXML
    private TableColumn<JobCard, String > statusColumn;
    @javafx.fxml.FXML
    private Label totalHoursLabel;
    @javafx.fxml.FXML
    private TableColumn<JobCard, String > jobIdColumn;
    @javafx.fxml.FXML
    private TableColumn<JobCard, String > complaintColumn;

    private ArrayList<JobCard> jobCardArrayList = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {

        jobIdColumn.setCellValueFactory(new PropertyValueFactory<>("jobCardID"));
        vehicleColumn.setCellValueFactory(new PropertyValueFactory<>("registrationNo"));
        complaintColumn.setCellValueFactory(new PropertyValueFactory<>("complaint"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        loadTV();

    }

    private void loadTV(){

        jobCardArrayList = BinaryFileUtil.readList("Data/JobCard.bin");
        assignedJobTableView.getItems().clear();
        String technicianID = SessionManager.employee.getUserID();
        for(JobCard j : jobCardArrayList){
            if(j.getTechnicianID().equals(technicianID) && j.getStatus().equals("Completed")){
                assignedJobTableView.getItems().add(j);
            }
        }

    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/AbidView/TechnicianView/TechnicianDashboardView.fxml","Technician Dashboard");
    }

    @javafx.fxml.FXML
    public void saveButton(ActionEvent actionEvent) {

        JobCard selectedJob = assignedJobTableView.getSelectionModel().getSelectedItem();

        if(startTimeField.getText().isBlank() || endTimeField.getText().isBlank()){
            totalHoursLabel.setText("Enter both times.");
            return;
        }



    }
}