package com.pragra.mapPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * making a class immutable:
 * make class final
 * make attributes private and final
 * make a parameterized constructor
 * make getters and not setters
 * never return original memory address of objects from getters, make cloned objects
 */
public final class Car {
    private final String make;
    private final String model;
    private final int year;
    private CarAddress carAddress;
    private List<Integer> ratings;

    public Car(String make, String model, int year, String carAddress, List<Integer> ratings) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.carAddress = new CarAddress(carAddress);
        this.ratings = new ArrayList<>(ratings);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public CarAddress getCarAddress() {
        CarAddress clonedCarAddress = new CarAddress(carAddress.address);
        return clonedCarAddress;
    }

    public List<Integer> getRatings() {
        List<Integer> clonedRatings = new ArrayList<>(ratings);
        return clonedRatings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(make, car.make) && Objects.equals(model, car.model) && Objects.equals(carAddress, car.carAddress) && Objects.equals(ratings, car.ratings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, year, carAddress, ratings);
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", carAddress=" + carAddress +
                ", ratings=" + ratings +
                '}';
    }
}
