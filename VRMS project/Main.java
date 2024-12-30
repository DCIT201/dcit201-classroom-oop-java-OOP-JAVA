public class Main {
    public static void main(String[] args) {
        // Create customer and vehicle objects
        Customer customer = new Customer("C001", "John Doe", 500);  // Customer balance is 500
        Car car = new Car("V001", "Toyota Corolla", 30, "Sedan", true);  // Luxury Sedan
        Motorcycle motorcycle = new Motorcycle("V002", "Yamaha R1", 20, true, true);  // Sport model with sidecar
        Truck truck = new Truck("V003", "Ford F-150", 50, 2000, true);  // Heavy-duty truck

        // Create rental agency and add vehicles to the fleet
        RentalAgency agency = new RentalAgency();
        agency.addVehicle(car);
        agency.addVehicle(motorcycle);
        agency.addVehicle(truck);

        // Rent vehicles to the customer
        agency.rentVehicle(car, customer, 5);  // Rent car for 5 days ($175)
        agency.rentVehicle(motorcycle, customer, 3);  // Rent motorcycle for 3 days ($85)
        agency.rentVehicle(truck, customer, 7);  // Attempt to rent truck for 7 days ($350)

        // Return vehicles
        agency.returnVehicle(car);
        agency.returnVehicle(motorcycle);
        agency.returnVehicle(truck);
    }
}
