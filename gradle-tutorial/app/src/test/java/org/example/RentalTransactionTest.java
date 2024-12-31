package org.example;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import org.vrms.Customer;
import org.vrms.RentalTransaction;
import org.vrms.Vehicle;
import org.vrms.Car;


import static org.junit.jupiter.api.Assertions.*;

public class RentalTransactionTest {

    @Test
    public void testInitialization() {
        Customer customer = new Customer("123", "John Doe");
        Vehicle vehicle = new Car("001", "Toyota Camry", 50.0);
        LocalDateTime rentalDate = LocalDateTime.now();

        RentalTransaction transaction = new RentalTransaction(1, customer, vehicle, rentalDate);

        assertEquals(1, transaction.getTranID());
        assertEquals(customer, transaction.getCustomer());
        assertEquals(vehicle, transaction.getVehicle());
        assertEquals(rentalDate, transaction.getRentalDate());
        assertNull(transaction.getReturnDate());
    }

    @Test
    public void testSetReturnDate() {
        Customer customer = new Customer("123", "John Doe");
        Vehicle vehicle = new Car("001", "Toyota Camry", 50.0);
        LocalDateTime rentalDate = LocalDateTime.now();

        RentalTransaction transaction = new RentalTransaction(1, customer, vehicle, rentalDate);

        LocalDateTime returnDate = LocalDateTime.now().plusDays(5);
        transaction.setReturnDate(returnDate);

        assertEquals(returnDate, transaction.getReturnDate());
    }

    @Test
    public void testAddPoints() {
        Customer customer = new Customer("123", "John Doe");
        Vehicle vehicle = new Car("001", "Toyota Camry", 50.0);
        LocalDateTime rentalDate = LocalDateTime.now();

        RentalTransaction transaction = new RentalTransaction(1, customer, vehicle, rentalDate);

        transaction.addPoints(10);

        assertEquals(10, customer.getPoints("123"));  // Assuming Customer's getPoints is fixed as suggested earlier
    }

    @Test
    public void testSettersAndGetters() {
        Customer customer = new Customer("123", "John Doe");
        Vehicle vehicle = new Car("001", "Toyota Camry", 50.0);
        LocalDateTime rentalDate = LocalDateTime.now();
        LocalDateTime updatedRentalDate = rentalDate.plusDays(1);

        RentalTransaction transaction = new RentalTransaction(1, customer, vehicle, rentalDate);

        // Setters
        Customer updatedCustomer = new Customer("124", "Jane Doe");
        Vehicle updatedVehicle = new Car("002", "Honda Civic", 45.0);

        transaction.setCustomer(updatedCustomer);
        transaction.setVehicle(updatedVehicle);
        transaction.setRentalDate(updatedRentalDate);
        transaction.setTranID(2);

        // Getters and Assertions
        assertEquals(updatedCustomer, transaction.getCustomer());
        assertEquals(updatedVehicle, transaction.getVehicle());
        assertEquals(updatedRentalDate, transaction.getRentalDate());
        assertEquals(2, transaction.getTranID());
    }

    @Test
    public void testIllegalArgumentsInRentalTransaction() {
        assertThrows(NullPointerException.class, () -> new RentalTransaction(1, null, null, null));
    }
}