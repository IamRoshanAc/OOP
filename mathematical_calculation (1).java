import java.util.Scanner;

public class mathematical_calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Length of Square:");
        double a = scanner.nextDouble();
        double area = a*a;
        double perimeter = 4*a;
        System.out.print("The Area of Square is: "+area);
        System.out.println(" and the perimeter of square is: "+perimeter);
    }
}
class si{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        double a = scanner.nextDouble();
        System.out.print("Enter Time: ");
        double b = scanner.nextDouble();
        System.out.print("Enter Rate: ");
        double c = scanner.nextDouble();
        double d;
        d = (a*b*c)/100;
        System.out.println("S.I. is : " +d);

    }
}
class area_triangle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Base of Triangle:");
        double base = scanner.nextDouble();
        System.out.println("Enter Height of Triangle:");
        double height = scanner.nextDouble();
        double area ;
        area = 0.5*base*height;
        System.out.println("Area of Triangle is: " +area);
    }
}
class volume_cube{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Length of Cube:");
        double length = scanner.nextDouble();
        double volume;
        volume = length*length*length;
        System.out.println(volume);
    }
}
class volume_cuboid{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Length of Triangle:");
        double length = scanner.nextDouble();
        System.out.println("Enter Width of Triangle:");
        double width = scanner.nextDouble();
        System.out.println("Enter Height of Triangle:");
        double height = scanner.nextDouble();
        double volume;
        volume= length*width*height;
        System.out.println(volume);
    }
}
