import java.util.Scanner;

class Main {

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            String input = sc.nextLine().trim();
            String[] a = input.split("\\s+");

            if (a.length == 1) {
                int n = Integer.parseInt(a[0]);

                if (isPrime(n))
                    System.out.println(n + " is Prime");
                else
                    System.out.println(n + " is Not Prime");

            } else if (a.length == 2) {
                int start = Integer.parseInt(a[0]);
                int end = Integer.parseInt(a[1]);

                System.out.print("Prime numbers between "
                        + start + " and " + end + ": ");

                for (int i = start; i <= end; i++) {
                    if (isPrime(i))
                        System.out.print(i + " ");
                }

                System.out.println();

            } else {
                System.out.println(
                    "Invalid input! Please enter a valid integer.");
            }

        } catch (Exception e) {
            System.out.println(
                "Invalid input! Please enter a valid integer.");
        }
    }
}
