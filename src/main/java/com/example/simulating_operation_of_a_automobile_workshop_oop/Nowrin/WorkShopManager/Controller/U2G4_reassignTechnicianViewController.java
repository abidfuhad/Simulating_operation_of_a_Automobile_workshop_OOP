package com.example.simulating_operation_of_a_automobile_workshop_oop.Nowrin.WorkShopManager.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class U2G4_reassignTechnicianViewController
{
    @javafx.fxml.FXML
    private TableColumn jobIdTC;
    @javafx.fxml.FXML
    private TableColumn vehicleIdTC;
    @javafx.fxml.FXML
    private TableView jobTV;
    @javafx.fxml.FXML
    private ComboBox newTechnicianComboBox;
    @javafx.fxml.FXML
    private Label newTechinicianLabel;
    @javafx.fxml.FXML
    private TableColumn currentTechnicianTC;
    @javafx.fxml.FXML
    private DatePicker reassignDatePicker;
    @javafx.fxml.FXML
    private Button reassignTechnicianOnActionButton;
    @javafx.fxml.FXML
    private Label reassignDateLabel;
    @javafx.fxml.FXML
    private Label reassignTechnicianLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/NowrinView/WorkShopManagerView/U2G1_workshopManagerDashboardView.fxml", "Back");
    }
}