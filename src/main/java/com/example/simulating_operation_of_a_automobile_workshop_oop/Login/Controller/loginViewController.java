package com.example.simulating_operation_of_a_automobile_workshop_oop.Login.Controller;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Model.ServiceAdvisor;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Model.Technician;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Ahad.Model.Customer;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Ahad.Model.Customer_Service_Manager;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Maharab.Model.BodyPaintSupervisor;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Maharab.Model.InventoryManager;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Nowrin.HRManager.Model.HRManager;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Nowrin.WorkShopManager.Model.WorkShopManager;

import com.example.simulating_operation_of_a_automobile_workshop_oop.SessionManager;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Shared.Employee;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.BinaryFileUtil;
import com.example.simulating_operation_of_a_automobile_workshop_oop.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.util.ArrayList;


public class loginViewController {



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
                    new HRManager(
                            "7001",
                            "Yang",
                            "01611111111",
                            "yang.@gmail.com",
                            "7001",
                            25000,
                            "HR Manager"

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
            employeeArrayList.add(
                    new WorkShopManager(
                            "8001",
                            "ziha",
                            "01511111111",
                            "zina.@gmail.com",
                            "8001",
                            25000,
                            "WorkShop Manager"

                    )
            );

            employeeArrayList.add(
                    new Customer_Service_Manager(
                            "6001",
                            "Abdullah",
                            "01811111111",
                            "abdullah@gmail.com",
                            "5001",
                            25000,
                            "Customer Service Manager"

                    )
            );


            BinaryFileUtil.saveList("Data/Employee.bin", employeeArrayList);

        }

    }

    @javafx.fxml.FXML
    public void loginButton(ActionEvent actionEvent) {



        ArrayList<Employee> employeeArrayList = BinaryFileUtil.readList("Data/Employee.bin");

        for(Employee e : employeeArrayList){

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


                else if(e.getDesignation().equals("HR Manager")){
                    SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/NowrinView/HRManagerView/HrManagerDashboardView.fxml","HR Manager");
                }

                else if(e.getDesignation().equals("WorkShop Manager")){
                    SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/NowrinView/WorkShopManagerView/U2G1_workshopManagerDashboardView.fxml","Workshop Manager");
                }

                else if(e.getDesignation().equals("Customer Service Manager")){
                    SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/Ahad_View/Customer_Service_ManagerView/Customer_Service_ManagerDashboardView.fxml","Customer Service Manager Dashboard");
                }


                return;
            }

        }

        ArrayList<Customer> customerArrayList = BinaryFileUtil.readList("Data/Customer.bin");

        for(Customer c : customerArrayList){
            if(c.getUserID().equals(userIdField.getText()) && c.getPassword().equals(passwordField.getText())){
                SessionManager.customer = c;

                SceneSwitcher.switchScene(actionEvent, "/com/example/simulating_operation_of_a_automobile_workshop_oop/Ahad_View/CustomerView/CustomerDashboardView.fxml","Customer Dashboard");
                return;
            }

        }

        messageLabel.setText("Invalid Use ID or Password.");


    }
}

