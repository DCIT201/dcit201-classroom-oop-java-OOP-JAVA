package VehicleRental;

public interface RentalService {
    void rent(Customer customer, int days);
    void returnVehicle();
}
