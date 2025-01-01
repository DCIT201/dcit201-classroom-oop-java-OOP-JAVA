package com.vehicleRental;

public class Motorcycle extends Vehicle {

    public Motorcycle(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days; // Base rate applies
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
}
