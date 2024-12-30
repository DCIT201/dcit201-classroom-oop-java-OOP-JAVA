// Supporting Class: RentalAgency
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> garage;

    public RentalAgency() {
        this.garage = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        garage.add(vehicle);
    }

    public Vehicle findAvailableVehicle(String model) {
        for (Vehicle vehicle : garage) {
            if (vehicle.getModel().equalsIgnoreCase(model) && vehicle.isAvailable()) {
                return vehicle;
            }
        }
        return null;
    }

    public void processRental(Customer customer, String model, int days) {
        Vehicle vehicle = findAvailableVehicle(model);
        if (vehicle == null) {
            System.out.println("No available vehicles of model: " + model);
            return;
        }
        vehicle.rent(customer, days);
        customer.addRental(new RentalTransaction(customer, vehicle, LocalDateTime.now()));
    }
}
