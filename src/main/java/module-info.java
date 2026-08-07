module com.example.simulating_operation_of_a_automobile_workshop_oop {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;



    opens com.example.simulating_operation_of_a_automobile_workshop_oop to javafx.fxml;
    exports com.example.simulating_operation_of_a_automobile_workshop_oop;

    opens com.example.simulating_operation_of_a_automobile_workshop_oop.Login.Controller to javafx.fxml;

    exports com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.ServiceAdvisor.Controller;
    opens com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.ServiceAdvisor.Controller to javafx.fxml;

    exports com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Technician.Controller;
    opens com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Technician.Controller to javafx.fxml;


    exports com.example.simulating_operation_of_a_automobile_workshop_oop.Nowrin.HRManager.Controller;
    opens com.example.simulating_operation_of_a_automobile_workshop_oop.Nowrin.HRManager.Controller to javafx.fxml;

    exports com.example.simulating_operation_of_a_automobile_workshop_oop.Nowrin.WorkShopManager.Controller;
    opens com.example.simulating_operation_of_a_automobile_workshop_oop.Nowrin.WorkShopManager.Controller to javafx.fxml;



    exports com.example.simulating_operation_of_a_automobile_workshop_oop.Ahad.Customer.Controller;
    opens com.example.simulating_operation_of_a_automobile_workshop_oop.Ahad.Customer.Controller to javafx.fxml;

    exports com.example.simulating_operation_of_a_automobile_workshop_oop.Ahad.Customer_Service_Manager.Controller;
    opens com.example.simulating_operation_of_a_automobile_workshop_oop.Ahad.Customer_Service_Manager.Controller to javafx.fxml;

    opens com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Model to javafx.base;

    opens com.example.simulating_operation_of_a_automobile_workshop_oop.Shared to javafx.base;

    exports com.example.simulating_operation_of_a_automobile_workshop_oop.Maharab.Inventory_Manager.Controller;
    opens com.example.simulating_operation_of_a_automobile_workshop_oop.Maharab.Inventory_Manager.Controller to javafx.fxml;

    exports com.example.simulating_operation_of_a_automobile_workshop_oop.Maharab.Body_Paint_Supervisor.Controller;
    opens com.example.simulating_operation_of_a_automobile_workshop_oop.Maharab.Body_Paint_Supervisor.Controller to javafx.fxml;
}
