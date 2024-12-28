// Supporting Class: RentalTransaction
import java.time.LocalDateTime;

public class RentalTransaction {
    private Customer customer;
    private Vehicle vehicle;
    private LocalDateTime rentalDate;
    private LocalDateTime returnDate;

    public RentalTransaction(Customer customer, Vehicle vehicle, LocalDateTime rentalDate) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalDate = rentalDate;
        this.returnDate = null; // Initially null
    }

    public Customer getCustomer() { return customer; }
    public Vehicle getVehicle() { return vehicle; }
    public LocalDateTime getRentalDate() { return rentalDate; }
    public LocalDateTime getReturnDate() { return returnDate; }

    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }
}
