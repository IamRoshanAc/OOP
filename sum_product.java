import java.util.Scanner;

public class sum_product {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        int b = scanner.nextInt();
        int sum;
        int product;
        sum = a+b;
        product = a*b;
        System.out.println("The Sum of these Numbers is: " +sum);
        System.out.println("The Product of Two Numbers is: " +product);
    }
}
