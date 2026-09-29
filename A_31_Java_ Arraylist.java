import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // 2D ArrayList to store lines of integers
        List<List<Integer>> lines = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int d = scan.nextInt();
            List<Integer> line = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                line.add(scan.nextInt());
            }
            lines.add(line);
        }

        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();

            // Convert 1-based indexing to 0-based indexing
            int lineIndex = x - 1;
            int elementIndex = y - 1;

            // Check if the requested position is within bounds
            if (lineIndex >= 0 && lineIndex < lines.size() && 
                elementIndex >= 0 && elementIndex < lines.get(lineIndex).size()) {
                System.out.println(lines.get(lineIndex).get(elementIndex));
            } else {
                System.out.println("ERROR!");
            }
        }

        scan.close();
    }
}
