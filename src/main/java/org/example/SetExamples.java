package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> integers = new TreeSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(78);

        System.out.println("Enter a number ");
        int givenNumber = sc.nextInt();
        HashSet<Integer> integers1s = new HashSet<>();
        for(Integer integer : integers){
            if(integer > givenNumber){
                integers1s.add(integer);
            }
        }
        if(!integers1s.isEmpty()){
            System.out.println("Given number " + integers1s);
        }else System.out.println("No numbers are greater than the giving number");
    }
}
