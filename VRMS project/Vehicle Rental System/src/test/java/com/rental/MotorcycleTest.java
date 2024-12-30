package com.rental;

import com.vehicleRental.Motorcycle;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MotorcycleTest extends TestCase {

    private Motorcycle motorcycle;

    public MotorcycleTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        motorcycle = new Motorcycle("M1", "Honda Fury", 150.0); // Concrete Motorcycle for testing
    }

    public static Test suite() {
        return new TestSuite(MotorcycleTest.class);
    }

    public void testConstructorAndGetters() {
        assertEquals("Vehicle ID should be 'Motorcycle 1'", "Motorcycle 1", motorcycle.getVehicleId());
        assertEquals("Model should be 'Honda Fury'", "Honda Fury", motorcycle.getModel());
        assertEquals("Base rental rate should be 150.0", 150.0, motorcycle.getBaseRentalRate());
        assertTrue("The motorcycle should be available by default.", motorcycle.isAvailable());
    }

    public void testCalculateRentalCost() {
        int rentalDays = 3;
        double expectedCost = 150.0 * rentalDays; // No additional charge for motorcycles
        assertEquals("The rental cost should be calculated correctly.", expectedCost, motorcycle.calculateRentalCost(rentalDays));
    }

    public void testIsAvailableForRental() {
        assertTrue("The motorcycle should be available for rental by default.", motorcycle.isAvailableForRental());
        motorcycle.setAvailable(false);
        assertFalse("The motorcycle should not be available when availability is set to false.", motorcycle.isAvailableForRental());
    }

    public void testToString() {
        String expectedString = "Vehicle ID: Motorcycle 1, Model: Honda Fury, Base Rental Rate: 150.0 Cedis ";
        assertEquals("The toString method should return the correct vehicle details.", expectedString, motorcycle.toString());
    }
}
