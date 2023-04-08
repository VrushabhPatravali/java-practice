package com.pragra.ListPractice;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();

        colors.add("red");
        colors.add("yellow");
        colors.add("green");
        colors.add("blue");
        colors.add("green");
        colors.add("black");

        colors.remove(1);
        colors.remove("blue");
        System.out.println(colors);

        Iterator<String> iterator = colors.iterator();
        int[] i = new int[colors.size()];
        int x = 0;
        while(iterator.hasNext()) {
            String next = iterator.next();
            if(next.equals("green")) {
                iterator.remove();
                i[x] = 1;
            }
            x++;
        }
        for (int j = 0; j < colors.size(); j++) {
            if(i[j] == 1) {
                colors.add(j, "white");
            }
        }
        System.out.println(colors);

        List<String> colors1 = Arrays.asList("grey", "purple", "orange", "brown");
        System.out.println(colors1);
        System.out.println(colors);

        colors.addAll(3, colors1);
//        colors.add(3, colors1.toString());
        System.out.println(colors);

        iterator = colors.iterator(); // have to return array containing all elements in colors again
        while(iterator.hasNext()) {
            String next = iterator.next();
            if(next.length() == 5) {
                iterator.remove();
            }
        }
        System.out.println(colors);

        List<String> colors2 = List.of("red", "blue", "green", "orange"); // is available since java 9
        String[] colorsArray = {"red", "blue", "green", "orange"};

        HashSet<String> colorHashSet = new HashSet<>();
        TreeSet<String> colorTreeSet = new TreeSet<>();

        System.out.println(colorHashSet); // unordered
        System.out.println(colorTreeSet); // asc

        colorHashSet.addAll(colors);
        colorTreeSet.addAll(colors);

        System.out.println(colorHashSet);
        System.out.println(colorTreeSet);
        TreeSet<String> colorTreeSetDesc = (TreeSet<String>) colorTreeSet.descendingSet();
        System.out.println(colorTreeSetDesc); // desc

    }

}
