package com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Model;

import java.io.Serializable;
import java.time.LocalDate;

public class Invoice implements Serializable {

    private final String invoiceID, jobCardID;
    private double labourCharge, partsCost, totalCost;
    private String paymentStatus;
    private LocalDate invoiceDate;

    public Invoice(String invoiceID, String jobCardID, double labourCharge, double partsCost, double totalCost, String paymentStatus, LocalDate invoiceDate) {
        this.invoiceID = invoiceID;
        this.jobCardID = jobCardID;
        this.labourCharge = labourCharge;
        this.partsCost = partsCost;
        this.totalCost = totalCost;
        this.paymentStatus = paymentStatus;
        this.invoiceDate = invoiceDate;
    }

    public String getInvoiceID() {
        return invoiceID;
    }

    public String getJobCardID() {
        return jobCardID;
    }

    public double getLabourCharge() {
        return labourCharge;
    }

    public void setLabourCharge(double labourCharge) {
        this.labourCharge = labourCharge;
    }

    public double getPartsCost() {
        return partsCost;
    }

    public void setPartsCost(double partsCost) {
        this.partsCost = partsCost;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public LocalDate getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(LocalDate invoiceDate) {
        this.invoiceDate = invoiceDate;
    }



    public void calculateTotalCost(){
        this.totalCost = this.labourCharge + this.partsCost;
    }
}
