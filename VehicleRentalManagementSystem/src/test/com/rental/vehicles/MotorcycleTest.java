package com.rental.vehicles;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MotorcycleTest {
    @Test
    void testCalculateRentalCost() {
        Motorcycle moto = new Motorcycle("M001", "Yamaha R1", 30);
        assertEquals(90, moto.calculateRentalCost(3));
    }

    @Test
    void testAvailability() {
        Motorcycle moto = new Motorcycle("M002", "Suzuki GSX", 40);
        assertTrue(moto.isAvailableForRental());
        moto.rent(null, 2);
        assertFalse(moto.isAvailableForRental());
    }
}
