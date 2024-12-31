public class Truck extends Vehicle {
    public Truck(String vehicleID, String moedl, double baseRentalRate, double loadCapacity) {
        super(vehicleID, model, baseRentalRate);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacty(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    //calculate rental cost + charges fro cargo or load
    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days + loadCapacity * 2;
    } 

    @Override 
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public String toString() {
        return "Truck: " + getModel() + "(ID: " + getVehicleID() + ") ";
    }

}