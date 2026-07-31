package com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Model;

import java.time.LocalDate;

public class JobCard {

    private int jobCardID, vehicleID, technicianID;
    private String complaint, serviceType, status;
    private LocalDate createdDate;

    public JobCard(int jobCardID, int vehicleID, int technicianID, String complaint, String serviceType, String status, LocalDate createdDate) {
        this.jobCardID = jobCardID;
        this.vehicleID = vehicleID;
        this.technicianID = technicianID;
        this.complaint = complaint;
        this.serviceType = serviceType;
        this.status = status;
        this.createdDate = createdDate;
    }

    public int getJobCardID() {
        return jobCardID;
    }

    public int getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
    }

    public int getTechnicianID() {
        return technicianID;
    }

    public void setTechnicianID(int technicianID) {
        this.technicianID = technicianID;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "JobCard{" +
                "jobCardID=" + jobCardID +
                ", vehicleID=" + vehicleID +
                ", technicianID=" + technicianID +
                ", complaint='" + complaint + '\'' +
                ", serviceType='" + serviceType + '\'' +
                ", status='" + status + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }

    public void createJobCard(int vehicleID, String complaint, String serviceType){
        this.vehicleID = vehicleID;
        this.complaint = complaint;
        this.serviceType = serviceType;
        this.status = "Pending";
        this.createdDate = LocalDate.now();
    }

    public void updateJobCard(String complaint, String serviceType){
        this.complaint = complaint;
        this.serviceType = serviceType;
    }

    public void assignTechnician(int technicianID){
        this.technicianID = technicianID;
        this.status = "Assigned";
    }

    public void updateStatus(String newStatus){
        this.status = newStatus;
    }

    public void viewDetails(){

    }
}
