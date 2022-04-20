package GUI;

import javax.swing.*;

public class check_equal {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter First Number"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Enter Third Number"));
        String check = ((num1==num2)&&(num2==num3))?"All the Numbers are equal":((num1==num2)||(num2==num3)||(num1==num3))?"Two Numbers are Equal":"None Numbers are Equal";
        JOptionPane.showMessageDialog(null,check);

    }
}
