// RentalAgency.java (Manages a fleet of vehicles)
import java.util.List;
import java.util.ArrayList;

public class RentalAgency {
    private List<Vehicle> vehicles;

    public RentalAgency() {
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public Vehicle getAvailableVehicle() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.isAvailableForRental()) {
                return vehicle;
            }
        }
        return null; // No vehicles available
    }
}
