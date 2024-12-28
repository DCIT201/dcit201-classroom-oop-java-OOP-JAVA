package VehicleRental;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class RentalAgency implements RentalService {
    private final Map<String, Vehicle> vehicleFleet;
    private final List<RentalTransaction> rentalTransactions = new ArrayList<>();

    public RentalAgency() {
        this.vehicleFleet = new HashMap<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleFleet.put(vehicle.getVehicleId(), vehicle);
    }

    public void rentVehicle(String vehicleId, Customer customer, int days) throws IllegalArgumentException {
        Vehicle vehicle = vehicleFleet.get(vehicleId);
        if (vehicle == null || !vehicle.isAvailableForRental()) {
            throw new IllegalArgumentException("Vehicle not found or not available for rent.");
        }
        RentalTransaction transaction = new RentalTransaction(vehicle, customer, days); // Create transaction
        rentalTransactions.add(transaction); // Add to transactions list
        vehicle.setAvailable(false);
    }

    public void returnVehicle(String vehicleId) throws IllegalArgumentException {
        Vehicle vehicle = vehicleFleet.get(vehicleId);
        if (vehicle == null) {
            throw new IllegalArgumentException("Vehicle not found.");
        }

        //Find and remove the transaction (important!)
        rentalTransactions.removeIf(transaction -> transaction.getVehicle().getVehicleId().equals(vehicleId));
        vehicle.setAvailable(true);
    }

    public String generateReport() {
        StringBuilder report = new StringBuilder();
        double totalRevenue = 0;
        report.append("Rental Agency Report:\n");
        report.append("--------------------\n");
        for (RentalTransaction transaction : rentalTransactions) {
            report.append(transaction.toString()).append("\n");
            totalRevenue += transaction.getTotalCost();
        }
        report.append("--------------------\n");
        report.append("Total Revenue: ").append(totalRevenue).append("\n");
        return report.toString();
    }

    // Remove the unnecessary and incomplete methods:
    // @Override
    // public void rent(Customer customer, int days) {}

    // @Override
    // public void returnVehicle() {}

    // public Vehicle getVehicle() { return null; }

    // You can keep one rentVehicle method (this one is better):
    // public void rentVehicle(String vehicleId, Customer customer, int days) {}


    public Map<String, Vehicle> getVehicleFleet() {
        return vehicleFleet; // Added getter for debugging purposes
    }

    @Override
    public void rent(Customer customer, int days) {

    }

    @Override
    public void returnVehicle() {

    }
}
