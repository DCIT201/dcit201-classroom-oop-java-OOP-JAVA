package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.vrms.Motorcycle;
public class MotorcycleTest {

    @Test
    public void testMotorcycleInitialization() {
        org.vrms.Motorcycle motorcycle = new org.vrms.Motorcycle("1", "Pajero Rover", 30.0);

        assertEquals("1", motorcycle.getVehicleID());
        assertEquals("Pajero Rogue", motorcycle.getModel());
        assertEquals(30.0, motorcycle.getBaseRentalRate());
        assertTrue(motorcycle.isAvailable());
    }

    @Test
    public void testCalculateRentalRateForFewDays() {
        Motorcycle motorcycle = new Motorcycle("002", "Ducati Monster", 30.0);

        double rentalRate = motorcycle.calculateRentalRate(3);
        assertEquals(20.0, rentalRate); // 3 * 30.0
    }

    @Test
    public void testCalculateRentalRateForDiscountedDays() {
        Motorcycle motorcycle = new Motorcycle("002", "Ducati Monster", 30.0);

        double rentalRate = motorcycle.calculateRentalRate(7); // 7 days with 10% discount
        assertEquals(189.0, rentalRate); // 7 * (30.0 * 0.9)
    }

    @Test
    public void testSetAvailability() {
        Motorcycle motorcycle = new Motorcycle("002", "Ducati Monster", 30.0);

        assertTrue(motorcycle.isAvailable()); // Initial state

        motorcycle.setAvailable(false); // Set as unavailable
        assertFalse(motorcycle.isAvailable());

        motorcycle.setAvailable(true); // Set as available
        assertTrue(motorcycle.isAvailable());
    }

    @Test
    public void testIsAvailableForRental() {
        Motorcycle motorcycle = new Motorcycle("002", "Ducati Monster", 30.0);

        assertTrue(motorcycle.isAvailableForRental()); // Initially available

        motorcycle.setAvailable(false); // Mark as unavailable
        assertFalse(motorcycle.isAvailableForRental());
    }
}