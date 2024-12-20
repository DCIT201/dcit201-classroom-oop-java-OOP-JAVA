package com.example;

import java.util.Date;

public class RentalTransaction {
    private int transactionId;
    private Vehicle vehicle;
    private Customer customer;
    private Date rentalDate;
    private Date returnDate;
    private double rentalCost;

    public RentalTransaction(int transactionId, Vehicle vehicle, Customer customer, Date rentalDate, Date returnDate, double rentalCost) {
        this.transactionId = transactionId;
        this.vehicle = vehicle;
        this.customer = customer;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.rentalCost = rentalCost;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }
// Additional methods for handling rental transactions
}
