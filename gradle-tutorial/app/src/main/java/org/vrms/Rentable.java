package org.vrms;

// Interface: Rentable
public interface Rentable {
    void rent(Customer customer, int days);
    void returnVehicle();
}