public class Customer {
    private String customerID;
    private String name;
    private int loyaltyPoints;


//constructor
    public Customer(String customerID, String name) {
        if (customerID == null || customerID.isEmpty()) {
            throw new IllegalArgumentException("Customer Id must not be or emty.");
        }
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name must not be empty");
        }

        this.customerID = customerID;
        this.name = name;
        this.loyaltyPoints = 0;
    }

    //construct overloaded to display initila loyalty points
    public Customer(String customerID; String name, String int initialLoyaltyPoints) {
        this.loyaltyPoints = initialLoyaltyPoints;
    }

    public String getCustomerID() {
        return customerID;
    }

    //getter for the name 
    public String getName() {
        return name;
    }

    public void addLoyaltyPoints(int points) {
        loyaltyPoints += points;
    }

    //method to add loyalty points
    public void addLoyaltyPoints(int points) {
        if (points < 0) {
            throw new IllegalArgumentException("Yuor points can not be negative.");
        }
        loyaltyPoints += points;
    }

     @Override
    public String toString() {
        return "Customer ID: " + customerID + ", Name: " + name + ", Loyalty Points: " + loyaltyPoints;
    }
}