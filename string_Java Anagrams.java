import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // If lengths are different, they cannot be anagrams
        if (a.length() != b.length()) {
            return false;
        }

        // Convert both strings to lowercase for case-insensitive comparison
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Array to store frequency of English alphabet letters (26 letters)
        int[] counts = new int[26];

        // Increment count for characters in 'a' and decrement for characters in 'b'
        for (int i = 0; i < a.length(); i++) {
            counts[a.charAt(i) - 'a']++;
            counts[b.charAt(i) - 'a']--;
        }

        // Check if all counts returned to 0
        for (int count : counts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
