package dev.kevfarid;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int SIZE_ARRAY = 10;

        int[] numbers = new int[SIZE_ARRAY];
        int[] numbers2 = new int[SIZE_ARRAY];

        int[] sumResults = new int[SIZE_ARRAY];
        int[] subtractionResults = new int[SIZE_ARRAY];
        int[] multiResults = new int[SIZE_ARRAY];
        double[] divisionResults = new double[SIZE_ARRAY];

        for(int index = 0; index < SIZE_ARRAY; index++) {
            System.out.printf("Digite el numero de la posicion %d: ", index + 1);
            numbers[index] = scanner.nextInt();

            System.out.printf("Digite el numero con cual va hacer las operaciones en la posicion %d: ", index + 1);
            numbers2[index] = scanner.nextInt();

            sumResults[index] = sum(numbers[index], numbers2[index]);
            subtractionResults[index] = subtraction(numbers[index], numbers2[index]);
            multiResults[index] = multiplication(numbers[index], numbers2[index]);
            divisionResults[index] = division(numbers[index], numbers2[index]);

            System.out.printf("El resultado de la suma es: %s \n", sumResults[index]);
            System.out.printf("El resultado de la resta es: %s \n", subtractionResults[index]);
            System.out.printf("EL resultado de la multiplicacion es: %s \n", multiResults[index]);
            System.out.printf("El resultado de la division es: %s \n", divisionResults[index]);
        }

    }

    private static int sum(int number1, int number2) {
        return number1 + number2;
    }

    private static int subtraction(int number1, int number2) {
        return number1 - number2;
    }

    private static int multiplication(int number1, int number2) {
        return number1 * number2;
    }

    private static double division(double number1, double number2) {
        return number1 / number2;
    }
}