package com.rental;

public class Car extends Vehicle implements Rentable  {
    private final boolean hasAirConditioning;

    public Car(String vehicleId, String model, double baseRentalRate, boolean hasAirConditioning) {
        super(vehicleId, model, baseRentalRate);
        this.hasAirConditioning = hasAirConditioning;
    }

    @Override
    public double calculateRentalCost(int days) {
        double cost = days * getBaseRentalRate();
        if (hasAirConditioning) {
            cost += 50;
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
            throw new IllegalStateException("Car is not available for rental");
        }
        setAvailable(false);
        System.out.println(customer.getName() + " rented a car for " + days + " days.");
    }

    @Override
    public void returnVehicle() {
        setAvailable(true);
        System.out.println("Car returned and is now available.");
    }
}


