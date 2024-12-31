public class Truck extends Vehicle {

    private double maxCargoWeight; 
    private boolean hasRefrigeration; 

    public Truck(String vehicleId, String model, double baseRentalRate, double maxCargoWeight, boolean hasRefrigeration) {
        super(vehicleId, model, baseRentalRate); 
        this.maxCargoWeight = maxCargoWeight;
        this.hasRefrigeration = hasRefrigeration;
    }

    public double getMaxCargoWeight() {
        return maxCargoWeight;
    }

    public void setMaxCargoWeight(double maxCargoWeight) {
        this.maxCargoWeight = maxCargoWeight;
    }

    public boolean hasRefrigeration() {
        return hasRefrigeration;
    }

    public void setRefrigeration(boolean hasRefrigeration) {
        this.hasRefrigeration = hasRefrigeration;
    }

    // Overriding abstract methods
    @Override
    public double calculateRentalCost(int days) {
        double baseCost = getBaseRentalRate() * days;
        if (hasRefrigeration) {
            baseCost += 100 * days; 
        }
        return baseCost;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public String toString() {
        return super.toString() + ", Max Cargo Weight: " + maxCargoWeight + " kg, Refrigeration: " + (hasRefrigeration ? "Yes" : "No");
    }
}
