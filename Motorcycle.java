// Concrete Class: Motorcycle
public class Motorcycle extends Vehicle implements Rentable {
    private boolean hasSidecar;

    public Motorcycle(String vehicleId, String model, double baseRentalRate, boolean hasSidecar) {
        super(vehicleId, model, baseRentalRate);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public double calculateRentalRate(int days) {
        double cost = getBaseRentalRate() * days;
        if (hasSidecar) cost += 20; // Additional fee for sidecar
        return cost;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public void rent(Customer customer, int days) {
        if (!isAvailableForRental()) {
            throw new IllegalStateException("Motorcycle is not available for rental.");
        }
        setAvailable(false);
        System.out.println("Motorcycle rented to " + customer.getName());
    }

    @Override
    public void returnVehicle() {
        setAvailable(true);
        System.out.println("Motorcycle returned.");
    }
}