
import java.util.Scanner;

class SumThread extends Thread {
    int n;

    SumThread(int n) {
        this.n = n;
    }

    public void run() {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        SumThread t = new SumThread(n);
        t.start();
    }
}
