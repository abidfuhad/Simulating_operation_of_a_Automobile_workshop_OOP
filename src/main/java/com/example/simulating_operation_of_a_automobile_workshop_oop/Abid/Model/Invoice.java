package com.example.simulating_operation_of_a_automobile_workshop_oop.Abid.Model;

import java.time.LocalDate;

public class Invoice {

    private int invoiceID, jobCardID;
    private double labourCharge, partsCost, totalAmount;
    private String paymentStatus, paymentMethod;
    private LocalDate paymentDate;

    public Invoice(int invoiceID, int jobCardID, double labourCharge, double partsCost, double totalAmount, String paymentStatus, String paymentMethod, LocalDate paymentDate) {
        this.invoiceID = invoiceID;
        this.jobCardID = jobCardID;
        this.labourCharge = labourCharge;
        this.partsCost = partsCost;
        this.totalAmount = totalAmount;
        this.paymentStatus = paymentStatus;
        this.paymentMethod = paymentMethod;
        this.paymentDate = paymentDate;
    }

    public int getInvoiceID() {
        return invoiceID;
    }

    public int getJobCardID() {
        return jobCardID;
    }

    public double getTotalAmount() {
        return totalAmount;
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

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public void generateInvoice(double labourCharge, double partsCost){
        this.labourCharge = labourCharge;
        this.partsCost = partsCost;
        calculateTotal();
        this.paymentStatus = "Unpaid";
    }

    public double calculateTotal(){
        this.totalAmount = labourCharge + partsCost;
        return totalAmount;
    }

//    public String viewInvoice(){
//
//    }

    public void processPayment(String paymentMethod){
        this.paymentMethod = paymentMethod;
        this.paymentDate = LocalDate.now();
        this.paymentStatus = "Paid";
    }

}
