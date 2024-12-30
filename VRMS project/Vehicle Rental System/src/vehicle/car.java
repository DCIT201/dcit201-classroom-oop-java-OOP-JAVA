// Car.java (Concrete class extending Vehicle)
public class Car extends Vehicle {
    private boolean hasAirConditioning;

    // Constructor
    public Car(String vehicleId, String model, double baseRentalRate, boolean hasAirConditioning) {
        super(vehicleId, model, baseRentalRate);
        this.hasAirConditioning = hasAirConditioning;
    }

    // Implementing the abstract method to calculate rental cost
    @Override
    public double calculateRentalCost(int days) {
        double cost = getBaseRentalRate() * days;
        if (hasAirConditioning) {
            cost += 10 * days; // Additional cost for air conditioning
        }
        return cost;
    }

    // Implementing the abstract method to check availability
    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    // toString method for the Car class
    @Override
    public String toString() {
        return "Car: " + getModel() + " with A/C: " + hasAirConditioning;
    }
}
