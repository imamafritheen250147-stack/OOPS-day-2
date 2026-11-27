
public class SelectionSort {
    public static void main(String[] args) {

        int[] a = {64, 25, 12, 22, 11};

        for (int i = 0; i < a.length - 1; i++) {

            int min = i;

            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }

            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }

        System.out.println("Sorted Array:");

        for (int n : a) {
            System.out.print(n + " ");
        }
    }
}
