package com.rental.transactions;

import com.rental.vehicles.Vehicle;
import com.rental.customers.Customer;

import java.time.LocalDate;

public class RentalTransaction {
    private Customer customer;
    private Vehicle vehicle;
    private int rentalDays;
    private LocalDate rentalDate;
    private boolean isReturned;

    public RentalTransaction(Customer customer, Vehicle vehicle, int rentalDays) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalDays = rentalDays;
        this.rentalDate = LocalDate.now();
        this.isReturned = false;
    }

    public void completeTransaction() {
        vehicle.returnVehicle();
        isReturned = true;
    }

    public boolean isReturned() {
        return isReturned;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Customer getCustomer() {
        return customer;
    }
}
