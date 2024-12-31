public abstract class Vehicle {
   private String VehicleID; 
   private String model; 
   private double baseRentalRate; 
   private boolean isAvailable;
  
   //Constructor for validation of vehiclees
    public Vehicle(String VehicleID, double baseRentalRate, String model) {
        this.VehicleID = VehicleID;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = true;
        this.model = model;
    }

//geters and setters
public String getVehicleID() {
    return VehicleID;
}

public void setVehicleID(String vehicleID) {
    VehicleID = vehicleID;
}

public String getModel() {
    return model;
}

public void setModel(String model) {
    this.model = model;
}

public double getBaseRentalRate() {
    return baseRentalRate;
}

public void setBaseRentalRate(double baseRentalRate) {
    this.baseRentalRate = baseRentalRate;
}

public boolean isAvailable() {
    return isAvailable;
}

public void setAvailable(boolean isAvailable) {
    this.isAvailable = isAvailable;
}   
 
//abstract methods for the rental calculation
public abstract double calculateRentalCost (int days);

public abstract boolean isAvailableForRental ();

//
@Override
public String toString() {
    return "VehicleID: " + vehicleID + ", Model: " + model + ", Rate: " + baseRentalRate;
}

}

