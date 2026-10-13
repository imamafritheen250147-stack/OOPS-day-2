import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid array size");
            return;
        }

        int[] a = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int position = -1;

        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                position = i;
                break;
            }
        }

        if (position != -1)
            System.out.println("Element found at position " + (position + 1));
        else
            System.out.println("Element not found");
    }
}
