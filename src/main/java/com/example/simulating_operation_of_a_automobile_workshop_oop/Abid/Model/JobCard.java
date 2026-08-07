package com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Model;

import java.io.Serializable;
import java.time.LocalTime;

public class JobCard implements Serializable {

    private final String jobCardID, customerID, registrationNo;
    private String complaint, serviceType, status, notes, technicianID;
    private double labourHours, labourCharge;

    public JobCard(String jobCardID, String customerID, String registrationNo, String complaint, String serviceType, String status, String notes, String technicianID, double labourHours, double labourCharge) {
        this.jobCardID = jobCardID;
        this.customerID = customerID;
        this.registrationNo = registrationNo;
        this.complaint = complaint;
        this.serviceType = serviceType;
        this.status = status;
        this.notes = notes;
        this.technicianID = technicianID;
        this.labourHours = labourHours;
        this.labourCharge = labourCharge;
    }

    public String getJobCardID() {
        return jobCardID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getRegistrationNo() {
        return registrationNo;
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

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getTechnicianID() {
        return technicianID;
    }

    public void setTechnicianID(String technicianID) {
        this.technicianID = technicianID;
    }

    public double getLabourHours() {
        return labourHours;
    }

    public void setLabourHours(double labourHours) {
        this.labourHours = labourHours;
    }

    public double getLabourCharge() {
        return labourCharge;
    }

    public void setLabourCharge(double labourCharge) {
        this.labourCharge = labourCharge;
    }

    @Override
    public String toString() {
        return "JobCard{" +
                "jobCardID='" + jobCardID + '\'' +
                ", customerID='" + customerID + '\'' +
                ", registrationNo='" + registrationNo + '\'' +
                ", complaint='" + complaint + '\'' +
                ", serviceType='" + serviceType + '\'' +
                ", status='" + status + '\'' +
                ", notes='" + notes + '\'' +
                ", technicianID='" + technicianID + '\'' +
                ", labourHours=" + labourHours +
                ", labourCharge=" + labourCharge +
                '}';
    }
}
