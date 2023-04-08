package com.pragra.mapPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> credentials = new HashMap<>();

        credentials.put(1234, "aaaaaaa");
        credentials.put(2345, "bbbbbbb");
        credentials.put(3456, "ccccccc");
        credentials.put(4567, "ddddddd");
        credentials.put(5678, "eeeeeee");

        System.out.println(credentials.get(4567));
        System.out.println(credentials);

        // entrySet() and for each loop to iterate through Map
        Set<Map.Entry<Integer, String>> entries = credentials.entrySet();
        for (Map.Entry<Integer, String> entry: entries) {
//            System.out.println(entry);
            System.out.print(entry.getKey() + ": " + entry.getValue() + " ");
        }
        System.out.println();

        // json
        String jsonMap = credentials.toString().replace("=", ": ");
        System.out.println(jsonMap);

        credentials.replace(1234, "AAAAAAA");
        System.out.println(credentials);
    }
}
