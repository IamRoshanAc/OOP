package ddd;

import java.util.Scanner;

public class sum_of_four_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        int b = scanner.nextInt();
        System.out.print("Enter Third Number: ");
        int c = scanner.nextInt();
        System.out.print("Enter Fourth Number: ");
        int d = scanner.nextInt();
        int e;
        e = a+b+c+d;
        System.out.print("The Sum is:"+e);
    }
}

