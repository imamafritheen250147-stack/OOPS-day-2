import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Read initial list size
        int n = scan.nextInt();
        
        // Populate the list
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scan.nextInt());
        }
        
        // Read number of queries
        int q = scan.nextInt();
        
        // Process queries
        for (int i = 0; i < q; i++) {
            String queryType = scan.next();
            if (queryType.equalsIgnoreCase("Insert")) {
                int x = scan.nextInt(); // Index
                int y = scan.nextInt(); // Value
                list.add(x, y);
            } else if (queryType.equalsIgnoreCase("Delete")) {
                int x = scan.nextInt(); // Index
                list.remove(x);
            }
        }
        
        scan.close();
        
        // Print the updated list
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + (i == list.size() - 1 ? "" : " "));
        }
    }
}
