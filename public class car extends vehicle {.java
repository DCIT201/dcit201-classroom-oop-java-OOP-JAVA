public class car extends vehicle {
    public car(string vehicleId,string model,double baseRentalRate){
      super(vehicleId, model, baseRentalRate);
 }
    

  public double calculateRentalcost(int days){
    double calculateRentalcost = getBaseRentalRate() * days;
    if(days > 5) {
        calculateRentalcost *= 0.9;
    }
      return calculateRentalcost;
  }
  public boolean isAvailableForRenatl(){
    return isAvailable();
  } }