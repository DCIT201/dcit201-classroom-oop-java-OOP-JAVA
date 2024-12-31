package com.example.vehiclerental.model;

import com.example.vehiclerental.service.Rentable;

public class Motorcycle extends Vehicle implements Rentable {
    private boolean requiresHelmet;

    public Motorcycle(String vehicleId, String model, double baseRentalRate, boolean requiresHelmet) {
        super(vehicleId, model, baseRentalRate);
        this.requiresHelmet = requiresHelmet;
    }

    public boolean isRequiresHelmet() {
        return requiresHelmet;
    }

    public void setRequiresHelmet(boolean requiresHelmet) {
        this.requiresHelmet = requiresHelmet;
    }

    @Override
    public double calculateRentalCost(int days) {
        double cost = getBaseRentalRate() * days;
        if (requiresHelmet) {
            cost += 2.0 * days; // example $2 per day
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
            throw new IllegalStateException("Motorcycle is not available for rental.");
        }
        setAvailable(false);
        if (customer != null) {
            customer.addRentalHistory("Motorcycle " + getVehicleId() + " rented for " + days + " days.");
        }
        System.out.println("Motorcycle rented (ID=" + getVehicleId() + ") for " + days + " day(s).");
    }

    @Override
    public void returnVehicle() {
        setAvailable(true);
        System.out.println("Motorcycle " + getVehicleId() + " returned.");
    }
}
