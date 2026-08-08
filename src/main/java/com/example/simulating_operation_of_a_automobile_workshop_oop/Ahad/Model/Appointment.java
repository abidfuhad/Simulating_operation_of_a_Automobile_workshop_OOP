package com.example.simulating_operation_of_a_automobile_workshop_oop.Ahad.Model;

public class Appointment {
    private String customerId,vehicleId,appointmentDate,status,appointmentId;

    public Appointment(String customerId, String vehicleId, String appointmentDate, String appointmentId, String status) {
        this.customerId = customerId;
        this.vehicleId = vehicleId;
        this.appointmentDate = appointmentDate;
        this.appointmentId = appointmentId;
        this.status = status;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public String getStatus() {
        return status;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "customerId='" + customerId + '\'' +
                ", vehicleId='" + vehicleId + '\'' +
                ", appointmentDate='" + appointmentDate + '\'' +
                ", status='" + status + '\'' +
                ", appointmentId='" + appointmentId + '\'' +
                '}';
    }
}
