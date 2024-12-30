package com.vehicleRental;

// Car.java (Concrete class extending Vehicle)

public class Car extends Vehicle {

    // Constructor to initialize Car details
    public Car(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate); // Call the parent class (Vehicle) constructor
    }

    // Override method to calculate rental cost with an additional charge for cars
    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days * 1.2; // Apply a 20% additional charge for cars
    }

    // Override method to check if the car is available for rental
    @Override
    public boolean isAvailableForRental() {
        return isAvailable(); // Use the parent class's availability method
    }
}
