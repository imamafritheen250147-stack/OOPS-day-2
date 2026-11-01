
import java.util.*;

public class Generic30 {
    static void display(List<? extends Number> list) {
        for (Number n : list)
            System.out.print(n + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(10, 20, 30);
        List<Double> b = Arrays.asList(1.5, 2.5, 3.5);

        display(a);
        display(b);
    }
}
