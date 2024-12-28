package VehicleRental;

public class Car extends Vehicle {
    private final boolean hasGPS; // More descriptive name

    public Car(String vehicleId, String model, double baseRentalRate, boolean hasGPS) {
        super(vehicleId, model, baseRentalRate);
        this.hasGPS = hasGPS;
    }

    @Override
    public double calculateRentalCost(int days) {
        double cost = super.getBaseRentalRate() * days;
        if (hasGPS) {
            cost += days * 10; // Example additional cost for GPS
        }
        return cost;
    }

    @Override
    public void setAvailable(boolean available) {
        super.setAvailable(available); // Use the Vehicle's implementation
    }

    @Override
    public boolean isAvailableForRental() {
        return super.isAvailable(); // Use the Vehicle's implementation
    }

    @Override
    public String toString() {
        return "Car{" +
                "hasGPS=" + hasGPS +
                ", " + super.toString() +
                '}';
    }
}
