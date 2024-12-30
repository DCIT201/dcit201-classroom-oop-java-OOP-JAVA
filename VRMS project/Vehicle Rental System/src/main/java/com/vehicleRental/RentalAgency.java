package com.vehicleRental;

import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> vehicleFleet;

    public RentalAgency() {
        vehicleFleet = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleFleet.add(vehicle);
    }

    public void displayAvailableVehicles() {
        for (Vehicle vehicle : vehicleFleet) {
            if (vehicle.isAvailable()) {
                System.out.println(vehicle);
            }
        }
    }
    public Vehicle getVehicleById(String vehicleId) {
        for (Vehicle vehicle : vehicleFleet) {
            if (vehicle.getVehicleId().equals(vehicleId)) {
                return vehicle;
            }
        }
        return null;
    }

    public void processRental(String vehicleId, Customer customer, int days) {
        Vehicle vehicle = getVehicleById(vehicleId);
        if (vehicle != null && vehicle.isAvailableForRental()) {
            double cost = vehicle.calculateRentalCost(days);
            System.out.println("Rental processed for " + customer.getName() +
                    ". Total cost: " + cost);
            vehicle.setAvailable(false);
        } else {
            System.out.println("Vehicle is not available for rental.");
        }
    }
    public void returnVehicle(String vehicleId) {
        Vehicle vehicle = getVehicleById(vehicleId);
        if (vehicle != null) {
            vehicle.setAvailable(true);
            System.out.println("Vehicle returned successfully.");
        } else {
            System.out.println("Invalid vehicle ID.");
        }
    }
}
