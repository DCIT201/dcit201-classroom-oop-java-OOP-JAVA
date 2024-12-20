package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        Vehicle toyota1 = new Car(1, "toyota", true, 15, true);
        System.out.println(toyota1.calculateRentalCost(2));

        Car car = new Car(1, "Toyota", true, 100, true);
        Motorcycle motorcycle = new Motorcycle(2, "Yamaha", true, 50);
        Truck truck = new Truck(3, "Ford", true, 150, 5000);

        System.out.println(car.calculateRentalCost(2));
        System.out.println(truck.calculateRentalCost(2));
        System.out.println(motorcycle.calculateRentalCost(3));



    }
}
