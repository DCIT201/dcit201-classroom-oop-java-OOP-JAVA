package com.vehicleRental;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();

        // Prepopulate fleet with vehicles
        agency.addVehicle(new Car("Car 1", "Toyota Supra", 500.0));
        agency.addVehicle(new Motorcycle("Motorcycle 1", "Honda Fury", 100.0));
        agency.addVehicle(new Truck("Truck 1", "Volvo VNL", 300.0));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to Kelvin's Vehicle Rental System!\n\nWhat do you want to do today?\n");
            System.out.println("1. Show Available Vehicles");
            System.out.println("2. Rent a Vehicle");
            System.out.println("3. Return a Vehicle");
            System.out.println("4. Exit");
            System.out.print("Choose an option to proceed: ");
            
            // Validate user input
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                scanner.next(); // Consume invalid input
                continue;
            }

            int choice = scanner.nextInt();
            switch (choice) {
                case 1: // Show available vehicles
                    agency.displayAvailableVehicles();
                    break;

                case 2: // Rent a vehicle
                    scanner.nextLine(); // Clear buffer
                    System.out.print("Enter vehicle ID: ");
                    String vehicleId = scanner.nextLine();

                    // Prompt user to enter full name
                    String customerName;
                    while (true) {
                        System.out.print("Enter customer full name: ");
                        customerName = scanner.nextLine().trim();

                        // Check if the name consists of at least two words
                        if (customerName.split("\\s+").length < 2) {
                            System.out.println("Please enter your full name (first and last name).");
                        } else {
                            break;
                        }
                    }

                    System.out.print("Enter rental days: ");
                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid input for rental days. Please try again.");
                        scanner.next(); // Consume invalid input
                        break;
                    }
                    int days = scanner.nextInt();
                    agency.processRental(vehicleId, new Customer(customerName), days);
                    break;

                case 3: // Return a vehicle
                    scanner.nextLine(); // Clear buffer
                    System.out.print("Enter vehicle ID to return: ");
                    String returnId = scanner.nextLine();
                    agency.returnVehicle(returnId);
                    break;

                case 4: // Exit the system
                    System.out.println("Exiting the system. \nThank you for choosing Kelvin's Vehicle Rental System, Have a Great Day!");
                    scanner.close();
                    return;

                default: // Handle invalid options
                    System.out.println("Invalid option. Please choose a number between 1 and 4.");
            }
        }
    }
}
