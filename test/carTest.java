package com.vehicleRental;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car("V123", "Toyota", 50.0);  // Create a Car object for testing
    }

    @Test
    void testCalculateRentalCost() {
        double cost = car.calculateRentalCost(3);  // Test rental cost for 3 days
        assertEquals(180.0, cost, "Rental cost for car should be 50.0 * 3 days * 1.2");
    }
}
