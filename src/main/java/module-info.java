module com.example.simulating_operation_of_a_automobile_workshop_oop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.simulating_operation_of_a_automobile_workshop_oop to javafx.fxml;
    exports com.example.simulating_operation_of_a_automobile_workshop_oop;
}