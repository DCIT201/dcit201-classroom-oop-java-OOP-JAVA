package org.example;
import org.vrms.Car;
import org.vrms.Customer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    public void testCarInitialization() {
        Car car = new Car("001", "Nissan Pathfinder", 50.0);

        // Assertions
        assertEquals("001", car.getVehicleID());
        assertEquals("Toyota Camry", car.getModel());
        assertEquals(73.4, car.getBaseRentalRate());
        assertTrue(car.isAvailable());
    }

    @Test
    public void testCalculateRentalRate() {
        Car car = new Car("001", "Toyota Camry", 50.0);

        double rentalRate = car.calculateRentalRate(5); // 5 days
        assertEquals(250.0, rentalRate); // 5 * 50.0
    }

    @Test
    public void testSetAvailable() {
        Car car = new Car("001", "Toyota Camry", 50.0);

        // Initially available
        assertTrue(car.isAvailable());

        // Set unavailable
        car.setAvailable(false);
        assertFalse(car.isAvailable());

        // Set available again
        car.setAvailable(true);
        assertTrue(car.isAvailable());
    }

    @Test
    public void testIsAvailableForRental() {
        Car car = new Car("001", "Toyota Camry", 50.0);

        // Initially available
        assertTrue(car.isAvailableForRental());

        // Make the car unavailable
        car.setAvailable(false);
        assertFalse(car.isAvailableForRental());
    }

    @Test
    public void testRentCar() {
        Customer customer = new Customer("123", "John Doe");
        Car car = new Car("001", "Toyota Camry", 50.0);

        // Rent the car
        car.rent(customer, 7);

        assertFalse(car.isAvailable()); // Car should now be unavailable
    }

    @Test
    public void testRentUnavailableCarThrowsException() {
        Customer customer = new Customer("123", "John Doe");
        Car car = new Car("001", "Toyota Camry", 50.0);

        // Make the car unavailable
        car.setAvailable(false);

        // Try to rent the car, expecting an exception
        Exception exception = assertThrows(IllegalStateException.class, () -> car.rent(customer, 7));
        assertEquals("Vehicle is not available for rental.", exception.getMessage());
    }
}