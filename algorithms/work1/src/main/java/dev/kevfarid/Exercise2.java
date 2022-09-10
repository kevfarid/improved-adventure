package dev.kevfarid;

import javax.swing.*;

public class Exercise2 {
    public static void main(String[] args) {
        int[] numbers = getNumbers();
        int[] results = getLessAndGreater(numbers);

        JOptionPane.showMessageDialog(null, "less: " + results[0] + "\ngreater: " + results[1]);
    }

    private static int[] getNumbers() {
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insert Number " + (i + 1)));
        }

        return numbers;
    }

    private static int[] getLessAndGreater(int[] numbers) {
        int less = numbers[0];
        int greater = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < less) {
                less = numbers[i];
            }
            if (numbers[i] > greater) {
                greater = numbers[i];
            }
        }

        return new int[]{less, greater};
    }


}