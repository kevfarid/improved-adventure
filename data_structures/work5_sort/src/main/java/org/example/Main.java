package org.example;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Definir el tamaño de la array
        final int SIZE = 10;

        // Intanciar la clase Scanner
        Scanner scanner = new Scanner(System.in);

        // Crea los arrays con el tamaño que se definio antes.
        Integer[] numbers = new Integer[SIZE];
        String[] words = new String[SIZE];


        // Pide el numero y la palabra
        for(int i=0; i < SIZE; i++) {
            System.out.printf("Escriba el numero %d: ", i + 1);
            numbers[i] = scanner.nextInt();

            System.out.printf("Escriba la palabra: %d: ", i + 1);
            words[i] = scanner.next();
        }

        // Se usa la funcion sort para ordenar los numeros y la palabras
        Arrays.sort(numbers);
        Arrays.sort(words);

        // Se imprime el resultado
        System.out.println("--------------------------");
        System.out.println("Numeros Ordenados de menor a mayor:\n" + Arrays.toString(numbers));
        System.out.println("\nLetras Ordenadas de la A a la Z:\n" + Arrays.toString(words));
        System.out.println("-------------------------- \n");

        // Se usa la funcion sort y la clase Collections para ordenar a la inversa los numeros y palabras
        Arrays.sort(numbers, Collections.reverseOrder());
        Arrays.sort(words, Collections.reverseOrder());

        // Se imprime el resultado
        System.out.println("Numeros Ordenados de mayor a menor:\n" + Arrays.toString(numbers));
        System.out.println("\nLetras Ordenadas de la Z a la A:\n" + Arrays.toString(words));
        System.out.println("--------------------------");
    }
}