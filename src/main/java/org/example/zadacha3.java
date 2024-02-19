package org.example;

import java.util.Scanner;

public class zadacha3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете броя на елементите в масива");
        int size = scanner.nextInt();
        int [] array = new int[size];

        System.out.println("Въведете елементите на масива");
        for (int i = 0; i < size; i++) {
            System.out.println("Елемент " + (i+i) + ":");
            array[i]  = scanner.nextInt();
        }
        int evenSum = 0;
        int oddSum = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evenSum +=num;
            }else {
                oddSum +=num;

            }
        }
        System.out.println("Сумата на четните чесла в масива е " + evenSum);
        System.out.println("Сумата на нечетните чесла в масива е " + oddSum);
        }
    }
