package com.vehicleRental;

public class RentalTransaction {
    private Vehicle vehicle;
    private Customer customer;
    private int rentalDays;

    public RentalTransaction(Vehicle vehicle, Customer customer, int rentalDays) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.rentalDays = rentalDays;
    }

    public double calculateCost() {
        return vehicle.calculateRentalCost(rentalDays);
    }
}
