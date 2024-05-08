package org.example;

import java.util.*;

public class SmallTasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String of text with some duplicate: ");
        String text = sc.nextLine();

        String[] words = text.split("\\s+");

        Set<String> uniqueWords = new HashSet<>();

        Set<String> duplicateWords = new HashSet<>();

        for(String word : words){
            String part = word.trim();
            if(!uniqueWords.add(part)){
                duplicateWords.add(word);
                uniqueWords.remove(word);
            }
        }
        System.out.println(duplicateWords);
        System.out.println(uniqueWords);
    }
}
