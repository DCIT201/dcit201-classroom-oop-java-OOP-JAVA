// Motorcycle.java (Concrete class extending Vehicle)
public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    // Constructor
    public Motorcycle(String vehicleId, String model, double baseRentalRate, boolean hasSidecar) {
        super(vehicleId, model, baseRentalRate);
        this.hasSidecar = hasSidecar;
    }

    // Implementing the abstract method to calculate rental cost
    @Override
    public double calculateRentalCost(int days) {
        double cost = getBaseRentalRate() * days;
        if (hasSidecar) {
            cost += 5 * days; // Additional cost for sidecar
        }
        return cost;
    }

    // Implementing the abstract method to check availability
    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    // toString method for the Motorcycle class
    @Override
    public String toString() {
        return "Motorcycle: " + getModel() + " with Sidecar: " + hasSidecar;
    }
}
