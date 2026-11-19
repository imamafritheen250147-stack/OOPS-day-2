
public class GenericMaximum {

    public static <T extends Comparable<T>> T maximum(
            T a, T b, T c) {

        T max = a;

        if (b.compareTo(max) > 0) {
            max = b;
        }

        if (c.compareTo(max) > 0) {
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {

        System.out.println("Maximum Integer: " +
            maximum(10, 50, 30));

        System.out.println("Maximum String: " +
            maximum("Apple", "Mango", "Banana"));
    }
}
