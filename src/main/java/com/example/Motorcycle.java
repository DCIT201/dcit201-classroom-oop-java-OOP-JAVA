package com.example;

public class Motorcycle extends Vehicle implements Rentable{
    public Motorcycle(int vehicleId, String model, boolean isAvailable, int baseRentalRate) {
        super(vehicleId, model, isAvailable, baseRentalRate);
    }

    @Override
    public int calculateRentalCost(int days) {
        return this.getBaseRentalRate() * days;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
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

