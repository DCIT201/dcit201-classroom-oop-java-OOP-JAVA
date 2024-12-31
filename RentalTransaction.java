package com.rental;

public class RentalTransaction {
    private final Vehicle vehicle;
    private final Customer customer;
    private final int rentalDays;

    public RentalTransaction(Vehicle vehicle, Customer customer, int rentalDays) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.rentalDays = rentalDays;
    }

    @Override
    public String toString() {
        return "RentalTransaction{" +
                "vehicle=" + vehicle.getModel() +
                ", customer=" + customer.getName() +
                ", rentalDays=" + rentalDays +
                '}';
    }
}


