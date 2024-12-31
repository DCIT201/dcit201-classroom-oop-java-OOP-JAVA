package com.rental;

public class Truck extends Vehicle implements Rentable {
    private final double loadCapacity;

    public Truck(String vehicleId, String model, double baseRentalRate, double loadCapacity) {
        super(vehicleId, model, baseRentalRate);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getBaseRentalRate() + (loadCapacity * 10);
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public void rent(Customer customer, int days) {
        if (!isAvailableForRental()) {
            throw new IllegalStateException("Truck is not available for rental");
        }
        setAvailable(false);
        System.out.println(customer.getName() + " rented a truck for " + days + " days.");
    }

    @Override
    public void returnVehicle() {
        setAvailable(true);
        System.out.println("Truck returned and is now available.");
    }
}

