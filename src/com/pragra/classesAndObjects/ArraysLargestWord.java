package com.pragra.classesAndObjects;

public class ArraysLargestWord {
    public static void main(String[] args) {
        String s = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. A arcu cursus vitae congue mauris rhoncus. In metus vulputate eu scelerisque felis. Purus viverra accumsan in nisl. Dignissim diam quis enim lobortis scelerisque fermentum dui. Pellentesque elit ullamcorper dignissim cras tincidunt lobortis feugiat. Facilisis volutpat est velit egestas dui id. In nulla posuere sollicitudin aliquam ultrices sagittis orci a. Aenean sed adipiscing diam donec adipiscing tristique risus. Bibendum arcu vitae elementum curabitur vitae nunc sed. Eget mi proin sed libero enim sed. At erat pellentesque adipiscing commodo elit. Vitae sapien pellentesque habitant morbi tristique senectus et netus. At tempor commodo ullamcorper a lacus vestibulum. Massa tincidunt nunc pulvinar sapien et ligula. Posuere sollicitudin aliquam ultrices sagittis orci a.";
        String[] splitS = s.split(" ");
        int[] counter = new int[splitS.length];
        for (int i = 0; i < splitS.length; i++) {
            for (int j = 0; j < splitS[i].length(); j++) {
                String[] splitSWord = splitS[i].split("");
                if (splitSWord[j].equals(".") || splitSWord[j].equals(",")) {
                continue;
                } else {
                    counter[i]++;
                }
            }
        }
        int max = counter[0];
        for (int k = 0; k < counter.length; k++) {
            if (counter[k] > max) {
                max = counter[k];
            }
        }
        System.out.println("The largest word has " + max + " letters");
        int firstIndex = 0;
        for (int l = 0; l < counter.length; l++) {
            if (counter[l] == max){
                firstIndex = l;
                break;
            }
        }
        System.out.println("The first occurring largest word is " + splitS[firstIndex]);
    }
}
