package com.example.vehiclerental.tests;

import com.example.vehiclerental.model.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VehicleTest {

    @Test
    public void testCarCalculateRentalCostWithChildSeat() {
        Car car = new Car("CAR001", "Toyota Corolla", 50.0, true);
        double cost = car.calculateRentalCost(3);
        // baseRate=50 * 3=150, childSeat=5 * 3=15, total=165
        Assertions.assertEquals(165.0, cost, 0.0001);
    }

    @Test
    public void testCarAvailability() {
        Car car = new Car("CAR002", "Honda Civic", 55.0, false);
        // Initially available
        Assertions.assertTrue(car.isAvailableForRental());

        // Rent the car
        car.rent(null, 1);
        Assertions.assertFalse(car.isAvailableForRental());

        // Return the car
        car.returnVehicle();
        Assertions.assertTrue(car.isAvailableForRental());
    }
}
