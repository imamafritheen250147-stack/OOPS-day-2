
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = {10, 20, 30, 40, 50};

        System.out.print("Enter Search Element: ");
        int key = sc.nextInt();

        int position = -1;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == key) {
                position = i;
                break;
            }
        }

        if (position != -1) {
            System.out.println("Found at Position: " +
                               (position + 1));
        } else {
            System.out.println("Element Not Found");
        }

        sc.close();
    }
}
