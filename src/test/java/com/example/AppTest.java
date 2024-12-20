package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    private Car car;
    private Motorcycle motorcycle;
    private Truck truck;
    private Customer customer;

    @BeforeEach
    public void setUp() {
        car = new Car(1, "Toyota", true, 100, true);
        motorcycle = new Motorcycle(2, "Yamaha", true, 50);
        truck = new Truck(3, "Ford", true, 150, 5000);
        customer = new Customer(1, "John Doe", "123456789");
    }

    @Test
    public void testCalculateRentalCost() {
        assertEquals(220, car.calculateRentalCost(2), "Car rental cost calculation failed");
        assertEquals(150, motorcycle.calculateRentalCost(3), "Motorcycle rental cost calculation failed");
        assertEquals(10300, truck.calculateRentalCost(2), "Truck rental cost calculation failed");
    }

    @Test
    public void testIsAvailableForRental() {
        assertTrue(car.isAvailableForRental(), "Car should be available for rental");
        assertTrue(motorcycle.isAvailableForRental(), "Motorcycle should be available for rental");
        assertTrue(truck.isAvailableForRental(), "Truck should be available for rental");

        car.setAvailable(false);
        assertFalse(car.isAvailableForRental(), "Car should not be available for rental");
    }

    @Test
    public void testRentingAndReturningVehicles() {
        car.rent(customer, 3);
        assertFalse(car.isAvailable(), "Car should not be available after renting");

        car.returnVehicle();
        assertTrue(car.isAvailable(), "Car should be available after returning");
    }

    @Test
    public void testRentingUnavailableVehicle() {
        car.setAvailable(false);
        car.rent(customer, 3);
        assertFalse(car.isAvailable(), "Car should remain unavailable after attempting to rent it while unavailable");
    }

    @Test
    public void testFieldAccessAndSetterConstraints() {
        car.setModel("Honda");
        assertEquals("Honda", car.getModel(), "Car model should be updated");

        car.setAvailable(false);
        assertFalse(car.isAvailable(), "Car availability should be updated");

        assertThrows(IllegalArgumentException.class, () -> car.setBaseRentalRate(-100), "Setting a negative rental rate should throw an exception");
    }
}
