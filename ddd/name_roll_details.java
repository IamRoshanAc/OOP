package ddd;

import java.util.Scanner;

public class name_roll_details {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String a = scanner.next();
        System.out.print("Enter Roll No. : ");
        int b = scanner.nextInt();
        System.out.print("Enter Interest: ");
        String c = scanner.next();
        System.out.print("Hey,My Name is:" +a);
        System.out.print(" and my roll Number is:" +b);
        System.out.print(".My field of Intrest are :" +c);
    }
}
