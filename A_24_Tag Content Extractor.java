import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        
        // Regex pattern breakdown:
        // <([^>]+)> : Captures opening tag content into Group 1
        // ([^<]+)   : Captures inner content (excluding inner tags) into Group 2
        // </\1>     : Matches backreference to closing tag matching Group 1
        String regex = "<([^>]+)>([^<]+)</\\1>";
        Pattern pattern = Pattern.compile(regex);

        while (testCases > 0) {
            String line = in.nextLine();
            
            Matcher matcher = pattern.matcher(line);
            boolean found = false;

            while (matcher.find()) {
                System.out.println(matcher.group(2));
                found = true;
            }

            if (!found) {
                System.out.println("None");
            }
            
            testCases--;
        }
        
        in.close();
    }
}
