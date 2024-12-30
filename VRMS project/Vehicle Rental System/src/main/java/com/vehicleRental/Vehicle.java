package com.vehicleRental;

public abstract class Vehicle {
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean available;

    public Vehicle(String vehicleId, String model, double baseRentalRate) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.available = true; // Default to available
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getModel() {
        return model;
    }

    public double getBaseRentalRate() {
        return baseRentalRate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public abstract double calculateRentalCost(int days);

    // Add abstract method for rental availability
    public abstract boolean isAvailableForRental();

    @Override
    public String toString() {
        return "Vehicle ID: " + vehicleId + ", Model: " + model + ", Base Rental Rate: " + baseRentalRate  + " Cedis ";
    }
}
