package com.example.simulating_operation_of_a_automobile_workshop_oop.Login.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Model.ServiceAdvisor;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Model.Technician;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Maharab.Model.BodyPaintSupervisor;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Maharab.Model.InventoryManager;
import com.example.simulating_operation_of_a_automobile_workshop_oop.SessionManager;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Shared.Employee;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.BinaryFileUtil;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class loginViewController
{
    @javafx.fxml.FXML
    private PasswordField passwordField;
    @javafx.fxml.FXML
    private TextField userIdField;
    @javafx.fxml.FXML
    private Label messageLabel;

    @javafx.fxml.FXML
    public void initialize() {

        ArrayList<Employee> employeeArrayList = BinaryFileUtil.readList("Data/Employee.bin");

        if(employeeArrayList.isEmpty()){
            employeeArrayList.add(
                    new ServiceAdvisor(
                            "1001",
                            "Cypher",
                            "01700000000",
                            "cypher.advisor@gmail.com",
                            "1001",
                            35000,
                            "Service Advisor"
                    )
            );

            employeeArrayList.add(
                    new ServiceAdvisor(
                            "1002",
                            "Rayna",
                            "01711111111",
                            "rayna.advisor@gmail.com",
                            "1002",
                            30000,
                            "Service Advisor"
                    )
            );

            employeeArrayList.add(
                    new Technician(
                            "2001",
                            "Gekko",
                            "01300000000",
                            "gekko.technician@gmail.com",
                            "2001",
                            20000,
                            "Technician"
                    )
            );

            employeeArrayList.add(
                    new Technician(
                            "2002",
                            "Harbor",
                            "01311111111",
                            "harbor.technician@gmail.com",
                            "2002",
                            25000,
                            "Technician"
                    )
            );

            employeeArrayList.add(
                    new InventoryManager(
                            "3001",
                            "Messi",
                            "01344444444",
                            "messi.technician@gmail.com",
                            "3001",
                            55000,
                            "Inventory Manager"
                    )
            );

            employeeArrayList.add(
                    new BodyPaintSupervisor(
                            "4002",
                            "Depaul",
                            "01366666666",
                            "depaul.technician@gmail.com",
                            "4002",
                            45000,
                            "Body Paint Supervisor"
                    )
            );

            BinaryFileUtil.saveList("Data/Employee.bin", employeeArrayList);

        }

    }

    @javafx.fxml.FXML
    public void loginButton(ActionEvent actionEvent) {

        ArrayList<Employee> employeeArrayList = BinaryFileUtil.readList("Data/Employee.bin");

        for(Employee e : employeeArrayList){
            System.out.println(
                    e.getUserID() + " "
                            + e.getPassword() + " "
                            + e.getDesignation()
            );
            if(e.getUserID().equals(userIdField.getText()) && e.getPassword().equals(passwordField.getText())){
                SessionManager.employee = e;

                if(e.getDesignation().equals("Service Advisor")){
                    SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/AbidView/ServiceAdvisorView/SerAdvDasboardView.fxml","ServiceAdvisor Dashboard");
                }
                else if(e.getDesignation().equals("Technician")){
                    SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/AbidView/TechnicianView/TechnicianDashboardView.fxml","Technician Dashboard");
                }

                else if(e.getDesignation().equals("Inventory Manager")){
                    SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/MaharabView/InventoryManagerView/InventoryManagerDashboardView.fxml","Inventory Manager Dashboard");
                }

                else if(e.getDesignation().equals("Body Paint Supervisor")){
                    SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/MaharabView/BodyPaintSupervisorView/BodyPaintSupervisorDashboardView.fxml","Body Paint Supervisor Dashboard");
                }

                return;
            }

        }

        messageLabel.setText("Invalid Use ID or Password.");



//        String userID = userIdField.getText();
//        String password = passwordField.getText();
//        if(userID.length() == 4){
//
//
//
//            if(userID.equals("0001") && password.equals("0001")){
//                SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/AbidView/ServiceAdvisorView/SerAdvDasboardView.fxml","ServiceAdvisor Dashboard");
//            }
//            else if(userID.equals("0002") && password.equals("0002")){
//                SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/AbidView/TechnicianView/TechnicianDashboardView.fxml","Technician Dashboard");
//            }
//            else if(userID.equals("5001") && password.equals("5001")){
//                SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/Ahad_View/CustomerView/CustomerDashboardView.fxml","Customer Dashboard");
//            }
//            else if(userID.equals("6001") && password.equals("6001")){
//                SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/Ahad_View/Customer_Service_ManagerView/Customer_Service_ManagerDashboardView.fxml","Customer Service Manager Dashboard");
//            }
//        }
    }
}