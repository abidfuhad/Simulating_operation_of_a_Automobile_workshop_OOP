package com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Model;

import java.io.Serializable;

public class Invoice implements Serializable {

    private final String invoiceID, jobCardID;
    private double labourCharge, partsCost, totalCost;
    private String paymentStatus;

    public Invoice(String invoiceID, String jobCardID, double labourCharge, double partsCost, double totalCost, String paymentStatus) {
        this.invoiceID = invoiceID;
        this.jobCardID = jobCardID;
        this.labourCharge = labourCharge;
        this.partsCost = partsCost;
        this.totalCost = totalCost;
        this.paymentStatus = paymentStatus;
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

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceID='" + invoiceID + '\'' +
                ", jobCardID='" + jobCardID + '\'' +
                ", labourCharge=" + labourCharge +
                ", partsCost=" + partsCost +
                ", totalCost=" + totalCost +
                ", paymentStatus='" + paymentStatus + '\'' +
                '}';
    }
}
