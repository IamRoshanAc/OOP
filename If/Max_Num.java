package If;

import java.util.Scanner;

public class Max_Num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter another Number: ");
        int num2 = scanner.nextInt();
        int result;
        if (num1 > num2) {
            result = 0;
        } else if (num2 > num1) {
            result = 1;
        } else {
            result = 2;
        }
        switch (result) {
            case 0:
                System.out.println(num1 + " is Greatest.");
                break;
            case 1:
                System.out.println(num2 + " is Greatest.");
                break;
            case 2:
                System.out.println("Both are Equal");
                break;
        }

    }
}