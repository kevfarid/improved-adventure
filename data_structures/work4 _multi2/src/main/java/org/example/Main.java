package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite el segundo numero: ");
        int num2 = scanner.nextInt();

        int range = Math.abs(num1 - num2) + 1;
        int[][] results = new int[range][10];

        int count = num1;

        for(int col = 0; col < range; col++) {
            for(int row = 0; row < results[0].length; row++){
                results[col][row] = count * (row + 1);
                System.out.print(results[col][row] + "\t");
            }

            count = num1 < num2 ? count + 1 : count - 1;
            System.out.print("\n");
        }

    }
}