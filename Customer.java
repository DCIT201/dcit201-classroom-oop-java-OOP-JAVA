
// Supporting Class: Customer
import java.util.ArrayList;
import java.util.List;

public class Customer implements LoyaltyScheme {
    private String name;
    private String customerId;
    private List<RentalTransaction> rentalHistory;
    

    public Customer(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
        this.rentalHistory = new ArrayList<>();
    }
    public int addRentalHistory(RentalTransaction transaction) {
        rentalHistory.add(transaction);
        return rentalHistory.size();
    }

    public String getName() {
        return name;
    }
    public String getCustomerId() {
        return customerId;
    }
    public List<RentalTransaction> getRentalHistory() {
        return rentalHistory;
    }
    public void setRentalHistory(List<RentalTransaction> rentalHistory) {
        this.rentalHistory = rentalHistory;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void addPoints(String customerId, int points) {
        this.points = points;
        for (RentalTransaction entryPoint : rentalHistory) {
            points = entryPoint.length*20;
            System.out.println("Points added");
        }
    }



    @Override
    public void redeemPoints(String customerId, int points) {
        points =-points;
    }

    @Override
    public int getPoints(String customerId) {
        return 0;
    }

    @Override
    public void addPoints(int points) {
        this.customerId = customerId;

        for (int entryPoint = 0; entryPoint< rentalHistory.size(); entryPoint++) {
            points = entryPoint + points;
        }
    }

    public void addRental(RentalTransaction transaction) {
        rentalHistory.add(transaction);
    }

}