package com.example.simulating_operation_of_a_automobile_workshop_oop.Nowrin.HRManager.Model;

import java.io.Serializable;
import java.time.LocalDate;

public class Attendance implements Serializable {
    private int employeeID;
    private String employeeName;
    private String department;
    private String designation;
    private String email;
    private String phoneNumber;
    private LocalDate joiningDate;
    private String status;

    public Attendance(int employeeID, String employeeName, String department, String designation, String email, String phoneNumber, LocalDate joiningDate, String status) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.department = department;
        this.designation = designation;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.joiningDate = joiningDate;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "employeeID=" + employeeID +
                ", employeeName='" + employeeName + '\'' +
                ", department='" + department + '\'' +
                ", designation='" + designation + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", joiningDate=" + joiningDate +
                ", status='" + status + '\'' +
                '}';
    }
}
