
// Supporting Class: Customer
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String customerId;
    private List<RentalTransaction> rentalHistory;

    public Customer(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
        this.rentalHistory = new ArrayList<>();
    }

    public String getName() { return name; }
    public String getCustomerId() { return customerId; }
    public List<RentalTransaction> getRentalHistory() { return rentalHistory; }

    public void addRental(RentalTransaction transaction) {
        rentalHistory.add(transaction);
    }
}