package EEE;

import javax.swing.*;

public class name_roll_details {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter Name");
        int roll = Integer.parseInt(JOptionPane.showInputDialog("Enter Roll"));
        String interest = JOptionPane.showInputDialog("Enter Interest");
        JOptionPane.showMessageDialog(null,"Hey, My Name is "+ name + "and My Roll No is "+roll+".My Field of Interest is "+interest );

    }
}
