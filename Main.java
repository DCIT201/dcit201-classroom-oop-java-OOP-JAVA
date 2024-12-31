public class Mian {
    public static void main (String[] args) {
        RentalAgency agency = new RentalAgency();
   
    //adding vehicles to vehicle fleet
    Car car1 = new Car(vehicleID:"C100", model:"Toyota Yaris", baseRentalRate:100 hasGPS:true);
    Motorcycle motor1 = new Motorcycle(vehicle:"M100", model:"Honda R20", baseRentalRate:60, needsHelment:true);
     Truck truck1 = new Truck(vehicleID:"T100", model:"Chapman 150", baseRentalRate:500, loadCapacity:3000 );

    agency.addVehicle(car1);
    agency.addVehicle(bike1);
    agency.addVehicle(truck1);

    //customers
    Customer customer1 = new Customer(customerID:"Cs001", name:"Jonathan");
    Customer customer2 = new Customer(customerID:"Cs002", name:"Yeboah";)

    //rental process
    System.out.println("=== Quick Vehicle Rental Process ===");
    agency.rentVehicle(vehicleID:"C100", customer1, days:5);//rent a car for Jonathan
    agency.rentVehicle(vehicleID:"T100", customer2, days:7);//rent a truck for Yeboah
    agency.rentVehicle(vehicleID:"M200", customer2, days:3);//attempt to rent unavailable motorcycle

    //return vehicles
    System.out.println("=== Returning Vehicles ===");
    car1.returnVehicle();//returning a car rented by Jonathan
    agency.rentVehicle(vehicleID:"C100", customer2, days:2);//returned car rented by jonathan

     //rental transaction
     System.out.println("=== Transactions ===");
     RentalTransaction transaction1 = new RentalTransaction(transactionID:"Tr001", car1, customer1, daysRented:5);    
     RentalTransaction transaction2 = new RentalTransaction(transactionID:"Tr002", truck1, customer2, daysRented:7);    

    System.out.println(transaction1);
    System.out.println(transaction2);

 // Loyalty points for customers
        System.out.println("\n=== Loyalty Points ===");
        customer1.addLoyaltyPoints(10); // Add loyalty points for jonathan
        customer2.addLoyaltyPoints(5);  // Add loyalty points for Yeboah
        System.out.println(customer1.getName() + " has " + 10 + " loyalty points.");
        System.out.println(customer2.getName() + " has " + 5 + " loyalty points.");
    }

}
