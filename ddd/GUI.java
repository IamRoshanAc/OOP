package ddd;

import javax.swing.*;

public class GUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null,name);
        String roll = JOptionPane.showInputDialog("Enter roll no");
        JOptionPane.showMessageDialog(null,roll);
        String address = JOptionPane.showInputDialog("Enter your address");
        JOptionPane.showMessageDialog(null, "\name: " +name+"\naddress: "+address+"\nrollno:"+roll);
        System.exit(0);
    }
}
class ChangeString {
    public static void main(String[] args) {
            double mark1 = Double.parseDouble(JOptionPane.showInputDialog("Enter Mark of 1st Subject"));
            double mark2 = Double.parseDouble(JOptionPane.showInputDialog("Enter Mark of EEE.2nd Subject"));
            double mark3 = Double.parseDouble(JOptionPane.showInputDialog("Enter Mark of 3rd Subject"));
            double mark4 = Double.parseDouble(JOptionPane.showInputDialog("Enter Mark of 4th Subject"));
            double total_mark = mark1+mark2+mark3+mark4;
            double percentage = total_mark/4;
            int total = (int)total_mark;
            int per = (int)percentage;
            JOptionPane.showMessageDialog(null,"Total mark: "+total+" \n Percentage:"+per + "%");
    }
}

