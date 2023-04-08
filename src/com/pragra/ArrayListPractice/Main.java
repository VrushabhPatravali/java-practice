package com.pragra.ArrayListPractice;
    /**
     * List Interface
     * ArrayList: ordered by insertion order
     *            internal data structure: Array performs copy operation
     * LinkedList: ordered by insertion order
     *            internal data structure: independent nodes/objects carrying address of next node
     * Set Interface
     * TreeSet: null not allowed, natural language sort, asc, desc
     *          internal data structure: red black binary tree
     * HashSet: 1 null allowed, unordered
     *          internal data structure: same as HashMap
     * Map Interface, SortedMap Interface
     * HashMap: internal data structure: key value pair
     * LinkedHashMap:
     * TreeMap:
     */

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {

        List<String> namesA = new ArrayList<>(5000);
        List<String> namesL = new LinkedList<>();

        namesA.add("sam");
        namesA.add("john");
        namesA.add("shubham");
        namesA.add("rohan");
        namesA.add("shubham");
        namesA.add("ron");

        System.out.println(namesA);

//        for(int i = 0; i < names.size(); i++) {
//            if(names.get(i).equals("shubham")) {
//                names.remove(i);
//            }
//        }

        // names list can be iterated and modified in the normal for loop but
        // not in the for each/enhanced for loop
//        for(String name : names){
//            if(name.equals("shubham")) {
//                names.remove("shubham");
//            }
//        }

        // removing duplicate string values using iterator
        Iterator<String> iterator = namesA.iterator();

        while(iterator.hasNext()) {
            String next = iterator.next();
            if(next.equals("shubham")) {
                iterator.remove();
            }
        }

        System.out.println(namesA);

    }
}
