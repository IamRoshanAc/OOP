package EEE;

import javax.swing.*;

public class check_condition {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a Number"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Another Number"));
        String result ;
        result= ((num1<50)&&(num1<num2))?"Both Condition i.e. a<50 and a<b is True":"Both Condition i.e. a<50 and a<b is False";
        JOptionPane.showMessageDialog(null,result);
    }
}
