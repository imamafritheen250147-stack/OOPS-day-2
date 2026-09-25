import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        
        // Reverse the string A using StringBuilder
        String reversed = new StringBuilder(A).reverse().toString();
        
        // Print "Yes" if A equals its reversed string, otherwise "No"
        if (A.equals(reversed)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        sc.close();
    }
}
