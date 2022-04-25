package ddd;

import java.util.Scanner;

public class Rank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter MArk of 1st Subject: ");
        double a = scanner.nextDouble();
        System.out.print("Enter MArk of EEE.2nd Subject: ");
        double b = scanner.nextDouble();
        System.out.print("Enter MArk of 3rd Subject: ");
        double c = scanner.nextDouble();
        System.out.print("Enter MArk of 4th Subject: ");
        double d = scanner.nextDouble();
        double total_mark;
        double percentage;
        String rank;
        total_mark = a+b+c+d;
        System.out.println("Total Marks is :" + total_mark);
        percentage = total_mark/4;
        System.out.println("Total Percentage is :" + percentage);
        rank = (percentage>=70)?"First Class":(percentage>59)?"Upper Second Class":(percentage>49)?"Second Class":(percentage>39)?"Third Class":"Failed";
        System.out.println("Your Grade is :" + rank);
    }
}
