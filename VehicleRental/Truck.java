package VehicleRental;

public class Truck extends Vehicle {
private final boolean isHeavyDuty; // More descriptive name
private final int trunkSize; // Corrected spelling and made final

public Truck(String vehicleId, String model, double baseRentalRate, boolean isHeavyDuty, int trunkSize) {
    super(vehicleId, model, baseRentalRate);
    this.isHeavyDuty = isHeavyDuty;
    this.trunkSize = trunkSize;
}

public int getTrunkSize() {
    return trunkSize;
}

public boolean isHeavyDuty() {
    return isHeavyDuty;
}

@Override
public double calculateRentalCost(int days) {
    double cost = super.getBaseRentalRate() * days;

    // Add additional costs based on truck characteristics
    if (isHeavyDuty) {
        cost += days * 20; // Example: Higher daily rate for heavy-duty trucks
    }
    // Add any other fees for the truck (e.g., based on trunkSize)
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
    return "Truck{" +
            "isHeavyDuty=" + isHeavyDuty +
            ", trunkSize=" + trunkSize +
            ", " + super.toString() +
            '}';
}
}
