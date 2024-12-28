package VehicleRental;

public class RentalTransaction {
private final Vehicle vehicle;
private final Customer customer;
private final int rentalDays;
private final double totalCost;

public RentalTransaction(Vehicle vehicle, Customer customer, int rentalDays) {
    this.vehicle = vehicle;
    this.customer = customer;
    this.rentalDays = rentalDays;
    this.totalCost = vehicle.calculateRentalCost(rentalDays);
}

public double getTotalCost() {
    return totalCost;
}

public Vehicle getVehicle() {
    return vehicle;
}

//Add a getter for Customer
public Customer getCustomer() {
    return customer;
}


@Override
public String toString() {
    return "Rental Transaction:\n" +
            "Vehicle: " + vehicle + "\n" +
            "Customer: " + customer + "\n" +
            "Rental Days: " + rentalDays + "\n" +
            "Total Cost: " + totalCost;
}
}
