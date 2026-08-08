package com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Model;


import java.io.Serializable;

public class ServiceRecord implements Serializable {

    private final String serviceRecordID, jobCardID, registrationNo;
    private String serviceType, complaint, notes;
    private double labourHours, labourCharge;

    public ServiceRecord(String serviceRecordID, String jobCardID, String registrationNo, String serviceType, String complaint, String notes, double labourHours, double labourCharge) {
        this.serviceRecordID = serviceRecordID;
        this.jobCardID = jobCardID;
        this.registrationNo = registrationNo;
        this.serviceType = serviceType;
        this.complaint = complaint;
        this.notes = notes;
        this.labourHours = labourHours;
        this.labourCharge = labourCharge;
    }

    public String getServiceRecordID() {
        return serviceRecordID;
    }

    public String getJobCardID() {
        return jobCardID;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
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
        return "ServiceRecord{" +
                "serviceRecordID='" + serviceRecordID + '\'' +
                ", jobCardID='" + jobCardID + '\'' +
                ", registrationNo='" + registrationNo + '\'' +
                ", serviceType='" + serviceType + '\'' +
                ", complaint='" + complaint + '\'' +
                ", notes='" + notes + '\'' +
                ", labourHours=" + labourHours +
                ", labourCharge=" + labourCharge +
                '}';
    }
}
