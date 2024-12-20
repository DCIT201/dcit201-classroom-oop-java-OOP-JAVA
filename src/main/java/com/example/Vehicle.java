package com.example;

public abstract class Vehicle {
    private int vehicleId;
    private String model;
    private boolean isAvailable;
    private int baseRentalRate;

    public Vehicle(int vehicleId, String model, boolean isAvailable, int baseRentalRate) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.isAvailable = isAvailable;
//        while initializing, alert the user if he tries to use a negative base rent
        if (baseRentalRate < 0) {
            throw new IllegalArgumentException("Base rental rate must be positive");
        }
        else{
            this.baseRentalRate = baseRentalRate;
        }
    }

    // Getters and setters
    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public int getBaseRentalRate() {
        return baseRentalRate;
    }

    public void setBaseRentalRate(int baseRentalRate) {
//        if the user tries to set the baseRental for any vehicle, make sure its a positive value
        if (baseRentalRate < 0) {
            throw new IllegalArgumentException("Base rental rate must be positive");
        }
        else{
            this.baseRentalRate = baseRentalRate;
        }
    }

    // Abstract methods
    public abstract int calculateRentalCost(int days);
    public abstract boolean isAvailableForRental();
}
