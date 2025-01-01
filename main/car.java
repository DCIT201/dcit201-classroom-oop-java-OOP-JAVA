package com.vehicleRental;

public class Car extends Vehicle {

    public Car(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days * 1.2; // Additional charge for cars
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
}
