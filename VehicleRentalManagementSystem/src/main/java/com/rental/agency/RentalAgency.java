package com.rental.agency;

import com.rental.vehicles.Vehicle;
import com.rental.customers.Customer;
import com.rental.transactions.RentalTransaction;

import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> fleet;
    private List<RentalTransaction> rentalHistory;

    public RentalAgency() {
        fleet = new ArrayList<>();
        rentalHistory = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public void rentVehicle(Customer customer, String vehicleId, int days) {
        for (Vehicle vehicle : fleet) {
            if (vehicle.getVehicleId().equals(vehicleId) && vehicle.isAvailableForRental()) {
                vehicle.rent(customer, days);
                rentalHistory.add(new RentalTransaction(customer, vehicle, days));
                System.out.println(vehicle.getModel() + " rented to " + customer.getName());
                return;
            }
        }
        System.out.println("Vehicle not available.");
    }

    public void returnVehicle(String vehicleId) {
        for (RentalTransaction transaction : rentalHistory) {
            if (transaction.getVehicle().getVehicleId().equals(vehicleId) && !transaction.isReturned()) {
                transaction.completeTransaction();
                System.out.println(transaction.getVehicle().getModel() + " has been returned.");
                return;
            }
        }
        System.out.println("Vehicle return failed.");
    }

    public void listAvailableVehicles() {
        System.out.println("Available Vehicles:");
        for (Vehicle vehicle : fleet) {
            if (vehicle.isAvailableForRental()) {
                System.out.println(vehicle.getModel());
            }
        }
    }
}
