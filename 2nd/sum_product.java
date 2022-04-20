package GUI;

import javax.swing.*;

public class sum_product {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter First Number"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number"));
        int sum = num1 +num2;
        int product = num1*num2;
        JOptionPane.showMessageDialog(null,"Sum : "+sum + "\n Product : "+product);

    }
}
