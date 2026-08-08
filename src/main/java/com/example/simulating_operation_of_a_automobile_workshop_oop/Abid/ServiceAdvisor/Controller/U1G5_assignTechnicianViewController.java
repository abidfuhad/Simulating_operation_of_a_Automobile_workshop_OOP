package com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.ServiceAdvisor.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Model.JobCard;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Shared.Employee;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.BinaryFileUtil;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class U1G5_assignTechnicianViewController
{
    @javafx.fxml.FXML
    private TableColumn<JobCard, String > vehicleColumn;
    @javafx.fxml.FXML
    private TableColumn<JobCard, String > jobCardIdColumn;
    @javafx.fxml.FXML
    private TableColumn<JobCard, String > statusColumn;
    @javafx.fxml.FXML
    private ComboBox<String > technicianComboBox;
    @javafx.fxml.FXML
    private TableView<JobCard> pendingJobCardTableView;
    @javafx.fxml.FXML
    private Label messageLabel;

    private ArrayList<JobCard> jobCardArrayList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        jobCardIdColumn.setCellValueFactory(new PropertyValueFactory<>("jobCardID"));
        vehicleColumn.setCellValueFactory(new PropertyValueFactory<>("registrationNo"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        loadPendingJobCards();
        loadTechnicians();

    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/AbidView/ServiceAdvisorView/SerAdvDasboardView.fxml","Advisor Dashboard");
    }

    @javafx.fxml.FXML
    public void saveButton(ActionEvent actionEvent) {

        JobCard selectedJobCard = pendingJobCardTableView.getSelectionModel().getSelectedItem();

        if(selectedJobCard == null){
            messageLabel.setText("Select a Job Card.");
            return;
        }
        if(technicianComboBox.getValue() == null){
            messageLabel.setText("Select a Technician.");
            return;
        }

        for(JobCard j : jobCardArrayList){
            if(j.getJobCardID().equals(selectedJobCard.getJobCardID())){
                j.setTechnicianID(technicianComboBox.getValue());
                j.setStatus("Assigned");
                break;
            }
        }

        BinaryFileUtil.saveList("Data/JobCard.bin", jobCardArrayList);

        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText("Job Card " + selectedJobCard.getJobCardID() + " assigned to Technician " + technicianComboBox.getValue() + ".");
        a.showAndWait();


        loadPendingJobCards();
        technicianComboBox.getSelectionModel().clearSelection();

    }

    private  void loadPendingJobCards(){
        jobCardArrayList = BinaryFileUtil.readList("Data/JobCard.bin");

        pendingJobCardTableView.getItems().clear();

        for(JobCard j : jobCardArrayList){
            if(j.getStatus().equals("Pending")){
                pendingJobCardTableView.getItems().add(j);
            }
        }
    }

    private void loadTechnicians(){
        ArrayList<Employee> employeeArrayList = BinaryFileUtil.readList("Data/Employee.bin");

        technicianComboBox.getItems().clear();

        for(Employee e : employeeArrayList){
            if(e.getDesignation().equals("Technician")){
                technicianComboBox.getItems().add(e.getUserID());
            }
        }

    }
}