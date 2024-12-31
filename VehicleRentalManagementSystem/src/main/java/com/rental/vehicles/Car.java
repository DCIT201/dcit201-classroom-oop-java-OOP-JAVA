package com.rental.vehicles;

import com.rental.Rentable;
import com.rental.customers.Customer;

public class Car extends Vehicle implements Rentable {

    public Car(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public void rent(Customer customer, int days) {
        System.out.println("Renting car to customer " + customer.getName() + " for " + days + " days.");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Car has been returned.");
        setAvailable(true);
    }
}
