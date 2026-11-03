
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numerator: ");
        int a = sc.nextInt();

        System.out.print("Enter denominator: ");
        int b = sc.nextInt();

        try {
            System.out.println("Result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Program completed");
        }

        sc.close();
    }
}
