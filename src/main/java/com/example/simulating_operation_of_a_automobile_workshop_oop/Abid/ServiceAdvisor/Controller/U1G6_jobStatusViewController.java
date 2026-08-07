package com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.ServiceAdvisor.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Model.JobCard;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.BinaryFileUtil;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class U1G6_jobStatusViewController
{
    @javafx.fxml.FXML
    private TableColumn<JobCard, String > vehicleColumn;
    @javafx.fxml.FXML
    private ComboBox<String > statusFilterComboBox;
    @javafx.fxml.FXML
    private TableColumn<JobCard, String > statusColumn;
    @javafx.fxml.FXML
    private TableView<JobCard>jobCardTableView;
    @javafx.fxml.FXML
    private TableColumn<JobCard, String > jobIdColumn;

    private ArrayList<JobCard> jobCardArrayList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        jobIdColumn.setCellValueFactory(new PropertyValueFactory<>("jobCardID"));
        vehicleColumn.setCellValueFactory(new PropertyValueFactory<>("registrationNo"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        statusFilterComboBox.getItems().addAll(
                "All",
                "Pending",
                "Assigned",
                "In Progress",
                "Completed",
                "Closed"
        );
        statusFilterComboBox.setValue("All");


        loadTable();

    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/AbidView/ServiceAdvisorView/SerAdvDasboardView.fxml","Advisor Dashboard");
    }

    private void loadTable(){
        jobCardArrayList = BinaryFileUtil.readList("Data/JobCard.bin");
        jobCardTableView.getItems().setAll(jobCardArrayList);
    }

    @javafx.fxml.FXML
    public void loadTVButton(ActionEvent actionEvent) {

        String status = statusFilterComboBox.getValue();
        jobCardArrayList = BinaryFileUtil.readList("Data/JobCard.bin");
        jobCardTableView.getItems().clear();

        if(status.equals("All")){
            jobCardTableView.getItems().addAll(jobCardArrayList);
            return;
        }

        for(JobCard j : jobCardArrayList){
            if(j.getStatus().equals(status)){
                jobCardTableView.getItems().add(j);
            }
        }

    }
}