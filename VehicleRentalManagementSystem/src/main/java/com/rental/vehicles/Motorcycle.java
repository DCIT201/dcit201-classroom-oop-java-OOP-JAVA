package com.rental.vehicles;

import com.rental.Rentable;
import com.rental.customers.Customer;

public class Motorcycle extends Vehicle implements Rentable {

    public Motorcycle(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days * 0.8;  // Discount for motorcycles
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public void rent(Customer customer, int days) {
        if (isAvailable()) {
            System.out.println("Renting motorcycle to " + customer.getName() + " for " + days + " days.");
            setAvailable(false);
        } else {
            System.out.println("Motorcycle is not available.");
        }
    }

    @Override
    public void returnVehicle() {
        System.out.println("Motorcycle has been returned.");
        setAvailable(true);
    }
}
