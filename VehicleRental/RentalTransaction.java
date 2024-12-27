package VehicleRental;

public class RentalTransaction {
    private final double totalCost;

    public RentalTransaction(Vehicle vehicle, int rentalDays) {
        //
        this.totalCost = vehicle.calculateRentalCost(rentalDays);
    }

    public static void add() {
    }

    public double getTotalCost() {
        return totalCost;
    }
}
