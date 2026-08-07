package com.example.simulating_operation_of_a_automobile_workshop_oop.Shared;

import java.io.Serializable;

public abstract class User implements Serializable {

    private final String userID;
    private String name, phone, email, password;


    public User(String userID, String name, String phone, String email, String password) {
        this.userID = userID;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }

    public String getUserID() {
        return userID;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID='" + userID + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
