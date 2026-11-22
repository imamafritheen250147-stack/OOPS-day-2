
import java.util.Scanner;

public class Factorial {

    static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if (n < 0 || n > 20) {
            System.out.println("Enter a number from 0 to 20");
        } else {
            System.out.println("Factorial: " + factorial(n));
        }

        sc.close();
    }
}
