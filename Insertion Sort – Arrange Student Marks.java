
public class InsertionSort {
    public static void main(String[] args) {

        int[] a = {40, 20, 50, 10, 30};

        for (int i = 1; i < a.length; i++) {

            int key = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = key;
        }

        System.out.println("Sorted Marks:");

        for (int n : a) {
            System.out.print(n + " ");
        }
    }
}
