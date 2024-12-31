package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.vrms.Truck;
import org.vrms.Vehicle;
public class TruckTest {

    @Test
    public void testTruckInitialization() {
        Truck truck = new Truck("4", "Ford F-150", 80.0, 12.0);

        assertEquals("4", truck.getVehicleID());
        assertEquals("Ford F-150", truck.getModel());
        assertEquals(80.0, truck.getBaseRentalRate());
        assertTrue(truck.isAvailable());
    }

    @Test
    public void testCalculateRentalRateForLightTruck() {
        Truck truck = new Truck("4", "Ford F-150", 80.0, 8.0);

        double rentalRate = truck.calculateRentalRate(5); // 5 days, no surcharge for light trucks
        assertEquals(780.0, rentalRate); // 5 * 80.0
    }

    @Test
    public void testCalculateRentalRateForHeavyTruck() {
        Truck truck = new Truck("4", "Ford F-150", 80.0, 15.0);

        double rentalRate = truck.calculateRentalRate(3); // 3 days with surcharge for heavy trucks
        assertEquals(400.0, rentalRate); // 3 * (80.0 + 50.0)
    }

    @Test
    public void testSetAvailability() {
        Truck truck = new Truck("4", "Ford F-150", 80.0, 12.0);

        assertTrue(truck.isAvailable()); // Initial state

        truck.setAvailable(false); // Set as unavailable
        assertFalse(truck.isAvailable());

        truck.setAvailable(true); // Set as available again
        assertTrue(truck.isAvailable());
    }

    @Test
    public void testIsAvailableForRental() {
        Truck truck = new Truck("4", "Ford F-150", 80.0, 12.0);

        assertTrue(truck.isAvailableForRental()); // Initially available

        truck.setAvailable(false); // Mark as unavailable
        assertFalse(truck.isAvailableForRental());
    }
}