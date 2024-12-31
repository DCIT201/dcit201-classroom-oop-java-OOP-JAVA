package com.rental;

public class Customer {
    private final String name;
    private final String customerId;

    public Customer(String name, String customerId) {
        if (name == null || customerId == null) {
            throw new IllegalArgumentException("Invalid customer details");
        }
        this.name = name;
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public String getCustomerId() {
        return customerId;
    }
}

