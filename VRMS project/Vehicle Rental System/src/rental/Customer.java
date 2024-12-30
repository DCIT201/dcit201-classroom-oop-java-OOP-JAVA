// Customer.java (Represents a customer in the rental system)
import java.util.List;
import java.util.ArrayList;

public class Customer {
    private String customerId;
    private String name;
    private List<RentalTransaction> rentalHistory;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.rentalHistory = new ArrayList<>();
    }

    public void addRental(Vehicle vehicle, int days) {
        RentalTransaction transaction = new RentalTransaction(vehicle, days);
        rentalHistory.add(transaction);
    }

    public List<RentalTransaction> getRentalHistory() {
        return rentalHistory;
    }

    // Getter and setter methods...
}
