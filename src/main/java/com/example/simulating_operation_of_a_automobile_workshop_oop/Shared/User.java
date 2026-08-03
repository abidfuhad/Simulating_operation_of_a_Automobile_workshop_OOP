package com.example.simulating_operation_of_a_automobile_workshop_oop.Shared;

import java.io.Serializable;

public abstract class User implements Serializable {

    private final int userID;
    private String password;
    private final String role;

    public User(int userID, String role, String password) {
        this.userID = userID;
        this.role = role;
        this.password = password;
    }

    public int getUserID() {
        return userID;
    }

    public String getRole() {
        return role;
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
                "userID=" + userID +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
