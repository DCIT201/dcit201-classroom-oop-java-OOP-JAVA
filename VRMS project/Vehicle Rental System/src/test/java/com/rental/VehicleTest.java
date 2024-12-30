package com.rental;

import com.vehicleRental.Vehicle;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class VehicleTest extends TestCase {

    private Vehicle vehicle;

    public VehicleTest(String testName) {
        super(testName);
    }

    // Setup method to create a new Vehicle object before each test
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        // Create a concrete subclass of Vehicle for testing
        vehicle = new ConcreteVehicle("Vehicle 1", "Toyota Camry", 300.0); // Concrete vehicle for testing
    }

    public static Test suite() {
        return new TestSuite(VehicleTest.class);
    }

    // Concrete subclass of Vehicle for testing purposes
    static class ConcreteVehicle extends Vehicle {
        public ConcreteVehicle(String vehicleId, String model, double baseRentalRate) {
            super(vehicleId, model, baseRentalRate);
        }

        @Override
        public double calculateRentalCost(int days) {
            return getBaseRentalRate() * days; // Simple rental cost calculation for testing
        }

        @Override
        public boolean isAvailableForRental() {
            return isAvailable(); // Return availability status
        }
    }

    // Test for the constructor and getters
    public void testConstructorAndGetters() {
        assertEquals("Vehicle ID should be 'Vehicle 1'", "Vehicle 1", vehicle.getVehicleId());
        assertEquals("Model should be 'Toyota Camry'", "Toyota Camry", vehicle.getModel());
        assertEquals("Base rental rate should be 300.0", 300.0, vehicle.getBaseRentalRate());
        assertTrue("The vehicle should be available by default.", vehicle.isAvailable());
    }

    // Test for calculateRentalCost method
    public void testCalculateRentalCost() {
        int rentalDays = 5;
        double expectedCost = 300.0 * rentalDays; // 300 * 5 = 1500.0
        assertEquals("The rental cost should be calculated correctly.", expectedCost, vehicle.calculateRentalCost(rentalDays));
    }

    // Test for isAvailableForRental method
    public void testIsAvailableForRental() {
        assertTrue("The vehicle should be available for rental by default.", vehicle.isAvailableForRental());
        vehicle.setAvailable(false);
        assertFalse("The vehicle should not be available when availability is set to false.", vehicle.isAvailableForRental());
    }

    // Test for the toString method
    public void testToString() {
        String expectedString = "Vehicle ID: V1, Model: Toyota Camry, Base Rental Rate: 300.0 Cedis ";
        assertEquals("The toString method should return the correct vehicle details.", expectedString, vehicle.toString());
    }
}
