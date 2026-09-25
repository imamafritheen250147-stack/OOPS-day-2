import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
    // Initialize smallest and largest with the first substring of length k
    String smallest = s.substring(0, k);
    String largest = s.substring(0, k);
    
    // Iterate over all possible substrings of length k
    for (int i = 1; i <= s.length() - k; i++) {
        String sub = s.substring(i, i + k);
        
        // Update smallest if current substring is lexicographically smaller
        if (sub.compareTo(smallest) < 0) {
            smallest = sub;
        }
        
        // Update largest if current substring is lexicographically larger
        if (sub.compareTo(largest) > 0) {
            largest = sub;
        }
    }
    
    return smallest + "\n" + largest;
}


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
