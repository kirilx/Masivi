package org.example;

import java.util.HashMap;

public class Duplicates {
    public static void main(String[] args) {
        String[] words = {"apple", "bananas", "apple", "bananas", "bananas"};
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (wordCount.containsKey(word)) {
                int count = wordCount.get(word);
                wordCount.put(word, count + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        // Displaying the word counts
        for (String word : wordCount.keySet()) {
            int count = wordCount.get(word);
            System.out.println(word + ": " + count);
        }
    }
}
