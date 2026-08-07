package com.example.simulating_operation_of_a_automobile_workshop_oop.Nowrin.WorkShopManager.Model;

import java.io.Serializable;

public class WorkshopManager implements Serializable {
    private int workshopID;
    private String workshopName;
    private String location;
    private int totalBays;
    private int availableBays;
    private String managerName;

    public WorkshopManager(int workshopID, String workshopName, String location, int totalBays, int availableBays, String managerName) {
        this.workshopID = workshopID;
        this.workshopName = workshopName;
        this.location = location;
        this.totalBays = totalBays;
        this.availableBays = availableBays;
        this.managerName = managerName;
    }

    public int getWorkshopID() {
        return workshopID;
    }

    public void setWorkshopID(int workshopID) {
        this.workshopID = workshopID;
    }

    public String getWorkshopName() {
        return workshopName;
    }

    public void setWorkshopName(String workshopName) {
        this.workshopName = workshopName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTotalBays() {
        return totalBays;
    }

    public void setTotalBays(int totalBays) {
        this.totalBays = totalBays;
    }

    public int getAvailableBays() {
        return availableBays;
    }

    public void setAvailableBays(int availableBays) {
        this.availableBays = availableBays;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    @Override
    public String toString() {
        return "WorkshopManager{" +
                "workshopID=" + workshopID +
                ", workshopName='" + workshopName + '\'' +
                ", location='" + location + '\'' +
                ", totalBays=" + totalBays +
                ", availableBays=" + availableBays +
                ", managerName='" + managerName + '\'' +
                '}';
    }
}
