import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();

        int count = 0;

        // Iterate over all possible subarray start positions
        for (int i = 0; i < n; i++) {
            int sum = 0;
            // Extend the subarray to the right
            for (int j = i; j < n; j++) {
                sum += a[j];
                if (sum < 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
