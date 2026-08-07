package com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Technician.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Model.JobCard;
import com.example.simulating_operation_of_a_automobile_workshop_oop.SessionManager;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.BinaryFileUtil;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;
import java.util.function.BiConsumer;

public class U1G1_assigendJobsViewController
{
    @javafx.fxml.FXML
    private TableView<JobCard> assignedJobTableView;
    @javafx.fxml.FXML
    private TableColumn<JobCard, String > vehicleColumn;
    @javafx.fxml.FXML
    private ComboBox<String > statusFilterComboBox;
    @javafx.fxml.FXML
    private TableColumn<JobCard, String > statusColumn;
    @javafx.fxml.FXML
    private TableColumn<JobCard, String > jobIdColumn;
    @javafx.fxml.FXML
    private TableColumn<JobCard,String > complaintColumn;

    private ArrayList<JobCard> jobCardArrayList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        jobIdColumn.setCellValueFactory(new PropertyValueFactory<>("jobCardID"));
        vehicleColumn.setCellValueFactory(new PropertyValueFactory<>("registrationNo"));
        complaintColumn.setCellValueFactory(new PropertyValueFactory<>("complaint"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        statusFilterComboBox.getItems().addAll(
                "All",
                "Assigned",
                "In Progress",
                "Completed"
        );

        statusFilterComboBox.setValue("All");


        loadTV();

    }

    private void loadTV(){

        jobCardArrayList = BinaryFileUtil.readList("Data/JobCard.bin");
        assignedJobTableView.getItems().clear();

        String technicianID = SessionManager.employee.getUserID();

        for(JobCard j : jobCardArrayList){
            if(j.getTechnicianID().equals(technicianID)){
                assignedJobTableView.getItems().add(j);
            }
        }

    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/AbidView/TechnicianView/TechnicianDashboardView.fxml","Technician Dashboard");
    }

    @javafx.fxml.FXML
    public void loadTVButton(ActionEvent actionEvent) {

        loadTV();

        String status = statusFilterComboBox.getValue();

        if(status.equals("All")){
            return;
        }

        assignedJobTableView.getItems().clear();

        String technicianID = SessionManager.employee.getUserID();

        for(JobCard j : jobCardArrayList){
            if(j.getTechnicianID().equals(technicianID)&& j.getStatus().equals(status)){
                assignedJobTableView.getItems().add(j);
            }
        }

    }
}