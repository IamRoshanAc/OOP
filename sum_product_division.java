import java.util.Scanner;

public class sum_product_division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = scanner.nextInt();
        System.out.println("Enter Second Number: ");
        int b = scanner.nextInt();
        int sum;
        int product;
        int division;
        sum = a+b;
        product = a*b;
        division = product/sum;
        System.out.println("The Sum of these Numbers is: " +sum);
        System.out.println("The Product of Two Numbers is: " +product);
        System.out.println("The Divison of Product by Sum is: " +division);
    }
}