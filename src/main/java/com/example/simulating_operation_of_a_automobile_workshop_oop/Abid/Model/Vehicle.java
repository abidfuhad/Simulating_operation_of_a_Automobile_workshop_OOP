package com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Model;

import java.io.Serializable;

public class Vehicle implements Serializable {

    private final String vehicleID;
    private String registrationNo, brand, model;
    private int year;
    private final String customerID;

    public Vehicle(String vehicleID, String customerID, int year, String model, String brand, String registrationNo) {
        this.vehicleID = vehicleID;
        this.customerID = customerID;
        this.year = year;
        this.model = model;
        this.brand = brand;
        this.registrationNo = registrationNo;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleID='" + vehicleID + '\'' +
                ", registrationNo='" + registrationNo + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", customerID='" + customerID + '\'' +
                '}';
    }
}
