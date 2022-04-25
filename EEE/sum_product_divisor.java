package EEE;

import javax.swing.*;

public class sum_product_divisor {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter First Number"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number"));
        int sum,product,division;
        sum = a+b;
        product = a*b;
        division = product/sum;
        JOptionPane.showMessageDialog(null,"Sum: "+sum+"\n Product: "+product+"\n Divisor: "+division);

    }
}
