package VehicleRental;

public class Motorbike extends Vehicle {
    private final boolean helmetBrand; // Corrected spelling and made final

    public Motorbike(String vehicleId, String model, double baseRentalRate, boolean helmetBrand) {
        super(vehicleId, model, baseRentalRate);
        this.helmetBrand = helmetBrand;
    }

    public boolean getHelmetBrand() {
        return helmetBrand;
    }

    @Override
    public double calculateRentalCost(int days) {
        // Add any additional costs for motorbikes here. For example:
        double cost = super.getBaseRentalRate() * days;
        // Add a surcharge for helmet rental if needed, or other motorbike specific costs.
        return cost;
    }

    @Override
    public void setAvailable(boolean available) {
        super.setAvailable(available);
    }

    @Override
    public boolean isAvailableForRental() {
        return super.isAvailable();
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "helmetBrand='" + helmetBrand + '\'' +
                ", " + super.toString() +
                '}';
    }
}
