public class main {
  public static void main(String[] args) {
    Vehicle car1 = new car("V123", "Sedan", 50.0);
    Vehicle bike1 = new bike("V124", "Harley",30.0);
    Vehicle truck1 = new Truck("V125", "Ford", 100.0);

    RentalAgency agency = new RentalAgency();
    agency.addVehicle(car1);
    agency.addVehicle(bike1);
    agency.addVehicle(truck1);

    Customer customer1 = new customer("c001", "john doe");
     system.out.println("\nprocessing...");
     agency.processRental(customer1,car1,5);

       System.out.println("\nRented Vehicles by " + customer1.getname() + ":" );
       for (Vehicle v : customer1.getRentedVehicles()) {
        System.out.println(v.getmode1() + "for" + 5 + "days, Cost:$" + V.calculateRentalcost(5));
       }
 
    System.out.println("\nTrying to rent a vehicle thats unavailable...");
    agency.processorRental(customer1, car1, 3); 
  } 
}
