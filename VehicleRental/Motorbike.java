package VehicleRental;

public class Motorbike extends Vehicle{
    private String helmetbrand;
    private boolean twowheelbike;

    public Motorbike (String vehicleId, String model, double baseRentalRate,boolean twowheelbike){
        super(vehicleId, model, baseRentalRate);
        this.twowheelbike =twowheelbike;

    }

    public String getHelmetbrand() {
        return helmetbrand;
    }

    public boolean isTwowheelbike() {
        return twowheelbike;
    }

    public void setTwowheelbike(boolean twowheelbike) {
        this.twowheelbike = twowheelbike;
    }

    @Override
    public double baseRentalRate(int days) {
        return 0;
    }

    @Override
    public double calculateRentalCost(int days) {
        double cost = super.getBaseRentalRate() * days;
        if (twowheelbike) {
            cost += days * 10;
        }
        return cost;
    }

    @Override
    public void setAvailable(boolean b) {

    }

    @Override
    public boolean isAvailableForRental() {
        return false;
    }

    public void setHelmetbrand(String helmetbrand) {
        this.helmetbrand = helmetbrand;
    }
}
