package org.example;

import java.util.HashSet;
import java.util.Set;

public class SetExamples {
    public static void main(String[] args) {
        Set<Integer> integer1s = new HashSet<>();
         integer1s.add(1);
         integer1s.add(2);
         integer1s.add(3);

        Set<Integer> integer2s = new HashSet<>();
        integer2s.add(1);
        integer2s.add(3);
        integer2s.add(5);
        integer2s.add(6);

        if(integer1s.equals(integer2s)){
            System.out.println("If the hashset are equals ");
        }else {
            Set<Integer> elemnt1sNotCommon = new HashSet<>(integer1s);
            elemnt1sNotCommon.addAll(integer2s); // adding the integers 2 inside with integers1

            Set<Integer> commonElements = new HashSet<>(integer1s);

            commonElements.retainAll(integer2s);

            elemnt1sNotCommon.removeAll(commonElements);

            System.out.println("elment " + elemnt1sNotCommon);

        }
    }
}
