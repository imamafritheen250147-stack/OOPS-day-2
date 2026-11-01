
class Calculator<T extends Number> {
    T a, b;

    Calculator(T a, T b) {
        this.a = a;
        this.b = b;
    }

    double sum() {
        return a.doubleValue() + b.doubleValue();
    }
}

public class Generic28 {
    public static void main(String[] args) {
        Calculator<Integer> c1 =
            new Calculator<>(10, 20);

        Calculator<Double> c2 =
            new Calculator<>(2.5, 3.5);

        System.out.println("Integer sum: " + c1.sum());
        System.out.println("Double sum: " + c2.sum());
    }
}
