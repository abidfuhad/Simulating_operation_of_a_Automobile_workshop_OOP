package com.example.simulating_operation_of_a_automobile_workshop_oop.Login.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class loginViewController
{
    @javafx.fxml.FXML
    private PasswordField passwordField;
    @javafx.fxml.FXML
    private TextField userIdField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void loginButton(ActionEvent actionEvent) {
        String userID = userIdField.getText();
        String password = passwordField.getText();
        if(userID.length() == 4){
            if(userID.equals("1234") && password.equals("abc")){
                SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/AbidView/ServiceAdvisorView/SerAdvDasboardView.fxml","ServiceAdvisor Dashboard");
            }
        }
    }
}