package com.pragra.mapPractice;

public class CarAddress {
    public String address;

    public CarAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "CarAddress{" +
                "address='" + address + '\'' +
                '}';
    }
}
