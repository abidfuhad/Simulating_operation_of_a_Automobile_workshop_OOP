package com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Model;

import java.time.Duration;
import java.time.LocalTime;

public class ServiceRecord {

    private int serviceRecordID, jobCardId, partID, quantityUsed;
    private String notes;
    private LocalTime startTime, endTime;
    private double totalHours;

    public ServiceRecord(int serviceRecordID, int jobCardId, int partID, int quantityUsed, String notes, LocalTime startTime, LocalTime endTime, double totalHours) {
        this.serviceRecordID = serviceRecordID;
        this.jobCardId = jobCardId;
        this.partID = partID;
        this.quantityUsed = quantityUsed;
        this.notes = notes;
        this.startTime = startTime;
        this.endTime = endTime;
        this.totalHours = totalHours;
    }

    public int getServiceRecordID() {
        return serviceRecordID;
    }

    public int getJobCardId() {
        return jobCardId;
    }

    public void setJobCardId(int jobCardId) {
        this.jobCardId = jobCardId;
    }

    public int getPartID() {
        return partID;
    }

    public void setPartID(int partID) {
        this.partID = partID;
    }

    public int getQuantityUsed() {
        return quantityUsed;
    }

    public void setQuantityUsed(int quantityUsed) {
        this.quantityUsed = quantityUsed;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public double getTotalHours() {
        return totalHours;
    }


    @Override
    public String toString() {
        return "ServiceRecord{" +
                "serviceRecordID=" + serviceRecordID +
                ", jobCardId=" + jobCardId +
                ", partID=" + partID +
                ", quantityUsed=" + quantityUsed +
                ", notes='" + notes + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", totalHours=" + totalHours +
                '}';
    }

    public void addNote(String note){
        this.notes = note;
    }

    public void recordUsedParts(int partID, int quantityUsed){
        this.partID = partID;
        this.quantityUsed = quantityUsed;
    }

    public void recordLabourHours(LocalTime startTime, LocalTime endTime){
        this.startTime = startTime;
        this.endTime = endTime;

        Duration workedDuration = Duration.between(startTime,endTime);
        this.totalHours = workedDuration.toMinutes() / 60.0;
    }
}
