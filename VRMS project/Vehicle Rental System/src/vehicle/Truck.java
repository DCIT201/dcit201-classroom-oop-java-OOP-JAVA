// Truck.java (Concrete class extending Vehicle)
public class Truck extends Vehicle {
    private double loadCapacity;

    // Constructor
    public Truck(String vehicleId, String model, double baseRentalRate, double loadCapacity) {
        super(vehicleId, model, baseRentalRate);
        this.loadCapacity = loadCapacity;
    }

    // Implementing the abstract method to calculate rental cost
    @Override
    public double calculateRentalCost(int days) {
        double cost = getBaseRentalRate() * days;
        if (loadCapacity > 1000) {
            cost += 20 * days; // Additional cost for high load capacity
        }
        return cost;
    }

    // Implementing the abstract method to check availability
    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    // toString method for the Truck class
    @Override
    public String toString() {
        return "Truck: " + getModel() + " with Load Capacity: " + loadCapacity + "kg";
    }
}
