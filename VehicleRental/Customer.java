package VehicleRental;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private RentalTransaction transaction;
    private String customerId;
    private String name;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        List<RentalTransaction> rentalHistory = new ArrayList<>();

        Object addRentalToHistory = new Object();
        RentalTransaction rentalTransaction = null; { rentalHistory.add(null); }
        transaction = null;
    }

    public Customer(RentalTransaction transaction) {
        this.transaction = transaction;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RentalTransaction getTransaction() {
        return transaction;
    }

    public void setTransaction(RentalTransaction transaction) {
        this.transaction = transaction;
    }
}
