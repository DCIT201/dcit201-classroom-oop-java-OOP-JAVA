package com.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RentalAgency {
    List<Vehicle> vehicles;
    List<Customer> customers;
    List<RentalTransaction> transactions;

    public RentalAgency() {
        this.vehicles = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void processRental(int transactionId, Vehicle vehicle, Customer customer, Date rentalDate, Date returnDate) {
        double rentalCost = vehicle.calculateRentalCost((int) ((returnDate.getTime() - rentalDate.getTime()) / (1000 * 60 * 60 * 24)));
        RentalTransaction transaction = new RentalTransaction(transactionId, vehicle, customer, rentalDate, returnDate, rentalCost);
        vehicle.setAvailable(false);
        customer.addRentalTransaction(transaction);
        transactions.add(transaction);
    }

    public void returnVehicle(Vehicle vehicle) {
        vehicle.setAvailable(true);
        // Update the transaction record
    }

    public List<Vehicle> getAvailableVehicles() {
        List<Vehicle> availableVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.isAvailable()) {
                availableVehicles.add(vehicle);
            }
        }
        return availableVehicles;
    }

    public List<RentalTransaction> generateRentalReport() {
        return transactions;
    }

    // Additional methods for managing the agency
}
