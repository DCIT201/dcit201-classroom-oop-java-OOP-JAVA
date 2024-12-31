public class RentalTransaction {
    private String transactionID;
    private Vehicle vehicle;
    private Customer customer;
    private int daysRented;

    public RentalTransaction(String transactionID, Vehicle vehicle, Customer customer, int daysRented) {
        this.transactionID = transactionID;
        this.vehicle = vehicle;
        this.customer = customer;
        this.daysRented = daysRented;
    }

    // to calculte the total cost of the rental
    public double calculateTotalCost() {
        return vehicle.calculateRentalCost(daysRented);
    }

@Override
public String toString() {
    return "Transaction ID: " + transactionID + ", Vehicle rented: " + getModel() + ", Customer: " + customer.getName() + ", The Total Cost:" + calculateTotalCost() ;
}
}