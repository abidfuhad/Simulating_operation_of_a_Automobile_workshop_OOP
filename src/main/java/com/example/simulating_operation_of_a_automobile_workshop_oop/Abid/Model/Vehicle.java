package com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Model;

public class Vehicle {

    private int vehicleID, customerID, year;
    private String registrationNo, model;

    public Vehicle(int vehicleID, int customerID, int year, String registrationNo, String model) {
        this.vehicleID = vehicleID;
        this.customerID = customerID;
        this.year = year;
        this.registrationNo = registrationNo;
        this.model = model;
    }

    public int getVehicleID() {
        return vehicleID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleID=" + vehicleID +
                ", customerID=" + customerID +
                ", year=" + year +
                ", registrationNo='" + registrationNo + '\'' +
                ", model='" + model + '\'' +
                '}';
    }


    public void registerVehicle(int customerID, String registrationNo, String model, int year){
        this.customerID = customerID;
        this.registrationNo = registrationNo;
        this.model = model;
        this.year = year;
    }

    public void updateVehicle(String registrationNo, String model, int year){
        this.registrationNo = registrationNo;
        this.model = model;
        this.year = year;
    }


}
