package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

import org.vrms.Customer;
import org.vrms.RentalTransaction;

public class CustomerTest {

    @Test
    public void testCustomerCreation() {
        Customer customer = new Customer("123", "John Doe");
        assertEquals("123", customer.getId());
        assertEquals("John Doe", customer.getName());
    }

    @Test
    public void testCustomerRentalTransaction() {
        Customer customer = new Customer("123", "John Doe");
        assertEquals(2, customer.getRentalHistory().size());
    }
}