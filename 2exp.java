import java.util.Scanner;

public class Fibonacci {

    static int calls = 0;

    // Recursive Fibonacci function
    static int fib(int n) {
        calls++;

        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        // Invalid input
        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }

        // Generate Fibonacci sequence
        System.out.println("Fibonacci Sequence:");

        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }

        // Calculate nth Fibonacci value
        calls = 0;
        int value = fib(n);

        // Recursive call count
        System.out.println();
        System.out.println("Fibonacci value = " + value);
        System.out.println("Function Calls = " + calls);
    }
}
