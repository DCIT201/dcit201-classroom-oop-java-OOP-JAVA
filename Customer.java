import java.util.ArrayList;
import java.util.List;

public class Customer {

    // Attributes
    private String customerId;
    private String name;
    private String contactNumber;
    private final List<Vehicle> rentalHistory; // List of vehicles rented by the customer
    private final List<Vehicle> currentRentals; // List of currently rented vehicles

    // Constructor
    public Customer(String customerId, String name, String contactNumber) {
        this.customerId = customerId;
        this.name = name;
        this.contactNumber = contactNumber;
        this.rentalHistory = new ArrayList<>();
        this.currentRentals = new ArrayList<>();
    }

    // Getters and Setters
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

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public List<Vehicle> getRentalHistory() {
        return rentalHistory;
    }

    public List<Vehicle> getCurrentRentals() {
        return currentRentals;
    }

    // Methods

    // Add a vehicle to the current rentals
    public void rentVehicle(Vehicle vehicle) {
        if (vehicle.isAvailable()) {
            currentRentals.add(vehicle);
            vehicle.setAvailable(false); // Mark the vehicle as rented
        } else {
            System.out.println("Vehicle is not available for rental.");
        }
    }

    // Return a vehicle and move it to rental history
    public void returnVehicle(Vehicle vehicle) {
        if (currentRentals.remove(vehicle)) {
            rentalHistory.add(vehicle);
            vehicle.setAvailable(true); // Mark the vehicle as available
        } else {
            System.out.println("This vehicle is not currently rented by the customer.");
        }
    }

    // Display rental history
    public void displayRentalHistory() {
        System.out.println("Rental History for Customer: " + name);
        for (Vehicle vehicle : rentalHistory) {
            System.out.println(vehicle);
        }
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerId + ", Name: " + name + ", Contact: " + contactNumber + ", Current Rentals: " + currentRentals.size();
    }
}
