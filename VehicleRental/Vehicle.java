package VehicleRental;

public abstract class Vehicle {
    private final String vehicleId;
    private final String model;
    private double baseRentalRate;
    private boolean isAvailable = true; // Initialize to available

    public Vehicle(String vehicleId, String model, double baseRentalRate) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.setBaseRentalRate(baseRentalRate); // Use the setter for validation
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getModel() {
        return model;
    }

    public double getBaseRentalRate() {
        return baseRentalRate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    public boolean isAvailableForRental() {
        return isAvailable;
    }

    public void setBaseRentalRate(double rate) {
        if (rate > 0) {
            this.baseRentalRate = rate;
        } else {
            throw new IllegalArgumentException("Rental rate must be positive.");
        }
    }

    public abstract double calculateRentalCost(int days);

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId='" + vehicleId + '\'' +
                ", model='" + model + '\'' +
                ", baseRentalRate=" + baseRentalRate +
                ", isAvailable=" + isAvailable +
                '}';
    }
}

