package GUI;

import javax.swing.*;

public class mathematical_calculation {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter Length of Rectangle"));
        double area = a*a;
        double perimeter = 4*a;
        JOptionPane.showMessageDialog(null,"Area: "+area+"\n Perimeter: "+perimeter);
    }
}

class si{
    public static void main(String[] args) {
        double p = Double.parseDouble(JOptionPane.showInputDialog("Enter Principle"));
        double t = Double.parseDouble(JOptionPane.showInputDialog("Enter Time"));
        double r = Double.parseDouble(JOptionPane.showInputDialog("Enter Rate"));
        double si = (p*t*r)/100;
        JOptionPane.showMessageDialog(null,"Simple Interest: "+si);
    }
}
class area_triangle{
    public static void main(String[] args) {
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter Base"));
        double h = Double.parseDouble(JOptionPane.showInputDialog("Enter Height"));
        double area=0.5*b*h;
        JOptionPane.showMessageDialog(null,"Area of Triangle: "+area);
    }
}
class volume_cube{
    public static void main(String[] args) {
        double l = Double.parseDouble(JOptionPane.showInputDialog("Enter Length of Cube"));
        double volume = l*l*l;
        JOptionPane.showMessageDialog(null,"Volume of Cube: "+volume);
    }
}
class volume_cuboid{
    public static void main(String[] args) {
        double l = Double.parseDouble(JOptionPane.showInputDialog("Enter Length of Cuboid"));
        double w = Double.parseDouble(JOptionPane.showInputDialog("Enter Width of Cuboid"));
        double h = Double.parseDouble(JOptionPane.showInputDialog("Enter Height of Cuboid"));
        double volume = l*w*h;
        JOptionPane.showMessageDialog(null,"Volume of Cuboid: "+volume);
    }
}