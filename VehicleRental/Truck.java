package VehicleRental;

public class Truck extends Vehicle{
    private boolean weight;
    private int trunksize;

    public Truck(String vehicleId, String model, double baseRentalRate, boolean weight, int trunksize){
        super(vehicleId, model, baseRentalRate);
        this.weight = weight;
        this.trunksize = trunksize;
    }


    public int getTrunksize() {
        return trunksize;
    }

    public void setTrunksize(int trunksize) {
        this.trunksize = trunksize;
    }

    public boolean getWeight() {
        return weight;
    }

    public void setWeight(boolean weight) {
        this.weight = weight;
    }

    @Override
    public double baseRentalRate(int days) {
        return 0;
    }

    @Override
    public double calculateRentalCost(int days) {
        return 0;
    }

    @Override
    public void setAvailable(boolean b) {

    }

    @Override
    public boolean isAvailableForRental() {
        return false;
    }
}
