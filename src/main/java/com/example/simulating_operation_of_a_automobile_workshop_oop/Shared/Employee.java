package com.example.simulating_operation_of_a_automobile_workshop_oop.Shared;

public abstract class Employee extends User {

    private String name, phone, email, department;

    public Employee(int userID, String role, String password, String name, String phone, String email, String department) {
        super(userID, role, password);
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
