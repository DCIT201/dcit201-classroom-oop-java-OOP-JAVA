package com.example.vehiclerental.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerId;
    private String name;
    private boolean eligible;
    private final List<String> rentalHistory;

    public Customer(String customerId, String name) {
        setCustomerId(customerId);
        setName(name);
        this.eligible = true;
        this.rentalHistory = new ArrayList<>();
    }

    public String getCustomerId() {
        return customerId;
    }

    public final void setCustomerId(String customerId) {
        if (customerId == null || customerId.trim().isEmpty()) {
            throw new IllegalArgumentException("Customer ID cannot be null or empty.");
        }
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public final void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Customer name cannot be null or empty.");
        }
        this.name = name;
    }

    public boolean isEligible() {
        return eligible;
    }

    public void setEligible(boolean eligible) {
        this.eligible = eligible;
    }

    public void addRentalHistory(String record) {
        rentalHistory.add(record);
    }

    public List<String> getRentalHistory() {
        // Return a copy or unmodifiable list for encapsulation
        return new ArrayList<>(rentalHistory);
    }

    @Override
    public String toString() {
        return String.format("Customer [ID=%s, name=%s, eligible=%b]", customerId, name, eligible);
    }
}
