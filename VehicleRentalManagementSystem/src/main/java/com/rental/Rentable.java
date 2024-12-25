package com.rental;

import com.rental.customers.Customer;

public interface Rentable {

    // Method to rent a vehicle
    void rent(Customer customer, int days);

    // Method to return the vehicle
    void returnVehicle();
}
