
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        if (n <= 0) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("Fibonacci Series:");

            for (int i = 1; i <= n; i++) {

                System.out.print(a + " ");

                int next = a + b;
                a = b;
                b = next;
            }
        }

        sc.close();
    }
}
