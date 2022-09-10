package dev.kevfarid;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int vec[] = new int[10];

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {

        printMenu();

        int opc = sc.nextInt();
        switch (opc) {
            case 1 -> capturar();
            case 2 -> leer();
            case 3 -> consultar();
            case 4 -> encontrarValor();
            case 5 -> encontrarRango();
            default -> System.out.println("SALIDA DEL PROGRAMA");
        }
    }

    private static void printMenu() {
        System.out.println("=================");
        System.out.println("MENU PRINCIPAL");
        System.out.println("=================");
        System.out.println("1. Capturar");
        System.out.println("2. Leer");
        System.out.println("3. Consultar Posición");
        System.out.println("4. Buscar Valor");
        System.out.println("5. Mostrar el rango");
        System.out.println("6. Salir");
        System.out.println("Digite su opcion: ");
    }

    public static void capturar() {
        for (int i = 0; i < vec.length; i++) {
            System.out.println("digite el valor en la posición " + (i + 1));
            vec[i] = sc.nextInt();
        }
        menu();
    }

    public static void leer() {
        for (int i = 0; i < vec.length; i++) {
            System.out.print(vec[i] + "\t");
        }
        System.out.println("\n  \n  \n");
        menu();
    }

    public static void consultar() {
        System.out.println("Ingrese el numero de la posición");

        int pos = sc.nextInt();

        if (pos < vec.length) {
            System.out.println("El valor en la posicion: " + pos + " es: " + vec[pos]);
        } else {
            System.out.println("Valor invalido");
        }

        menu();
    }

    public static void encontrarValor() {
        System.out.println("Ingrese el valor de la posición");

        int valor = sc.nextInt();
        boolean valorExist = false;

        for (int i = 0; i < vec.length; i++) {
            if (vec[i] == valor) {
                valorExist = true;
                System.out.println(vec[valor - 1]);
            }
        }

        if (valorExist) {
            System.out.println("Este valor se encuentra dentor del arreglo " + valor + " es: " + vec[valor]);
        } else {
            System.out.println("Este valor no se encuentra en el arreglo");
        }

    }

    public static void encontrarRango() {
        System.out.println("Ingrese el rango que quiere buscar");

        System.out.println("Ingrese el valor de desde donde quiere inciar");
        int initalPosition = sc.nextInt() - 1;

        System.out.println("Ingrese el valor donde quiere terminar");
        int finishPosition = sc.nextInt();

        System.out.print("El rango es: ");
        for(int index = initalPosition; index < finishPosition; index++) {
            System.out.printf("%d \t", vec[index]);
        }

    }
}