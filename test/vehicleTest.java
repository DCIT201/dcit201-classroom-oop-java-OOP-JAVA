package com.vehicleRental;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    private Vehicle car;

    @BeforeEach
    void setUp() {
        car = new Car("V123", "Toyota", 50.0);  // Create a Car object for testing
    }

    @Test
    void testCalculateRentalCost() {
        double cost = car.calculateRentalCost(5);  // Test rental cost for 5 days
        assertEquals(300.0, cost, "Rental cost should be 50.0 * 5 days");
    }

    @Test
    void testIsAvailableForRental() {
        assertTrue(car.isAvailableForRental(), "Vehicle should be available for rental initially");
    }

    @Test
    void testSetAvailable() {
        car.setAvailable(false);
        assertFalse(car.isAvailableForRental(), "Vehicle should not be available after setting to false");
    }
}
