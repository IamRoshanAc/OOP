package EEE;

import javax.swing.*;

public class same_line {
    public static void main(String[] args) {
        String str1 = JOptionPane.showInputDialog("Enter 1st String");
        String str2 = JOptionPane.showInputDialog("Enter EEE.2nd String");
        String combined_str = str1+str2;
        JOptionPane.showMessageDialog(null,combined_str);
    }
}
