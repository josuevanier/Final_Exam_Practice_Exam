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

        hashEquals(integer1s, integer2s);


    }
    public static  void hashEquals (Set<Integer> integers, Set<Integer> integer2s){
        if(integers.equals(integer2s)) System.out.println("Hash set are equals");
        else {
            HashSet<Integer> notCommonElements = new HashSet<>();
            notCommonElements.addAll(integers);
            for(Integer integer : integer2s){

                if(notCommonElements.contains(integer)){
                    notCommonElements.remove(integer);
                }else{
                    notCommonElements.add(integer);
                }
            }
            System.out.println("Elements" + notCommonElements);
        }
    }
}
