package com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.ServiceAdvisor.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Model.JobCard;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.BinaryFileUtil;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class U1G8_closeJobViewController
{
    @javafx.fxml.FXML
    private TableColumn vehicleColumn;
    @javafx.fxml.FXML
    private TableColumn statusColumn;
    @javafx.fxml.FXML
    private TableView closableJobCardTableView;
    @javafx.fxml.FXML
    private TableColumn jobIdColumn;
    @javafx.fxml.FXML
    private Label messageLabel;

    private ArrayList<JobCard> jobCardArrayList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        jobIdColumn.setCellValueFactory(new PropertyValueFactory<>("jobCardID"));
        vehicleColumn.setCellValueFactory(new PropertyValueFactory<>("registrationNo"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        loadTV();
    }

    private void loadTV(){

        jobCardArrayList = BinaryFileUtil.readList("Data/JobCard.bin");

        for(JobCard j : jobCardArrayList){
            if(j.getStatus().equals("Payment Done")){
                closableJobCardTableView.getItems().add(j);
            }
        }
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/AbidView/ServiceAdvisorView/SerAdvDasboardView.fxml","Advisor Dashboard");
    }

    @javafx.fxml.FXML
    public void closeJobButton(ActionEvent actionEvent) {
    }
}