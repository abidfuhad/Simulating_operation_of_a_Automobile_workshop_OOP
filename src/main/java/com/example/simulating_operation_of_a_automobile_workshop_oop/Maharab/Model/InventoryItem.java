package com.example.simulating_operation_of_a_automobile_workshop_oop.Maharab.Model;

import java.io.Serializable;

public class InventoryItem implements Serializable {
    private String itemId,itemName,category;
    private int quantity;
    private double unitPrice;
    private Supplier supplier;

    public InventoryItem(String itemId, String itemName, String category, int quantity, double unitPrice, Supplier supplier) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.category = category;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.supplier = supplier;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    @Override
    public String toString() {
        return "InventoryItem{" +
                "itemId='" + itemId + '\'' +
                ", itemName='" + itemName + '\'' +
                ", category='" + category + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", supplier=" + supplier +
                '}';
    }
}
