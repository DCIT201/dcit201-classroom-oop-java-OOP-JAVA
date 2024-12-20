package com.example;

public class Car extends Vehicle implements Rentable {
    private boolean hasGPS;

    public Car(int vehicleId, String model, boolean isAvailable, int baseRentalRate, boolean hasGPS) {
        super(vehicleId, model, isAvailable, baseRentalRate);
        this.hasGPS = hasGPS;
    }

    @Override
    public int calculateRentalCost(int days) {
        int baseRate = 10;
        if(this.isHasGPS()){
              return (this.getBaseRentalRate() + baseRate) * days;
        }
        else{
            return this.getBaseRentalRate() * days;
        }
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    public boolean isHasGPS() {
        return hasGPS;
    }

    public void setHasGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
    }

//    overriding the interface methods
    @Override
    public void rent(Customer customer, int days){
        int cost = calculateRentalCost(days);
        if (isAvailableForRental()){
            setAvailable(false);
            System.out.println("Vehicle rented to " + customer.getName() + " for " + days + " days." + " at a total cost of " + cost);
        }else{
            System.out.println("Vehicle not available for rental.");
        }
    }
    @Override
    public void returnVehicle(){
        setAvailable(true);
    }
}


