package com.pragra.inheritancePractice;

public class VehicleMain {
    public static void main(String[] args) {

        Car car = new Car();

        car.ride();
        System.out.println(car.b);
        System.out.println(car.a);

        Vehicle vehicle1 = new Vehicle();

        vehicle1.ride();
        System.out.println(vehicle1.b);
        System.out.println(vehicle1.a);

        Vehicle vehicle2 = new Car();

        vehicle2.ride();
        System.out.println(vehicle2.b);
        System.out.println(vehicle2.a);

    }
}
