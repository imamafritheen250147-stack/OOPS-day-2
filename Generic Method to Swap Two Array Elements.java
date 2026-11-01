
import java.util.Arrays;

public class Generic29 {
    static <T> void swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] numbers = {10, 20, 30};
        String[] names = {"Ali", "Ravi", "John"};

        swap(numbers, 0, 2);
        swap(names, 0, 1);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(names));
    }
}
