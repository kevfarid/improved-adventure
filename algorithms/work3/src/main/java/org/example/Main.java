package org.example;

import javax.swing.*;

public class Main {

    static int value1 = 0;
    static int value2 = 0;
    static boolean value1IsCorrect = false;

    public static void main(String[] args) {
        double vec[] = new double[6];

        String resultado = "";

        getData();

        vec[0] = value1 + value2;
        vec[1] = value1 - value2;
        vec[2] = value1 * value2;
        vec[3] = (double) value1 / value2;
        vec[4] = Math.pow(value1, value2);
        vec[5] = Math.pow(value1, (double) 1 / value2);

        for (int i = 0; i < vec.length; i++) {
            resultado += "\n" + vec[i];
        }

        JOptionPane.showMessageDialog(null, resultado);
    }

    public static void getData() {

        try {
            if(!value1IsCorrect) {
                value1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor 1 "));
            }
            value1IsCorrect = true;
            value2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor 2 "));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            getData();
        }
    }

}