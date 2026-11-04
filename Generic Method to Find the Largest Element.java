public class Generic24 {
    static <T extends Comparable<T>> T largest(T[] a) {
        T max = a[0];

        for (T item : a) {
            if (item.compareTo(max) > 0)
                max = item;
        }

        return max;
    }

    public static void main(String[] args) {
        Integer[] numbers = {10, 50, 20, 40};
        String[] words = {"Apple", "Mango", "Banana"};

        System.out.println("Largest number: "
                           + largest(numbers));
        System.out.println("Largest word: "
                           + largest(words));
    }
}
