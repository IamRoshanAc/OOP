package GUI;

import javax.swing.*;

public class sum_of_four {
    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter 1st Number"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter 2nd Number"));
        double num3 = Double.parseDouble(JOptionPane.showInputDialog("Enter 3rd Number"));
        double num4 = Double.parseDouble(JOptionPane.showInputDialog("Enter 4th Number"));
        double total = num1+num2+num3+num4;
        double percentage = total/4;
        int total1 = (int)total;
        JOptionPane.showMessageDialog(null,"Total : "+total1);
    }
}
