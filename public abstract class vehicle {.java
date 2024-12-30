public abstract class vehicle {
    private string vehicleId;
    private string model;
    private double baseRentalRate;
    private boolean isAvailable;

   public vehicle(string vehicleId , string model, double baseRentalRate) {
    this.vehicleId = vehicle;
    this.model = model;
    this.baseRentalRate = baseRentalRate;
    this.isAvailable = true;
   }
     public string getvehicleId() {
        return vehicleId;
     }
     public void setvehicleId() {
        this.vehicleId = vehicle;
     }
     public string getmodel() {
        return model;
     }
     public void setmodel() {
        this.model = model;
     } 
      public double getbaseRentalRate() {
        return baseRentalRate;
      }
       public void setbaseRentalRate(double baseRentalRate) {
        this.baseRentalRate = baseRentalRate;
       }
       public abstract double calculateRentalcost(int days);
       public abstract boolean isAvailableForRenatl();
      }