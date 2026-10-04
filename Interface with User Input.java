import java.util.Scanner;

interface Calculator {
    void calculate();
}

class Addition implements Calculator {
    public void calculate() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        System.out.println("Sum = " + (a + b));
    }
}

public class Main {
    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.calculate();
    }
}
