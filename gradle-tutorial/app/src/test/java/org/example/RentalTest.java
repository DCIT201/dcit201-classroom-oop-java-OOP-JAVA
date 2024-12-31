package org.example;
import org.junit.Test;
import static org.junit.Assert.*;
import org.vrms.Customer;


public class RentalTest {
    @Test
    public void testRedeemPoints() {
        Customer customer = new Customer("123", "John Doe");
        int initialPoints = customer.getPoints("123");
        customer.redeemPoints("123", 5);
        assertEquals(initialPoints - 5, customer.getPoints("123"));
    }

    @Test
    public void testAddPoints() {
        Customer customer = new Customer("123", "John Doe");
        int initialPoints = customer.getPoints("123");
        customer.addPoints("123", 5);
        assertEquals(initialPoints + 5, customer.getPoints("123"));
    }

}
