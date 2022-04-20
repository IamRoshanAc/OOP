package GUI;

import javax.swing.*;

public class area {
    public static void main(String[] args) {
        double length = Double.parseDouble(JOptionPane.showInputDialog("Enter length of a Rectangle"));
        double breadth = Double.parseDouble(JOptionPane.showInputDialog("Enter Breadth of a Rectangle"));
        double area = length * breadth;
        int int_area = (int)area;
        JOptionPane.showMessageDialog(null,"Area: "+int_area);
    }
}
