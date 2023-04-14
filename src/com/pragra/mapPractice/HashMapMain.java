package com.pragra.mapPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapMain {
    public static void main(String[] args) {
        Map<Car, Integer> carMap = new HashMap<>();
        List<Integer> ratings = new ArrayList<>();
        ratings.add(5);
        ratings.add(3);
        ratings.add(4);
        ratings.add(5);
        Car car1 = new Car("honda", "civic", 2023, "honda.ca", ratings);
        Car car2 = new Car("toyota", "corolla", 2023, "toyota.ca", ratings);
        Car car3 = new Car("mazda", "mazda3", 2023, "mazda.ca", ratings);
        Car car4 = new Car("toyota", "corolla", 2023, "toyota.ca", ratings);

        carMap.put(car1, 30000);
        carMap.put(car2, 33000);
        carMap.put(car3, 29000);
        carMap.put(car4, 34000);

        System.out.println(car2.hashCode());
        System.out.println(car4.hashCode());
        System.out.println(carMap.get(car2)); // car4 overrides the value for car2 if objects of Car only have primitive attributes

        CarAddress carAddress1 = car1.getCarAddress();
        carAddress1.address = "new.ca"; // changing value of address in cloned object
        System.out.println(carMap.get(car1)); // we can get the value because we returned cloned objects
        System.out.println(car1.getCarAddress()); // unchanged

        List<Integer> list2 = car2.getRatings();
        list2.add(3);
        System.out.println(carMap.get(car2));
        System.out.println(car2.getRatings()); // unchanged
    }
}
