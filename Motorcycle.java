package com.rental;

public class Motorcycle extends Vehicle implements Rentable  {
    private boolean requiresHelmet;

    public Motorcycle(String vehicleId, String model, double baseRentalRate, boolean requiresHelmet) {
        super(vehicleId, model, baseRentalRate);
        this.requiresHelmet = requiresHelmet;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getBaseRentalRate() * 0.8; // Discount for motorcycles
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public void rent(Customer customer, int days) {
        if (!isAvailableForRental()) {
            throw new IllegalStateException("Motorcycle is not available for rental");
        }
        setAvailable(false);
        System.out.println(customer.getName() + " rented a motorcycle for " + days + " days.");
    }

    @Override
    public void returnVehicle() {
        setAvailable(true);
        System.out.println("Motorcycle returned and is now available.");
    }
}




