package VehicleRental;

public abstract class Vehicle {

    private final String vehicleId;
    private final String model;
    private double baseRentalRate;
    private boolean isAvailable;

    public Vehicle(String vehicleId, String model, double baseRentalRate) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable =isAvailable();
    }

    public Vehicle() {

        model = "";
        baseRentalRate = 0;
        vehicleId = "";
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public double getBaseRentalRate() {
        return baseRentalRate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public abstract double baseRentalRate(int days);

    public abstract double calculateRentalCost(int days);
    public void setBaseRentalRate(double rate) {
        if (rate > 0) {
            this.baseRentalRate = rate;
        } else {
            throw new IllegalArgumentException("Rental rate must be positive.");
        }
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId='" + vehicleId + '\'' +
                ", model='" + model + '\'' +
                ", baseRentalRate=" + baseRentalRate +
                ", isAvailable=" + isAvailable +
                '}';
    }


    public abstract void setAvailable(boolean b);

    public abstract boolean isAvailableForRental();
}

