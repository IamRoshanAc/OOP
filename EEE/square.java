package EEE;

import javax.swing.*;

public class square {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter any Number"));
        int sqr = num*num;
        JOptionPane.showMessageDialog(null,"Square: "+sqr);
    }
}
