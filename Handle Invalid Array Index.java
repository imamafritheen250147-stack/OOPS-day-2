
import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {10, 20, 30, 40, 50};

        System.out.print("Enter index (0-4): ");
        int index = sc.nextInt();

        try {
            System.out.println("Element: " + a[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }

        sc.close();
    }
}
