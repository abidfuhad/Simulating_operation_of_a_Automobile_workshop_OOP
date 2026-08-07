package com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.ServiceAdvisor.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Model.Invoice;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Model.JobCard;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.BinaryFileUtil;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class U1G7_generateInvoiceViewController
{
    @javafx.fxml.FXML
    private TableColumn<JobCard, String > vehicleColumn;
    @javafx.fxml.FXML
    private Label totalLabel;
    @javafx.fxml.FXML
    private Label labourChargeLabel;
    @javafx.fxml.FXML
    private TableColumn<JobCard, String > statusColumn;
    @javafx.fxml.FXML
    private Label partsCostLabel;
    @javafx.fxml.FXML
    private TableView<JobCard> completedJobCardTableView;
    @javafx.fxml.FXML
    private TableColumn<JobCard, String > jobIdColumn;

    private ArrayList<JobCard> jobCardArrayList = new ArrayList<>();
    private ArrayList<Invoice> invoiceArrayList = new ArrayList<>();

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
            if(j.getStatus().equals("Completed")){
                completedJobCardTableView.getItems().addAll(jobCardArrayList);
            }
        }
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/AbidView/ServiceAdvisorView/SerAdvDasboardView.fxml","Advisor Dashboard");
    }

    @javafx.fxml.FXML
    public void generateInvoiceButton(ActionEvent actionEvent) {
    }
}