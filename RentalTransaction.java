import java.time.LocalDate;

public class RentalTransaction {

    // Attributes
    private String transactionId;
    private Customer customer;
    private Vehicle vehicle;
    private LocalDate rentalDate;
    private LocalDate returnDate;
    private double totalCost;

    // Constructor
    public RentalTransaction(String transactionId, Customer customer, Vehicle vehicle, LocalDate rentalDate, int rentalDurationDays) {
        this.transactionId = transactionId;
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalDate = rentalDate;
        this.returnDate = rentalDate.plusDays(rentalDurationDays);
        this.totalCost = vehicle.calculateRentalCost(rentalDurationDays);
    }

    // Getters and Setters
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDate getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(LocalDate rentalDate) {
        this.rentalDate = rentalDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    // Display transaction details
    public void displayTransactionDetails() {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Vehicle: " + vehicle.getModel());
        System.out.println("Rental Date: " + rentalDate);
        System.out.println("Return Date: " + returnDate);
        System.out.println("Total Cost: $" + totalCost);
    }

    @Override
    public String toString() {
        return "Transaction ID: " + transactionId + ", Customer: " + customer.getName() + ", Vehicle: " + vehicle.getModel() + ", Rental Date: " + rentalDate + ", Return Date: " + returnDate + ", Total Cost: $" + totalCost;
    }
}
