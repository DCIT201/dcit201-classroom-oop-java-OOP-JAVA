package com.rental.vehicles;

import com.rental.Rentable;
import com.rental.customers.Customer;

public class Truck extends Vehicle implements Rentable {

    public Truck(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days * 1.5;  // Higher rate for trucks
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public void rent(Customer customer, int days) {
        if (isAvailable()) {
            System.out.println("Renting truck to " + customer.getName() + " for " + days + " days.");
            setAvailable(false);
        } else {
            System.out.println("Truck is not available.");
        }
    }

    @Override
    public void returnVehicle() {
        System.out.println("Truck has been returned.");
        setAvailable(true);
    }
}
