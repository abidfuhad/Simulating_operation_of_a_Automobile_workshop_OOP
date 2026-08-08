package com.example.simulating_operation_of_a_automobile_workshop_oop.Maharab.Body_Paint_Supervisor.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Model.JobCard;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class AddRepairNotesViewController
{
    @javafx.fxml.FXML
    private TableColumn<JobCard, String> vehicleColumn;
    @javafx.fxml.FXML
    private TableView<JobCard> jobsTableView;
    @javafx.fxml.FXML
    private TableColumn<JobCard,String> statusColumn;
    @javafx.fxml.FXML
    private TextArea noteTextArea;
    @javafx.fxml.FXML
    private TableColumn<JobCard,String> jobIdColumn;

    private ArrayList<JobCard> jobCardArrayList = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {
        jobIdColumn.setCellValueFactory(new PropertyValueFactory<>("jobCardID"));
        vehicleColumn.setCellValueFactory(new PropertyValueFactory<>("registrationNo"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));



    }

    @javafx.fxml.FXML
    public void saveNoteButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/MaharabView/BodyPaintSupervisorView/BodyPaintSupervisorDashboardView.fxml","Body Paint Supervisor Dashboard");
    }
}