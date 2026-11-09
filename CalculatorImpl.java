import java.util.Scanner;

interface Calculator {
    int add(int a, int b);
}

class CalculatorImpl implements Calculator {

    public int add(int a, int b) {
        return a + b;
    }
}

public class CalculatorTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CalculatorImpl obj = new CalculatorImpl();

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = obj.add(a, b);

        System.out.println("Sum = " + result);

        sc.close();
    }
}
