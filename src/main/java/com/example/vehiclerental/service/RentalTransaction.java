package com.example.vehiclerental.service;

import com.example.vehiclerental.model.Customer;
import com.example.vehiclerental.model.Vehicle;

public class RentalTransaction {
    private final Customer customer;   // Composition
    private final Vehicle vehicle;     // Composition
    private final int days;
    private final double totalCost;

    public RentalTransaction(Customer customer, Vehicle vehicle, int days, double totalCost) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.days = days;
        this.totalCost = totalCost;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getDays() {
        return days;
    }

    public double getTotalCost() {
        return totalCost;
    }

    @Override
    public String toString() {
        return String.format("RentalTransaction [Customer=%s, Vehicle=%s, Days=%d, Cost=%.2f]",
                customer.getName(), vehicle.getVehicleId(), days, totalCost);
    }
}
