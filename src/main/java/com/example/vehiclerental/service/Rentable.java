package com.example.vehiclerental.service;


import com.example.vehiclerental.model.Customer;

public interface Rentable {
    void rent(Customer customer, int days);
    void returnVehicle();
}
