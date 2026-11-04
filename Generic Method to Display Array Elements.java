
public class Generic22 {
    static <T> void displayArray(T[] a) {
        for (T item : a)
            System.out.print(item + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] numbers = {10, 20, 30};
        String[] names = {"Ali", "Ravi", "John"};

        displayArray(numbers);
        displayArray(names);
    }
}
