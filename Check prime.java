import java.util.Scanner;

class Main {

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String line = sc.nextLine().trim();
        String[] parts = line.split("\\s+");

        try {
            if (parts.length == 1) {
                // Single number -> normal prime check
                int n = Integer.parseInt(parts[0]);
                if (isPrime(n))
                    System.out.println(n + " is Prime");
                else
                    System.out.println(n + " is Not Prime");

            } else if (parts.length == 2) {
                // Two numbers -> range query, list all primes between them
                int start = Integer.parseInt(parts[0]);
                int end = Integer.parseInt(parts[1]);

                StringBuilder primes = new StringBuilder();
                for (int i = start; i <= end; i++) {
                    if (isPrime(i)) {
                        primes.append(i).append(" ");
                    }
                }

                System.out.println("Prime numbers between " + start + " and " + end
                        + ": " + primes.toString().trim());

            } else {
                System.out.println("Invalid input! Please enter a valid integer.");
            }

        } catch (NumberFormatException e) {
            // Non-numeric input, e.g. "abc"
            System.out.println("Invalid input! Please enter a valid integer.");
        }

        sc.close();
    }
}
