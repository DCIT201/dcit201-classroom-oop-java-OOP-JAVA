package com.example.vehiclerental.tests;

import com.example.vehiclerental.exceptions.RentalException;
import com.example.vehiclerental.model.Car;
import com.example.vehiclerental.model.Customer;
import com.example.vehiclerental.service.RentalAgency;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RentalAgencyTest {

    @Test
    public void testRentVehicleSuccess() throws RentalException {
        RentalAgency agency = new RentalAgency();
        Car car = new Car("CAR100", "Test Car", 40.0, false);
        agency.addVehicle(car);

        Customer customer = new Customer("CUST100", "John Doe");
        agency.rentVehicle("CAR100", customer, 2);

        // The car should now be unavailable
        Assertions.assertFalse(car.isAvailableForRental());
        // The transaction list should have 1 entry
        Assertions.assertEquals(1, agency.getAllTransactions().size());
    }

    @Test
    public void testRentVehicleNotEligible() {
        RentalAgency agency = new RentalAgency();
        Car car = new Car("CAR200", "Test Car", 40.0, false);
        agency.addVehicle(car);

        Customer customer = new Customer("CUST200", "Jane Doe");
        customer.setEligible(false);

        // Expect a RentalException
        Assertions.assertThrows(RentalException.class, () -> {
            agency.rentVehicle("CAR200", customer, 2);
        });
    }
}
