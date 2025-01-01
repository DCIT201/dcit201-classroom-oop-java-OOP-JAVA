package com.vehicleRental;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RentalAgencyTest {

    private RentalAgency agency;
    private Car car;
    private Motorcycle motorcycle;

    @BeforeEach
    void setUp() {
        agency = new RentalAgency();
        car = new Car("V123", "Toyota", 50.0);
        motorcycle = new Motorcycle("M123", "Harley", 30.0);
        agency.addVehicle(car);
        agency.addVehicle(motorcycle);
    }

    @Test
    void testDisplayAvailableVehicles() {
        agency.displayAvailableVehicles();  // Check if available vehicles are displayed
        assertTrue(car.isAvailableForRental(), "Car should be available initially");
        assertTrue(motorcycle.isAvailableForRental(), "Motorcycle should be available initially");
    }

    @Test
    void testProcessRental() {
        Customer customer = new Customer("John Doe");
        agency.processRental(car.getVehicleId(), customer, 3);
        assertFalse(car.isAvailableForRental(), "Car should be unavailable after rental");
    }

    @Test
    void testReturnVehicle() {
        agency.processRental(car.getVehicleId(), new Customer("John Doe"), 3);
        agency.returnVehicle(car.getVehicleId());
        assertTrue(car.isAvailableForRental(), "Car should be available after return");
    }
}
