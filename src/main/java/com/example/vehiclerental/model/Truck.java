package com.example.vehiclerental.model;

import com.example.vehiclerental.service.Rentable;

public class Truck extends Vehicle implements Rentable {
    private double loadCapacity; // in tons

    public Truck(String vehicleId, String model, double baseRentalRate, double loadCapacity) {
        super(vehicleId, model, baseRentalRate);
        setLoadCapacity(loadCapacity);
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        if (loadCapacity < 0) {
            throw new IllegalArgumentException("Load capacity cannot be negative.");
        }
        this.loadCapacity = loadCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        double cost = getBaseRentalRate() * days;
        // example: $10 per ton per day
        cost += (loadCapacity * 10.0) * days;
        return cost;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public void rent(Customer customer, int days) {
        if (!isAvailableForRental()) {
            throw new IllegalStateException("Truck is not available for rental.");
        }
        setAvailable(false);
        if (customer != null) {
            customer.addRentalHistory("Truck " + getVehicleId() + " rented for " + days + " days.");
        }
        System.out.println("Truck rented (ID=" + getVehicleId() + ") for " + days + " day(s).");
    }

    @Override
    public void returnVehicle() {
        setAvailable(true);
        System.out.println("Truck " + getVehicleId() + " returned.");
    }
}
