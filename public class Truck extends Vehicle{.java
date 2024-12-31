public class Truck extends Vehicle{
    public Truck (string vehicleId,string model,double baseRentalRate){
        super(vehicleId, model, baseRentalRate);
    }
}
        public double calculateRentalcost(int days){
            return getBaseRentalRate() * days + 50;
        }    
    public boolean isAvailableForRenatl(){
            return isAvailable();
}

   
