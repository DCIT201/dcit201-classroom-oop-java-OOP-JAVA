package VehicleRental;

public class Main {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();

        agency.addVehicle(new Car("car1", "Toyota Camry", 60.0, true));
        agency.addVehicle(new Motorbike("m1", "Honda CBR", 30.0, true));
        agency.addVehicle(new Truck("t1", "Ford F-150", 80.0, true, 1000));

        agency.rentVehicle("car1", 3);

        Vehicle rentedCar = agency.getVehicle();
        if(rentedCar != null) {
            System.out.println("Rented car details: " + rentedCar);
        }
    }
}
