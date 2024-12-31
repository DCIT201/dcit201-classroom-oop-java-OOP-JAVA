public class Motorcycle extends Vehicle {

    private int engineCapacity; 
    private boolean isSportBike; 

    public Motorcycle(String vehicleId, String model, double baseRentalRate, int engineCapacity, boolean isSportBike) {
        super(vehicleId, model, baseRentalRate); 
        this.engineCapacity = engineCapacity;
        this.isSportBike = isSportBike;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public boolean isSportBike() {
        return isSportBike;
    }

    public void setSportBike(boolean sportBike) {
        isSportBike = sportBike;
    }

    @Override
    public double calculateRentalCost(int days) {
        double baseCost = getBaseRentalRate() * days;
        if (isSportBike) {
            baseCost += 30 * days; 
        }
        return baseCost;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public String toString() {
        return super.toString() + ", Engine Capacity: " + engineCapacity + " CC, Sport Bike: " + (isSportBike ? "Yes" : "No");
    }
}
