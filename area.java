import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Length of Rectangle: ");
        double a = scanner.nextDouble();
        System.out.print("Enter Breadth of Rectangle: ");
        double b = scanner.nextDouble();
        double area;
        area = a*b;
        int area1 = (int)area;
        System.out.println("The area of rectangle is: " +area1);
    }

}
