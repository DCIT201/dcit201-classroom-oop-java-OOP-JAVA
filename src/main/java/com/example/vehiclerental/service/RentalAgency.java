package com.example.vehiclerental.service;

import com.example.vehiclerental.exceptions.RentalException;
import com.example.vehiclerental.model.Vehicle;
import com.example.vehiclerental.model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RentalAgency {
    private final List<Vehicle> fleet;
    private final List<RentalTransaction> transactions;

    public RentalAgency() {
        this.fleet = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public void removeVehicle(String vehicleId) {
        fleet.removeIf(v -> v.getVehicleId().equals(vehicleId));
    }

    public Vehicle findVehicle(String vehicleId) {
        Optional<Vehicle> found = fleet.stream()
                .filter(v -> v.getVehicleId().equals(vehicleId))
                .findFirst();
        return found.orElse(null);
    }

    public RentalTransaction rentVehicle(String vehicleId, Customer customer, int days) throws RentalException {
        if (!customer.isEligible()) {
            throw new RentalException("Customer " + customer.getName() + " is not eligible to rent.");
        }

        Vehicle vehicle = findVehicle(vehicleId);
        if (vehicle == null) {
            throw new RentalException("Vehicle with ID " + vehicleId + " not found.");
        }
        if (!(vehicle instanceof Rentable)) {
            throw new RentalException("Vehicle with ID " + vehicleId + " is not rentable.");
        }

        Rentable rentableVehicle = (Rentable) vehicle;
        if (!vehicle.isAvailableForRental()) {
            throw new RentalException("Vehicle " + vehicleId + " is not available for rental.");
        }

        // Rent the vehicle
        rentableVehicle.rent(customer, days);

        // Calculate cost
        double totalCost = vehicle.calculateRentalCost(days);

        // Record a new transaction
        RentalTransaction transaction = new RentalTransaction(customer, vehicle, days, totalCost);
        transactions.add(transaction);

        return transaction;
    }

    public void returnVehicle(String vehicleId) throws RentalException {
        Vehicle vehicle = findVehicle(vehicleId);
        if (vehicle == null) {
            throw new RentalException("Vehicle with ID " + vehicleId + " not found.");
        }
        if (!(vehicle instanceof Rentable)) {
            throw new RentalException("Vehicle with ID " + vehicleId + " is not rentable.");
        }

        Rentable rentableVehicle = (Rentable) vehicle;
        rentableVehicle.returnVehicle();
    }

    public List<Vehicle> getAvailableVehicles() {
        List<Vehicle> available = new ArrayList<>();
        for (Vehicle v : fleet) {
            if (v.isAvailableForRental()) {
                available.add(v);
            }
        }
        return available;
    }

    public List<RentalTransaction> getAllTransactions() {
        return new ArrayList<>(transactions);
    }
}
