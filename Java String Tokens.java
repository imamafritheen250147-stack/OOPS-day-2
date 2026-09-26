import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.s = s.trim();
        
        // Handle empty or whitespace-only input edge case
        if (s.length() == 0) {
            System.out.println(0);
            scan.close();
            return;
        }
        
        // Split on one or more non-alphabetic characters
        String[] tokens = s.split("[^A-Za-z]+");
        
        // Print total number of tokens
        System.out.println(tokens.length);
        
        // Print each token on a new line
        for (String token : tokens) {
            System.out.println(token);
        }
        
        
        scan.close();
    }
}

