package org.example;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapQuestions {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1,"one");
        treeMap.put(2,"two");
        treeMap.put(3,"tree");
        treeMap.put(4,"four");

        int leastKey = treeMap.firstKey();

        int greatestKey = treeMap.lastKey();

        System.out.println("Greateast key is "  + greatestKey + " " + "least key is " + leastKey);
    }

}
