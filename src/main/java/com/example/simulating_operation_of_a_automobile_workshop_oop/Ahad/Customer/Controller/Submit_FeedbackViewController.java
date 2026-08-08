package com.example.simulating_operation_of_a_automobile_workshop_oop.Ahad.Customer.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class Submit_FeedbackViewController
{
    @javafx.fxml.FXML
    private TextArea commentTxtArea;
    @javafx.fxml.FXML
    private ComboBox<String> ratingCombo;
    @javafx.fxml.FXML
    private Label feedbackSuccessfulLabel;

    @javafx.fxml.FXML
    public void initialize() {
        ratingCombo.getItems().addAll("1","2","3","4","5");
    }

    @javafx.fxml.FXML
    public void submitBtn(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backBtn(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/Ahad_View/CustomerView/CustomerDashboardView.fxml","Customer Dashboard");
    }
}