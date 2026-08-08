package com.example.simulating_operation_of_a_automobile_workshop_oop.Ahad.Customer_Service_Manager.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Model.JobCard;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

public class Update_Job_StatusViewController
{
    @javafx.fxml.FXML
    private TableColumn<JobCard,String> customerCol;
    @javafx.fxml.FXML
    private TableColumn<JobCard,String> statusCol;
    @javafx.fxml.FXML
    private TextArea customerNoteTxtArea;
    @javafx.fxml.FXML
    private TableColumn<JobCard,String> jobCardIDCol;
    @javafx.fxml.FXML
    private ComboBox<String> newStatusCombo;
    @javafx.fxml.FXML
    private TableView<JobCard> jobCardsTbl;

    @javafx.fxml.FXML
    public void initialize() {
        customerCol.setCellValueFactory(new PropertyValueFactory<>("customerID"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        jobCardIDCol.setCellValueFactory(new PropertyValueFactory<>("jobCardID"));
        newStatusCombo.getItems().addAll("");
    }

    @javafx.fxml.FXML
    public void updateBtn(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleJobCardSelected(Event event) {
    }

    @javafx.fxml.FXML
    public void backBtn(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/Ahad_View/Customer_Service_ManagerView/Customer_Service_ManagerDashboardView.fxml","Customer Service Manager");
    }
}