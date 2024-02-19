package org.example;

import java.util.HashSet;

public class UnicNumbers {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 5, 6, 8, 9};
        HashSet<Integer> uniqueNumber = new HashSet<>();
        for (int number : numbers) {
            uniqueNumber.add(number);
        }
        for (int un : uniqueNumber) {
            System.out.println(un);
        }
    }
}
