package GUI;

import javax.swing.*;

public class per_result {
    public static void main(String[] args) {
        double mark1 = Double.parseDouble(JOptionPane.showInputDialog("Enter Mark of 1st Subject"));
        double mark2 = Double.parseDouble(JOptionPane.showInputDialog("Enter Mark of 2nd Subject"));
        double mark3 = Double.parseDouble(JOptionPane.showInputDialog("Enter Mark of 3rd Subject"));
        double mark4 = Double.parseDouble(JOptionPane.showInputDialog("Enter Mark of 4th Subject"));
        double total_mark = mark1+mark2+mark3+mark4;
        double percentage = total_mark/4;
        int total = (int)total_mark;
        int per = (int)percentage;
        String result = (percentage>=70)?"First Class":(percentage>59)?"Upper Second Class":(percentage>49)?"Second Class":(percentage>39)?"Third Class":"Failed";

        JOptionPane.showMessageDialog(null,"Total mark: "+total+" \n Percentage: "+per + "%" + "\n Result: "+ result);
    }
}
