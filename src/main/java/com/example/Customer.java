package com.example;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerId;
    private String name;
    private String contactInfo;
    private List<RentalTransaction> rentalHistory;

    public Customer(int customerId, String name, String contactInfo) {
        this.customerId = customerId;
        this.name = name;
        this.contactInfo = contactInfo;
        this.rentalHistory = new ArrayList<>();
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void setRentalHistory(List<RentalTransaction> rentalHistory) {
        this.rentalHistory = rentalHistory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public List<RentalTransaction> getRentalHistory() {
        return rentalHistory;
    }

    public void addRentalTransaction(RentalTransaction transaction) {
        rentalHistory.add(transaction);
    }


    // Additional methods to manage customer's rental history
}
