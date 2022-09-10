package dev.kevfarid;
import javax.swing.JOptionPane;

public class Exercise3 {

    public static void main(String[] args) {
        int[] grades = getNumbers();
        double average = getAverage(grades);
        String level = getLevel(average);

        JOptionPane.showMessageDialog(null, "Total: " + average + "\nLevel:" + level);
    }

    private static double getAverage(int[] grades) {

        double total = 0;

        for (int i = 0; i < grades.length; i++){
            total += grades[i];
        }

        return total / grades.length;
    }

    private static int[] getNumbers() {
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insert Number " + (i + 1)));
        }

        return numbers;
    }

    private static String getLevel(double average) {
        if(average <= 8) return "Fail";
        if(average <= 9) return "B";

        return "A";
    }

}
