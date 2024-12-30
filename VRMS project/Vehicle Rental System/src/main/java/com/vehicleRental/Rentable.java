package com.vehicleRental;

public interface Rentable {
    void rent(Customer customer, int days);
    void returnVehicle();
}
