package com.rental;

import com.vehicleRental.Car;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CarTest extends TestCase {

    private Car car;

    public CarTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        car = new Car("Car 1", "Toyota Supra", 500.0); // Concrete Car for testing
    }

    public static Test suite() {
        return new TestSuite(CarTest.class);
    }

    public void testConstructorAndGetters() {
        assertEquals("Vehicle ID should be 'Car 1'", "Car 1", car.getVehicleId());
        assertEquals("Model should be 'Toyota Supra'", "Toyota Supra", car.getModel());
        assertEquals("Base rental rate should be 500.0", 500.0, car.getBaseRentalRate());
        assertTrue("The car should be available by default.", car.isAvailable());
    }

    public void testCalculateRentalCost() {
        int rentalDays = 5;
        double expectedCost = 500.0 * rentalDays * 1.2; // Apply 20% charge for car
        assertEquals("The rental cost should be calculated correctly.", expectedCost, car.calculateRentalCost(rentalDays));
    }

    public void testIsAvailableForRental() {
        assertTrue("The car should be available for rental by default.", car.isAvailableForRental());
        car.setAvailable(false);
        assertFalse("The car should not be available when availability is set to false.", car.isAvailableForRental());
    }

    public void testToString() {
        String expectedString = "Vehicle ID: Car 1, Model: Toyota Supra, Base Rental Rate: 500.0 Cedis ";
        assertEquals("The toString method should return the correct vehicle details.", expectedString, car.toString());
    }
}
