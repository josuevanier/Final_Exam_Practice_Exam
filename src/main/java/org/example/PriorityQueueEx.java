package org.example;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<Integer> integers = new PriorityQueue<>();

        integers.add(182);
        integers.add(2);
        integers.add(3);
        integers.add(9);
        integers.add(15);
        integers.add(30);

        PriorityQueue<Integer> integersDivide3and5 = new PriorityQueue<>();

        for(Integer integer : integers){
            if(integer % 3 == 0 && integer % 5 == 0){
                integersDivide3and5.add(integer);
            }
        }

            System.out.println(integersDivide3and5);

        while(!integersDivide3and5.isEmpty()){
            System.out.println(integersDivide3and5.poll()); // retuns the element with priority by natural ordering if no comparator is given
        }

    }
}
