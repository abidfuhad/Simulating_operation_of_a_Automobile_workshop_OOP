package com.example.simulating_operation_of_a_automobile_workshop_oop.Nowrin.WorkShopManager.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class U2G1_workshopManagerDashboardViewController {

    @javafx.fxml.FXML
    private ComboBox statusComboBox;
    @javafx.fxml.FXML
    private Label technicianLabel;
    @javafx.fxml.FXML
    private ComboBox technicianComboBox;
    @javafx.fxml.FXML
    private Label customerNameLabel;
    @javafx.fxml.FXML
    private Label vehicleNoLabel;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void logoutButtonOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/LoginView/loginView.fxml", "Login");
        ;
    }


    @Deprecated
    public void backButtonOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/NowrinView/WorkShopManagerView/U2G1_workshopManagerDashboardView.fxml", "Back");

    }


    @Deprecated
    public void reassignTechnicianOnAction(ActionEvent actionEvent) {
    }

    @Deprecated
    public void updateJobStatusOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/NowrinView/WorkShopManager/U2G5_updateJobStatusView.fxml", "Update Job Status");
    }

    @Deprecated
    public void viewWorkshopSummaryOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/NowrinView/WorkShopManager/U2G8_viewWorkshopSummaryView.fxml", "View Workshop Summary");
    }


    @Deprecated
    public void viewWorkshopSummartOnAction(ActionEvent actionEvent) {
    }

    @Deprecated
    public void approveCompletedJobOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/NowrinView/WorkShopManagerView/U2G2_approveCompletedJobView.fxml", "Approve Completed Job");
    }

    @Deprecated
    public void viewTechnicianListOnAction(ActionEvent actionEvent) {
    }

    @Deprecated
    public void assignJobTechnicianOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewTechnicianListOnActionButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/NowrinView/WorkShopManagerView/U2G6_viewTechnicianListView.fxml", "View Technician List");
    }


    @javafx.fxml.FXML
    public void updateJobStatusOnActionButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/NowrinView/WorkShopManagerView/U2G5_updateJobStatusView.fxml", "Update Job Status");
    }


    @Deprecated
    public void viewWorkshopSummartOnActionButton(ActionEvent actionEvent) {
        //SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/NowrinView/WorkShopManagerView/viewWorkshopSummaryView.fxml", "View Workshop Summary");
    }


    @javafx.fxml.FXML
    public void reassignTechnicianOnActionButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/NowrinView/WorkShopManagerView/U2G4_reassignTechnicianView.fxml", "Reassign Technician ");
    }


    @javafx.fxml.FXML
    public void approveCompletedJobOnActionButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/NowrinView/WorkShopManagerView/U2G2_approveCompletedJobView.fxml", "Approve Completed Job");
    }


    @javafx.fxml.FXML
    public void viewWorkshopSummaryOnActionButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/NowrinView/WorkShopManagerView/U2G8_viewWorkshopSummaryView.fxml", "View Workshop Summary");
    }


    @javafx.fxml.FXML
    public void assignJobTechnicianOnActionButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/NowrinView/WorkShopManagerView/U2G3_assignJobToTechnicianView.fxml", "Assign Job Technician");
    }

    @Deprecated
    public void nextPageButtonOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/NowrinView/WorkShopManagerView/NextPageView/nextpageView.fxml"," Next Page");
    }

    @javafx.fxml.FXML
    public void viewWorkshopHistoryButtonOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/NowrinView/WorkShopManagerView/U2G7_viewWorkshopHistoryView.fxml", "View Workshop History");
    }
}
