public class Car extends Vehicle {

    private int seatingCapacity;
    private boolean hasLuxuryFeatures;

    public Car(String vehicleId, String model, double baseRentalRate, int seatingCapacity, boolean hasLuxuryFeatures) {
        super(vehicleId, model, baseRentalRate); 
        this.seatingCapacity = seatingCapacity;
        this.hasLuxuryFeatures = hasLuxuryFeatures;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public boolean hasLuxuryFeatures() {
        return hasLuxuryFeatures;
    }

    public void setLuxuryFeatures(boolean hasLuxuryFeatures) {
        this.hasLuxuryFeatures = hasLuxuryFeatures;
    }

    @Override
    public double calculateRentalCost(int days) {
        double baseCost = getBaseRentalRate() * days;
        if (hasLuxuryFeatures) {
            baseCost += 50 * days; 
        }
        return baseCost;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable(); 
    }

    @Override
    public String toString() {
        return super.toString() + ", Seating Capacity: " + seatingCapacity + ", Luxury Features: " + (hasLuxuryFeatures ? "Yes" : "No");
    }
}
