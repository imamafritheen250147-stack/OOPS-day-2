import java.util.Scanner;

interface Calculator {
    int add(int a, int b) throws Exception;
}

class NegativeNumberException extends Exception {

    NegativeNumberException(String message) {
        super(message);
    }
}

class CalculatorImpl implements Calculator {

    public int add(int a, int b) throws Exception {

        if (a < 0 || b < 0) {
            throw new NegativeNumberException(
                "Numbers must be non-negative"
            );
        }

        return a + b;
    }
}

public class ExceptionDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Calculator obj = new CalculatorImpl();

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            System.out.println("Sum = " + obj.add(a, b));

            System.out.print("Enter first number: ");
            a = sc.nextInt();

            System.out.print("Enter second number: ");
            b = sc.nextInt();

            System.out.println("Sum = " + obj.add(a, b));

        } catch (Exception e) {

            System.out.println("Exception caught: "
                               + e.getMessage());
        }

        sc.close();
    }
}
