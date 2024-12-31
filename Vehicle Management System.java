abstract class Vehicle {
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;

    public Vehicle(String vehicleId, String model, double baseRentalRate) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = true;
    }

    // Abstract methods
    public abstract double calculateRentalCost(int days);
    public abstract boolean isAvailableForRental();

    // Getters and setters with encapsulation
    public String getVehicleId() { return vehicleId; }
    public String getModel() { return model; }
    public double getBaseRentalRate() { return baseRentalRate; }
    public boolean isAvailable() { return isAvailable; }
    
    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }
}

// Interface demonstrating abstraction
interface Rentable {
    boolean rent(Customer customer, int days);
    boolean returnVehicle();
}

// Concrete class demonstrating inheritance and implementation
class Car extends Vehicle implements Rentable {
    private String type; // sedan, SUV, etc.

    public Car(String vehicleId, String model, double baseRentalRate, String type) {
        super(vehicleId, model, baseRentalRate);
        this.type = type;
    }

    @Override
    public double calculateRentalCost(int days) {
        double cost = getBaseRentalRate() * days;
        if (days > 7) {
            cost *= 0.9; // 10% discount for weekly rentals
        }
        return cost;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public boolean rent(Customer customer, int days) {
        if (isAvailableForRental()) {
            setAvailable(false);
            return true;
        }
        return false;
    }

    @Override
    public boolean returnVehicle() {
        setAvailable(true);
        return true;
    }
}

// Customer class demonstrating encapsulation
class Customer {
    private String id;
    private String name;
    private List<RentalTransaction> rentalHistory;

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
        this.rentalHistory = new ArrayList<>();
    }

    // Getters and setters
    public String getId() { return id; }
    public String getName() { return name; }
    
    public void addRentalTransaction(RentalTransaction transaction) {
        rentalHistory.add(transaction);
    }
}

// RentalTransaction class demonstrating composition
class RentalTransaction {
    private String transactionId;
    private Customer customer;
    private Vehicle vehicle;
    private LocalDate startDate;
    private int days;
    private double totalCost;

    public RentalTransaction(String transactionId, Customer customer, 
                           Vehicle vehicle, int days) {
        this.transactionId = transactionId;
        this.customer = customer;
        this.vehicle = vehicle;
        this.days = days;
        this.startDate = LocalDate.now();
        this.totalCost = vehicle.calculateRentalCost(days);
    }
}

// RentalAgency class demonstrating composition and system management
class RentalAgency {
    private List<Vehicle> fleet;
    private List<Customer> customers;
    private List<RentalTransaction> transactions;

    public RentalAgency() {
        this.fleet = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }

    public boolean rentVehicle(Customer customer, Vehicle vehicle, int days) {
        if (vehicle.rent(customer, days)) {
            RentalTransaction transaction = new RentalTransaction(
                UUID.randomUUID().toString(), customer, vehicle, days);
            transactions.add(transaction);
            customer.addRentalTransaction(transaction);
            return true;
        }
        return false;
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public void registerCustomer(Customer customer) {
        customers.add(customer);
    }
}