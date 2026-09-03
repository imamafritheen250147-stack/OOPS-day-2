import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = n, sum = 0, digits = 0;

        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        temp = n;

        while (temp != 0) {
            int d = temp % 10;
            sum += Math.pow(d, digits);
            temp /= 10;
        }

        if (sum == n)
            System.out.println(n + " is an Armstrong number");
        else
            System.out.println(n + " is not an Armstrong number");
    }
}
