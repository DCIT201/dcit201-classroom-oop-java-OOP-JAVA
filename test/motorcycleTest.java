package com.vehicleRental;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorcycleTest {

    private Motorcycle motorcycle;

    @BeforeEach
    void setUp() {
        motorcycle = new Motorcycle("M123", "Harley", 30.0);  // Create a Motorcycle object for testing
    }

    @Test
    void testCalculateRentalCost() {
        double cost = motorcycle.calculateRentalCost(7);  // Test rental cost for 7 days
        assertEquals(210.0, cost, "Rental cost for motorcycle should be 30.0 * 7 days");
    }
}
