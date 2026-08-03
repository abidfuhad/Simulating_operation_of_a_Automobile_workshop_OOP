package com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Model;

import com.example.simulating_operation_of_a_automobile_workshop_oop.Shared.User;

public class Customer extends User {

    private String address;

    public Customer(String userID, String name, String phone, String email, String password, String address) {
        super(userID, name, phone, email, password);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "address='" + address + '\'' +
                '}';
    }
}
