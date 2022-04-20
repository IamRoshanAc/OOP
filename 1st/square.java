import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Int Number: ");
        int a = scanner.nextInt();
        int sqr = a*a;
        System.out.println("The Square is: "+sqr);
    }
}
