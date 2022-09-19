package org.example;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int SIZE = 10;

        Scanner scanner = new Scanner(System.in);

        Integer[] numbers = new Integer[SIZE];
        String[] words = new String[SIZE];

        for(int i=0; i < SIZE; i++) {
            System.out.printf("Escriba el numero %d: ", i + 1);
            numbers[i] = scanner.nextInt();

            System.out.printf("Escriba la palabra: %d: ", i + 1);
            words[i] = scanner.next();
        }

        Arrays.sort(numbers);
        Arrays.sort(words);

        System.out.println("--------------------------");
        System.out.println("Numeros Ordenados de menor a mayor:\n" + Arrays.toString(numbers));
        System.out.println("\nLetras Ordenadas de la A a la Z:\n" + Arrays.toString(words));
        System.out.println("-------------------------- \n");

        Arrays.sort(numbers, Collections.reverseOrder());
        Arrays.sort(words, Collections.reverseOrder());

        System.out.println("Numeros Ordenados de mayor a menor:\n" + Arrays.toString(numbers));
        System.out.println("\nLetras Ordenadas de la Z a la A:\n" + Arrays.toString(words));
        System.out.println("--------------------------");
    }
}