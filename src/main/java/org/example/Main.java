package org.example;

public class Main {
    public static void main(String[] args) {

         int [] array= new int [20];

         //Инициализация на елементи на масива
        for (int i = 0 ; i < array.length; i++){
            array[i] = i * 5 ;
        }
         // Изваждане на елементита на масива в конзолата
        for (int i = 0 ; i < array.length; i++){
            System.out.println("Елемент" + i + ": " +array[i]);
        }

    }
}