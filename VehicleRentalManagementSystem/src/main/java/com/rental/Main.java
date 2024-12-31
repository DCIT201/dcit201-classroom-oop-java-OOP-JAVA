package com.rental;

import com.rental.agency.RentalAgency;
import com.rental.customers.Customer;
import com.rental.vehicles.Car;
import com.rental.vehicles.Motorcycle;
import com.rental.vehicles.Truck;

public class Main {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();

        // Create vehicles
        Car car = new Car("C001", "Toyota Corolla", 50);
        Motorcycle motorcycle = new Motorcycle("M001", "Yamaha R3", 30);
        Truck truck = new Truck("T001", "Ford F-150", 100);

        // Add vehicles to fleet
        agency.addVehicle(car);
        agency.addVehicle(motorcycle);
        agency.addVehicle(truck);

        // Create customers
        Customer customer1 = new Customer("U001", "John Doe");
        Customer customer2 = new Customer("U002", "Jane Smith");

        // Rent vehicles
        agency.rentVehicle(customer1, "C001", 5);
        agency.rentVehicle(customer2, "M001", 3);

        // List available vehicles
        agency.listAvailableVehicles();

        // Return vehicles
        agency.returnVehicle("C001");
        agency.listAvailableVehicles();
    }
}
