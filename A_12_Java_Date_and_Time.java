import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        // Calendar months are 0-indexed (January = 0, December = 11)
        cal.set(year, month - 1, day);
        
        String[] days = {
            "SUNDAY", "MONDAY", "TUESDAY", 
            "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"
        };
        
        // DAY_OF_WEEK returns 1 for Sunday, 2 for Monday, etc.
        return days[cal.get(Calendar.DAY_OF_WEEK) - 1];
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
