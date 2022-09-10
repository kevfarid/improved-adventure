package dev.kevfarid;

import java.util.Scanner;

public class Main {

    private static String[] students = null;
    private static int[][] data = null;
    private static int numStudents = 0;
    private static final Scanner scanner = new Scanner(System.in);
    private static final String[] titles = {"Codigo", "Semestre", "valor", "Abono", "Saldo"};

    public static void main(String[] args) {
        System.out.println("Hello world!");
        getNumStudents();

        students = new String[numStudents];
        data = new int[numStudents][5];

        menu();
    }

    private static void getNumStudents() {

        System.out.print("Inserte el numero de estudiantes: ");

        try {
            numStudents = scanner.nextInt();

            if(numStudents < 1) {
                throw new Exception();
            }

        } catch (Exception e) {
            System.out.println("Numero invalido");
            getNumStudents();
        }
    }

    private static void getStudentsData() {
        for(int col = 0; col < data.length; col++) {
            System.out.print("Inserte el nombre del estudiante: ");
            students[col] = scanner.next();

            for(int row = 0; row < data[0].length; row++) {
                int value;

                if (row == 0 ) {
                    value = col + 1;
                }else if(row < data[0].length - 1) {
                    System.out.printf("Inserte el %s del estudiante: ", titles[row]);
                    value = scanner.nextInt();
                } else {
                    value = data[col][2] - data[col][3];
                }

                data[col][row] = value;
            }
        }
    }

    private static void searchStudents(int idStudents) {
        try {
            System.out.printf("Nombre: %s\n", students[idStudents]);
            for(int i=0; i < data[0].length; i++){
                System.out.printf("%s: %s\n", titles[i], data[idStudents][i]);
            }
        } catch (Exception e) {
            System.out.println("Estudiante No Encontrado");
        }
    }

    private static void menu() {
        printSeparate();
        System.out.println("Menu");
        System.out.println("1. Capturar");
        System.out.println("2. Buscar");
        System.out.println("3. Salir");
        printSeparate();

        int option = scanner.nextInt();

        switch (option) {
            case 1 -> {
                getStudentsData();
                menu();
            }
            case 2 -> {
                System.out.print("Inserte el codigo del estudiante: ");
                searchStudents(scanner.nextInt() - 1);
                menu();
            }
        }
    }

    private static void printSeparate() {
        System.out.println("===================================");
    }

}