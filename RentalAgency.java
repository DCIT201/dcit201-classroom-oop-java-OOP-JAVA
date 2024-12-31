package com.rental;
import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private final List<Vehicle> fleet = new ArrayList<>();
    private final List<RentalTransaction> transactions = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public void rentVehicle(String vehicleId, Customer customer, int days) {
        for (Vehicle vehicle : fleet) {
            if (vehicle.getVehicleId().equals(vehicleId) && vehicle.isAvailableForRental()) {
                ((Rentable) vehicle).rent(customer, days);
                transactions.add(new RentalTransaction(vehicle, customer, days));
                return;
            }
        }
        throw new IllegalArgumentException("Vehicle not available for rental");
    }

    public void returnVehicle(String vehicleId) {
        for (Vehicle vehicle : fleet) {
            if (vehicle.getVehicleId().equals(vehicleId)) {
                ((Rentable) vehicle).returnVehicle();
                return;
            }
        }
        throw new IllegalArgumentException("Vehicle not found");
    }
}




