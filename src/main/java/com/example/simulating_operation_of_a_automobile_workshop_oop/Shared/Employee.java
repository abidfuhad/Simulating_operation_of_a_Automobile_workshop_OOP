package com.example.simulating_operation_of_a_automobile_workshop_oop.Shared;

public abstract class Employee extends User {

    private double salary;
    private String designation;

    public Employee(String userID, String name, String phone, String email, String password, double salary, String designation) {
        super(userID, name, phone, email, password);
        this.salary = salary;
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", designation='" + designation + '\'' +
                '}';
    }
}
