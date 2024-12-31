package com.precious;

public class Assignment {
    # Vehicle Abstract Class

    public abstract class Vehicle {
        private String vehicleId;
        private String model;
        private double baseRentalRate;
        private boolean isAvailable;

        public Vehicle(String vehicleId, String model, double baseRentalRate) {
            this.vehicleId = vehicleId;
            this.model = model;
            this.baseRentalRate = baseRentalRate;
            this.isAvailable = true;
        }

        public String getVehicleId() {
            return vehicleId;
        }

        public String getModel() {
            return model;
        }

        public double getBaseRentalRate() {
            return baseRentalRate;
        }

        public boolean isAvailable() {
            return isAvailable;
        }

        public void setAvailability(boolean availability) {
            isAvailable = availability;
        }

        public abstract double calculateRentalCost(int days);
        public abstract boolean isAvailableForRental();
    }


# Vehicle Specific Classes

    public class Car extends Vehicle {
        private int numberOfDoors;

        public Car(String vehicleId, String model, double baseRentalRate, int numberOfDoors) {
            super(vehicleId, model, baseRentalRate);
            this.numberOfDoors = numberOfDoors;
        }

        @Override
        public double calculateRentalCost(int days) {
            return getBaseRentalRate() * days + (numberOfDoors > 4 ? 10 : 0);
        }

        @Override
        public boolean isAvailableForRental() {
            return isAvailable() && numberOfDoors > 2;
        }
    }

    public class Motorcycle extends Vehicle {
        private int engineCapacity;

        public Motorcycle(String vehicleId, String model, double baseRentalRate, int engineCapacity) {
            super(vehicleId, model, baseRentalRate);
            this.engineCapacity = engineCapacity;
        }

        @Override
        public double calculateRentalCost(int days) {
            return getBaseRentalRate() * days + (engineCapacity > 500 ? 20 : 0);
        }

        @Override
        public boolean isAvailableForRental() {
            return isAvailable() && engineCapacity > 250;
        }
    }

    public class Truck extends Vehicle {
        private int payloadCapacity;

        public Truck(String vehicleId, String model, double baseRentalRate, int payloadCapacity) {
            super(vehicleId, model, baseRentalRate);
            this.payloadCapacity = payloadCapacity;
        }

        @Override
        public double calculateRentalCost(int days) {
            return getBaseRentalRate() * days + (payloadCapacity > 1000 ? 30 : 0);
        }

        @Override
        public boolean isAvailableForRental() {
            return isAvailable() && payloadCapacity > 500;
        }
    }


# Rentable Interface

    public interface Rentable {
        void rent(Customer customer, int days);
        void returnVehicle();
    }


# Vehicle Implementation of Rentable

    public class Vehicle implements Rentable {
        // ...

        @Override
        public void rent(Customer customer, int days) {
            if (isAvailableForRental()) {
                setAvailability(false);
                double rentalCost = calculateRentalCost(days);
                System.out.println("Rented to " + customer.getName() + " for " + days + " days. Rental cost: " + rentalCost);
            } else {
                System.out.println("Vehicle is not available for rental.");
            }
        }

        @Override
        public void returnVehicle() {
            setAvailability(true);
            System.out.println("Vehicle returned.");
        }
    }


# Customer Class

    public class Customer {
        private String name;
        private String email;

        public Customer(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }
    }


# RentalAgency Class

    public class RentalAgency {
        private List<Vehicle> vehicles;

        public RentalAgency() {
            vehicles = new ArrayList<>();
        }

        public void addVehicle(Vehicle vehicle) {
            vehicles.add(vehicle);
        }

        public void rentVehicle(Customer customer, Vehicle vehicle, int days) {
            vehicle.rent(customer, days);
        }

        public void returnVehicle(Vehicle vehicle) {
            vehicle.returnVehicle();
        }
    }


# RentalTransaction Class

    public class RentalTransaction {
        private Customer customer;
        private Vehicle vehicle;
        private int rentalDays;
        private double rentalCost;

        public RentalTransaction(Customer customer, Vehicle vehicle, int rentalDays, double rentalCost) {
            this.customer = customer;
            this.vehicle = vehicle;
            this.rentalDays = rentalDays;
            this.rentalCost = rentalCost;
        }

    }
