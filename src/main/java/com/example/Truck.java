package com.example;

public class Truck extends Vehicle implements Rentable {
    private int cargoCapacity;
    public Truck(int vehicleId, String model, boolean isAvailable, int baseRentalRate, int cargoCapacity) {
        super(vehicleId, model, isAvailable, baseRentalRate);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public int calculateRentalCost(int days) {
        if(this.getCargoCapacity() > 0){
            return (this.getBaseRentalRate() + this.getCargoCapacity()) * days;
        }
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
