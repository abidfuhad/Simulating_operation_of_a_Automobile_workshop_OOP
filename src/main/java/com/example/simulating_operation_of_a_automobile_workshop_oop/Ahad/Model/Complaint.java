package com.example.simulating_operation_of_a_automobile_workshop_oop.Ahad.Model;

public class Complaint {
    private String customerId,description;

    public Complaint(String customerId, String description) {
        this.customerId = customerId;
        this.description = description;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Complaint{" +
                "customerId='" + customerId + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
