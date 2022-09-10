package dev.kevfarid;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        String output = "";

        boolean swap = false;
        for (int i = 0; i < matrix.length; i++) {

            int remainder = swap ? 0 : 1;

            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = j % 2 == remainder ? 1 : 0;
                output += matrix[i][j] + " ";
            }

            swap = !swap;
            output += "\n";
        }

        JOptionPane.showMessageDialog(null, output);
    }

}