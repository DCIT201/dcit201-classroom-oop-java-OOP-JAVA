package VehicleRental;

public class Main {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency() {
            @Override
            public RentalTransaction rentVehicle(Customer customer, String vehicleId, int days) {
                return null;
            }
        };

        agency.addVehicle(new Car("car1", "Toyota Camry", 60.0, true));
        agency.addVehicle(new Motorbike("m1", "Honda CBR", 30.0, true));
        agency.addVehicle(new Truck("t1", "Ford F-150", 80.0, true, 1000));

        Customer customer1 = new Customer("c1", "John Doe");
        Customer customer2 = new Customer("c2", "Jane Smith");

        try {
            agency.rentVehicle("car1", customer1, 3); // Rent car for 3 days
            agency.rentVehicle("m1", customer2, 1);   // Rent motorbike for 1 day
        } catch (IllegalArgumentException e) {
            System.err.println("Error renting vehicle: " + e.getMessage());
            return; //Exit if renting fails
        }


        // Now return the vehicles
        try {
            agency.returnVehicle("car1");
            agency.returnVehicle("m1");
        } catch (IllegalArgumentException e) {
            System.err.println("Error returning vehicle: " + e.getMessage());
        }

        // Add more actions as needed (e.g. print a report, etc.)

        System.out.println(agency.generateReport());



    }}

