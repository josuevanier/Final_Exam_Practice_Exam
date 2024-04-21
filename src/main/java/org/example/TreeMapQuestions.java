package org.example;

import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapQuestions {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1,"one");
        treeMap.put(2,"two");
        treeMap.put(3,"tree");
        treeMap.put(4,"four");
        treeMap.put(5,"four");

        int givenKey = 3;

        SortedMap<Integer, String> keylessthanGivenKey = treeMap.headMap(3); // head map is excluded

        System.out.println(keylessthanGivenKey);

        SortedMap<Integer, String > keyvalueGreaterThanGivenKey = treeMap.tailMap(3 + 1); //tailmap is included

        System.out.println(keyvalueGreaterThanGivenKey);
//
    }

}
