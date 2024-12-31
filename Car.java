public class Car extends Vehicle {
    private boolean hasGPS; //indicates the car has gps
    private boolean hasAirConditioning;//indicates car has air conditioning


    //constuctor to initialize the details
    public Car(String vehicleID, String model, double baseRentalRate, boolean hasGPS) {
        super (vehicleID, model, baseRentalRate);
        this.hasGPS = hasGPS;
        this.hasAirConditioning
    }

    //getters and setters
    public boolean hasGPS() {
        return hasGPS;
    }

    public void setHasGPS (boolean hasGPS) {
        this.hasGPS = hasGPS;
    }

    public void hasAirConditioning() {
        return hasAirConditioning;
    }

    public void setHasAirConditioning (boolean hasAirConditioning) {
        this.hasAirConditioning;
    }

    //method to rent a car
   @Override
    public void rent(Customer customer, int days) {
        if (isAvailableForRental()) {
            setAvailable(false);
            System.out.println(car.getName + "has been rented to " + customer.getName() + " for " + days + " days.");
        } else {
            System.out.println("The car you are asking for is not available for rental.");
        }
    }

    //to check if a car has been returned
    @Override
    public void returnVehicle() {
        setAvailable(true);
        System.out.println(car.getName + "has been returned.");
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days + (hasGPS ? 10 : 0) * days; //charge for GPS 
    }

    //to check if car is available for rent
    @Override
    public boolean isAvailableForRental() {
        return false;
    }
}



