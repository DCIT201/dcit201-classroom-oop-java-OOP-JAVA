package com.vehicleRental;

public class RentalTransaction {
    private Vehicle vehicle;
    private int rentalDays;

    public RentalTransaction(Vehicle vehicle, int rentalDays) {
        this.vehicle = vehicle;
        this.rentalDays = rentalDays;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getRentalDays() {
        return rentalDays;
    }
}
