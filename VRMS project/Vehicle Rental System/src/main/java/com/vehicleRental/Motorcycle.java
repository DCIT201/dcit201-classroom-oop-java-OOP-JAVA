package com.vehicleRental;

// Motorcycle.java (Concrete class extending Vehicle)

public class Motorcycle extends Vehicle {

    // Constructor to initialize Motorcycle details
    public Motorcycle(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate); // Call the parent class (Vehicle) constructor
    }

    // Override method to calculate rental cost based on days
    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days; // Calculate rental cost as base rate * days
    }

    // Override method to check if the motorcycle is available for rental
    @Override
    public boolean isAvailableForRental() {
        return isAvailable(); // Use the parent class's availability method
    }
}
