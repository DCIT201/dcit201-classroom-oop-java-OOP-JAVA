package VehicleRental;

public interface RentalService {
    RentalTransaction rentVehicle(Customer customer, String vehicleId, int days) throws Exception;
    void returnVehicle(String vehicleId) throws Exception;

    void rent(Customer customer, int days);

    void returnVehicle();
}
