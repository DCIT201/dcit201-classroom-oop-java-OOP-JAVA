package com.example.vehiclerental.model;

public abstract class Vehicle {
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;

    public Vehicle(String vehicleId, String model, double baseRentalRate) {
        setVehicleId(vehicleId);
        setModel(model);
        setBaseRentalRate(baseRentalRate);
        this.isAvailable = true; // default
    }

    // ------------------- Getters & Setters -------------------
    public String getVehicleId() {
        return vehicleId;
    }

    public final void setVehicleId(String vehicleId) {
        if (vehicleId == null || vehicleId.trim().isEmpty()) {
            throw new IllegalArgumentException("Vehicle ID cannot be null or empty.");
        }
        this.vehicleId = vehicleId;
    }

    public String getModel() {
        return model;
    }

    public final void setModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("Model cannot be null or empty.");
        }
        this.model = model;
    }

    public double getBaseRentalRate() {
        return baseRentalRate;
    }

    public final void setBaseRentalRate(double baseRentalRate) {
        if (baseRentalRate < 0) {
            throw new IllegalArgumentException("Base rental rate cannot be negative.");
        }
        this.baseRentalRate = baseRentalRate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    protected void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    // ------------------- Abstract Methods -------------------
    public abstract double calculateRentalCost(int days);

    public abstract boolean isAvailableForRental();

    // ------------------- Object Overrides -------------------
    @Override
    public String toString() {
        return String.format("Vehicle [ID=%s, Model=%s, BaseRate=%.2f, Available=%b]",
                vehicleId, model, baseRentalRate, isAvailable);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Vehicle other = (Vehicle) obj;
        return vehicleId.equals(other.vehicleId);
    }

    @Override
    public int hashCode() {
        return vehicleId.hashCode();
    }
}
