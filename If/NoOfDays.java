package If;

import java.util.Scanner;

public class NoOfDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month number: ");
        int monthNumber = scanner.nextInt();
        System.out.println("Enter year: ");
        int year = scanner.nextInt();
        if (monthNumber == 1){

        }

    }
}
class Odd_Even{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num1 = scanner.nextInt();
        int rem = num1%2;
        switch (rem){
            case 0:
                System.out.println(num1+"is even");
                break;
            case 1 :
                System.out.println(num1 +"is odd");
                break;

        }
    }
}