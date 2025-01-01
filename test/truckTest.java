package com.vehicleRental;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TruckTest {

    private Truck truck;

    @BeforeEach
    void setUp() {
        truck = new Truck("T123", "Ford", 80.0);  // Create a Truck object for testing
    }

    @Test
    void testCalculateRentalCost() {
        double cost = truck.calculateRentalCost(4);  // Test rental cost for 4 days
        assertEquals(480.0, cost, "Rental cost for truck should be 80.0 * 4 days * 1.5");
    }
}
