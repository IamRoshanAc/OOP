package ddd;

import java.util.Scanner;

public class check_condition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int a  = scanner.nextInt();
        System.out.print("Enter another Number: ");
        int b  = scanner.nextInt();
        String c;
        c = ((a<50)&&(a<b))?"Both Condition i.e. a<50 and a<b is True":"Both Condition i.e. a<50 and a<b is False";
        System.out.println(c);
    }
}
