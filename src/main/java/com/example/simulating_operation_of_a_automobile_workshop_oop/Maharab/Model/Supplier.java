package com.example.simulating_operation_of_a_automobile_workshop_oop.Maharab.Model;

import java.io.Serializable;

public class Supplier implements Serializable {
    private String supplierId,supplierName;

    public Supplier(String supplierId, String supplierName) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierId='" + supplierId + '\'' +
                ", supplierName='" + supplierName + '\'' +
                '}';
    }
}
