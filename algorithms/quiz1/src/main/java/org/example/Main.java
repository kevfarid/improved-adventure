package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Inserte el valor de la compra");
        int valueShopping = Integer.parseInt(input);
        int discount = getDiscount(valueShopping);
        int total = valueShopping - ((valueShopping * discount) / 100);
        JOptionPane.showMessageDialog(null, "Total: " + total);
    }

    private static int getDiscount(int value) {
        if(value > 150000) {
            return 25;
        }

        if(value > 70000) {
            return 18;
        }
        
        if(value > 10000) {
            return 11;
        }

        if(value > 5000) {
            return 5;
        }

        return 0;
    }
}