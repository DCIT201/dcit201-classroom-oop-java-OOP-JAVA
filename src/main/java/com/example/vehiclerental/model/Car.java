package com.example.vehiclerental.model;

import com.example.vehiclerental.service.Rentable;

public class Car extends Vehicle implements Rentable {
    private boolean childSeatIncluded;

    public Car(String vehicleId, String model, double baseRentalRate, boolean childSeatIncluded) {
        super(vehicleId, model, baseRentalRate);
        this.childSeatIncluded = childSeatIncluded;
    }

    public boolean isChildSeatIncluded() {
        return childSeatIncluded;
    }

    public void setChildSeatIncluded(boolean childSeatIncluded) {
        this.childSeatIncluded = childSeatIncluded;
    }

    @Override
    public double calculateRentalCost(int days) {
        double cost = getBaseRentalRate() * days;
        if (childSeatIncluded) {
            cost += 5.0 * days; // example $5 per day
        }
        return cost;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public void rent(Customer customer, int days) {
        if (!isAvailableForRental()) {
            throw new IllegalStateException("Car is not available for rental.");
        }
        setAvailable(false);
        if (customer != null) {
            customer.addRentalHistory("Car " + getVehicleId() + " rented for " + days + " days.");
        }
        System.out.println("Car rented (ID=" + getVehicleId() + ") for " + days + " day(s).");
    }

    @Override
    public void returnVehicle() {
        setAvailable(true);
        System.out.println("Car " + getVehicleId() + " returned.");
    }
}
