import java.util.Scanner;

class RecursiveCalls {
    static int count = 0;

    static int fib(int n) {
        count++;

        if (n <= 1)
            return n;

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        System.out.print("Sequence: ");
        for (int i = 0; i < n; i++)
            System.out.print(fib(i) + " ");

        System.out.println("\nRecursive calls = " + count);
    }
}
