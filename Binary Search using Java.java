
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = {10, 20, 30, 40, 50, 60};

        System.out.print("Enter Register Number: ");
        int key = sc.nextInt();

        int low = 0;
        int high = a.length - 1;
        int found = -1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (a[mid] == key) {
                found = mid;
                break;
            } else if (key < a[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (found != -1) {
            System.out.println("Found at position: " +
                               (found + 1));
        } else {
            System.out.println("Not Found");
        }

        sc.close();
    }
}
