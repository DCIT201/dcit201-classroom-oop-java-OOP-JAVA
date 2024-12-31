package org.vrms;

public abstract class Vehicle {
    private String vehicleID;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;

    public Vehicle (String vehicleID, String model, double baseRentalRate ){
        this.vehicleID = vehicleID;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = true;
    }
    public String getVehicleID() {
        return vehicleID;
    }
    public String getModel() {
        return model;
    }
    public double getBaseRentalRate() {
        return baseRentalRate;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    public void rent(Customer customer, int days)
    {
        if (!isAvailableForRental()) {
            throw new IllegalStateException("Vehicle is not available for rental.");
        }
        setAvailable(false);
        System.out.println("Vehicle rented to " + customer.getName());
    }

    public abstract double calculateRentalRate(int days);
    public abstract boolean isAvailableForRental();
}
