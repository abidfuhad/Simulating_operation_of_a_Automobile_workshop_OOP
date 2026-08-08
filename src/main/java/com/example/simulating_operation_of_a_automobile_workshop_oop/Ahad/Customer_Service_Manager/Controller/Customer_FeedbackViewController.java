package com.example.simulating_operation_of_a_automobile_workshop_oop.Ahad.Customer_Service_Manager.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Ahad.Model.Complaint;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Ahad.Model.Feedback;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Customer_FeedbackViewController
{
    @javafx.fxml.FXML
    private TableView<Feedback> feedbackTbl;
    @javafx.fxml.FXML
    private TableColumn<Feedback,String> customerNameCol;
    @javafx.fxml.FXML
    private TableColumn<Feedback,String> commentCol;
    @javafx.fxml.FXML
    private TableColumn<Feedback,Integer> ratingCol;

    @javafx.fxml.FXML
    public void initialize() {
        commentCol.setCellValueFactory(new PropertyValueFactory<>("comment"));
        ratingCol.setCellValueFactory(new PropertyValueFactory<>("rating"));
        customerNameCol.setCellValueFactory(new PropertyValueFactory<>("customerName"));
    }

    @javafx.fxml.FXML
    public void backBtn(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/Ahad_View/Customer_Service_ManagerView/Customer_Service_ManagerDashboardView.fxml","Customer Service Manager");
    }
}