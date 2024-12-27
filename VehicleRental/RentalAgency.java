package VehicleRental;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
public class RentalAgency implements RentalService {
    private final Map<String, Vehicle> vehicleFleet;
    private final List<RentalTransaction> rentalTransactions = new ArrayList<>();

    public RentalAgency() {
        this.vehicleFleet = new HashMap<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleFleet.put(vehicle.getVehicleId(), vehicle);
    }

    public void rentVehicle(String vehicleId, int days) throws IllegalArgumentException {
        Vehicle vehicle = vehicleFleet.get(vehicleId);
        if (vehicle == null || !vehicle.isAvailableForRental()) {
            throw new IllegalArgumentException("Vehicle not found or not available for rent.");
        }
        RentalTransaction.add();
        vehicle.setAvailable(false); // Update availability
    }

    public void returnVehicle(String vehicleId) {
        Vehicle vehicle = vehicleFleet.get(vehicleId);
        if (vehicle == null) {
            throw new IllegalArgumentException("Vehicle not found.");
        }
        vehicle.setAvailable(true); // Update availability
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


    @Override
    public void rent(Customer customer, int days) {

    }

    @Override
    public void returnVehicle() {

    }

    public Vehicle getVehicle() {
        return null;
    }

}
