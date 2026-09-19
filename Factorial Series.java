import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid input");
            return;
        }

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
            System.out.println(i + "! = " + fact);
        }
    }
}
