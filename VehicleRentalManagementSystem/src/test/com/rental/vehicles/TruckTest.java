package com.rental.vehicles;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TruckTest {
    @Test
    void testCalculateRentalCost() {
        Truck truck = new Truck("T001", "Ford F-150", 100);
        assertEquals(300, truck.calculateRentalCost(3));
    }

    @Test
    void testAvailability() {
        Truck truck = new Truck("T002", "Ram 1500", 120);
        assertTrue(truck.isAvailableForRental());
        truck.rent(null, 7);
        assertFalse(truck.isAvailableForRental());
    }
}
