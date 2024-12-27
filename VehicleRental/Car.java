package VehicleRental;

public class Car extends Vehicle{
      private boolean type;

    public Car ( String vehicleId, String model, double baseRentalRate,boolean type){
          super(vehicleId, model, baseRentalRate);
          this.type = type;
    }


    @Override
    public double baseRentalRate(int days) {
        return 0;
    }

    @Override
    public double calculateRentalCost(int days) {
        double cost = super.getBaseRentalRate() * days;
        if (type) {
            cost += days * 10; // Example additional cost for GPS
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

}
