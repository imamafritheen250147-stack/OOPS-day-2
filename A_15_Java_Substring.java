import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        // Print the substring from index 'start' up to 'end - 1'
        System.out.println(S.substring(start, end));
        
        in.close();
    }
}
