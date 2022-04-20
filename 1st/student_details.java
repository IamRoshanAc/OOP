import java.util.Scanner;

public class student_details {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String a = scanner.next();
        System.out.print("Enter Age: ");
        int b = scanner.nextInt();
        System.out.print("Enter Hometown: ");
        String c = scanner.next();
        System.out.print("The Name of student is:" +a);
        System.out.print(" and the Age is:" +b);
        System.out.print("and He is from :" +c);
    }
}