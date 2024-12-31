package com.rental;

public class Main {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();

        Vehicle car = new Car("C001", "Toyota Camry", 100, true);
        Vehicle bike = new Motorcycle("M001", "Yamaha R15", 50, true);
        Vehicle truck = new Truck("T001", "Volvo FH16", 200, 1000);

        agency.addVehicle(car);
        agency.addVehicle(bike);
        agency.addVehicle(truck);

        Customer customer = new Customer("John Doe", "CUST001");

        agency.rentVehicle("C001", customer, 3);
        agency.returnVehicle("C001");

        agency.rentVehicle("M001", customer, 2);
        agency.returnVehicle("M001");

        agency.rentVehicle("T001", customer, 5);
        agency.returnVehicle("T001");
    }
}


