package If;

import java.util.Scanner;

public class Max_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter another Number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter another Number: ");
        int num3 = scanner.nextInt();
        int result = 0;
        if ((num1>num2) && (num1>num3)){
            result = 1;
        }
        else if ((num2>num1)&&(num2>num3)) {
            result = 2;
        }
        else if ((num3>num1)&&(num3>num2)){
            result = 3;
        }
        switch(result){
            case 1:
                System.out.println(num1 + " is Greatest.");
                break;
            case 2:
                System.out.println(num2 + " is Greatest.");
                break;
            case 3:
                System.out.println(num3 + " is Greatest.");
                break;
        }
    }
}
