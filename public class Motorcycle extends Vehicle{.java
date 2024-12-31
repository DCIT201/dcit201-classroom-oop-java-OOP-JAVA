public class Motorcycle extends Vehicle{
    public Motorcycle (string vehicleId,string model,double baseRentalRate){
        super(vehicleId, model, baseRentalRate);
    }
}

    public double calculateRentalcost(int days){
        return getBaseRentalRate * days;
    }
         public boolean isAvailableForRenatl(){
            return isAvailable();
}
