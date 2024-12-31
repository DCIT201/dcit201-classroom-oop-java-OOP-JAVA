package com.example.vehiclerental;

import com.example.vehiclerental.exceptions.RentalException;
import com.example.vehiclerental.model.*;
import com.example.vehiclerental.service.RentalAgency;

public class Main {
    public static void main(String[] args) {
        RentalAgency rentalAgency = new RentalAgency();

        // Create Vehicles
        Car car = new Car("CAR001", "Toyota Corolla", 50.0, true);
        Motorcycle motorcycle = new Motorcycle("MOTO001", "Yamaha MT-07", 30.0, true);
        Truck truck = new Truck("TRUCK001", "Ford F-150", 70.0, 2.0);

        // Add them to the RentalAgency fleet
        rentalAgency.addVehicle(car);
        rentalAgency.addVehicle(motorcycle);
        rentalAgency.addVehicle(truck);

        // Create Customers
        Customer customer1 = new Customer("CUST001", "Alice");
        Customer customer2 = new Customer("CUST002", "Bob");

        // Rent & Return examples
        try {
            System.out.println("----- Renting a Car to Alice -----");
            rentalAgency.rentVehicle("CAR001", customer1, 3);
            System.out.println("----- Returning the Car -----");
            rentalAgency.returnVehicle("CAR001");

            System.out.println("----- Renting a Motorcycle to Bob -----");
            rentalAgency.rentVehicle("MOTO001", customer2, 2);

            System.out.println("----- Renting a Truck to Alice -----");
            rentalAgency.rentVehicle("TRUCK001", customer1, 5);

        } catch (RentalException e) {
            System.err.println("Rental error: " + e.getMessage());
        }

        // Print out all transactions
        System.out.println("\nAll Transactions:");
        rentalAgency.getAllTransactions().forEach(System.out::println);

        // Print available vehicles
        System.out.println("\nCurrently Available Vehicles:");
        rentalAgency.getAvailableVehicles().forEach(System.out::println);
    }
}
