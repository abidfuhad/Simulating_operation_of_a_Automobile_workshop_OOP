module com.example.simulating_operation_of_a_automobile_workshop_oop {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.simulating_operation_of_a_automobile_workshop_oop to javafx.fxml;
    exports com.example.simulating_operation_of_a_automobile_workshop_oop;
    exports com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.ServiceAdvisor.Controller;
    opens com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.ServiceAdvisor.Controller to javafx.fxml;
}