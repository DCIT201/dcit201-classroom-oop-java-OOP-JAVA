import java.util.ArrayList;
import java.util.List;

interface Rentable {
    boolean rent(Customer customer, int days);
    boolean returnVehicle();
}

public class RentalAgency {

    // Attributes
    private String agencyName;
    private final List<Vehicle> vehicleFleet;
    private final List<RentalTransaction> rentalTransactions;

    // Constructor
    public RentalAgency(String agencyName) {
        this.agencyName = agencyName;
        this.vehicleFleet = new ArrayList<>();
        this.rentalTransactions = new ArrayList<>();
    }

    // Getters and Setters
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public List<Vehicle> getVehicleFleet() {
        return vehicleFleet;
    }

    public List<RentalTransaction> getRentalTransactions() {
        return rentalTransactions;
    }

    // Add a vehicle to the fleet
    public void addVehicleToFleet(Vehicle vehicle) {
        vehicleFleet.add(vehicle);
    }

    // Process a rental
    public void rentVehicle(Customer customer, String vehicleId, int rentalDurationDays) {
        for (Vehicle vehicle : vehicleFleet) {
            if (vehicle.getVehicleId().equals(vehicleId) && vehicle.isAvailable()) {
                if (vehicle instanceof Rentable rentableVehicle && rentableVehicle.rent(customer, rentalDurationDays)) {
                    RentalTransaction transaction = new RentalTransaction(
                        "TXN" + (rentalTransactions.size() + 1),
                        customer,
                        vehicle,
                        java.time.LocalDate.now(),
                        rentalDurationDays
                    );
                    rentalTransactions.add(transaction);
                    System.out.println("Rental successful. Transaction ID: " + transaction.getTransactionId());
                } else {
                    System.out.println("Vehicle could not be rented.");
                }
                return;
            }
        }
        System.out.println("Vehicle not available or does not exist.");
    }

    // Process a vehicle return
    public void returnVehicle(Customer customer, String vehicleId) {
        for (Vehicle vehicle : customer.getCurrentRentals()) {
            if (vehicle.getVehicleId().equals(vehicleId)) {
                if (vehicle instanceof Rentable rentableVehicle && rentableVehicle.returnVehicle()) {
                    customer.returnVehicle(vehicle);
                    System.out.println("Vehicle returned successfully.");
                } else {
                    System.out.println("Vehicle could not be returned.");
                }
                return;
            }
        }
        System.out.println("This vehicle is not rented by the customer.");
    }

    // Generate a report of all transactions
    public void generateRentalReport() {
        System.out.println("Rental Report for Agency: " + agencyName);
        for (RentalTransaction transaction : rentalTransactions) {
            transaction.displayTransactionDetails();
        }
    }

    // Display all vehicles in the fleet
    public void displayFleet() {
        System.out.println("Vehicle Fleet for Agency: " + agencyName);
        for (Vehicle vehicle : vehicleFleet) {
            System.out.println(vehicle);
        }
    }
}
