package com.rental.vehicles;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    void testCalculateRentalCost() {
        Car car = new Car("C001", "Toyota Corolla", 50);
        assertEquals(150, car.calculateRentalCost(3));
    }

    @Test
    void testAvailability() {
        Car car = new Car("C002", "Honda Civic", 60);
        assertTrue(car.isAvailableForRental());
        car.rent(null, 5);
        assertFalse(car.isAvailableForRental());
    }
}
