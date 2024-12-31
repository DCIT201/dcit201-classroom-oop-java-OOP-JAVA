public class Motorcycle extends Vehicle {
    private boolean needsHelmet;
    private boolean hasInsurance;

    public Motorcycle(String vehicleID, String model, double baseRentalRate, boolean needsHelment) {
        super(vehicleID, model, baseRentalRate);
        this.needsHelmet = needsHelment.
    }

    public boolean needsHelment() {
        return needsHelment.
    }

    public void setneedsHelment (boolean needsHelment) {
        this.needsHelment = needsHelment;
    }
    

    @Override 
    publi double calculateRentalCost(int days) {
        return getBaseRentalRate() * days;
    }

     @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public String toString() {
        return "Motorcycle: " + getModel() + " (ID: " + getVehicleID() + ")";
    }
}