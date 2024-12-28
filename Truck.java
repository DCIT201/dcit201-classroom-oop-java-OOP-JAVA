// Concrete Class: Truck
public class Truck extends Vehicle implements Rentable {
    private double cargoCapacity;

    public Truck(String vehicleId, String model, double baseRentalRate, double cargoCapacity) {
        super(vehicleId, model, baseRentalRate);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public double calculateRentalRate(int days) {
        return getBaseRentalRate() * days + (cargoCapacity * 10); // Fee based on cargo capacity
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public void rent(Customer customer, int days) {
        if (!isAvailableForRental()) {
            throw new IllegalStateException("Truck is not available for rental.");
        }
        setAvailable(false);
        System.out.println("Truck rented to " + customer.getName());
    }

    @Override
    public void returnVehicle() {
        setAvailable(true);
        System.out.println("Truck returned.");
    }
}