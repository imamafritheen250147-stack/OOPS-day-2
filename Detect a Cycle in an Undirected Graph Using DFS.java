
import java.util.*;

public class DFS44 {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    static boolean hasCycle(int v, int parent) {
        visited[v] = true;

        for (int x : graph[v]) {
            if (!visited[x]) {
                if (hasCycle(x, v))
                    return true;
            } else if (x != parent) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int n = 4;

        graph = new ArrayList[n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++)
            graph[i] = new ArrayList<>();

        graph[0].add(1);
        graph[1].add(0);

        graph[1].add(2);
        graph[2].add(1);

        graph[2].add(0);
        graph[0].add(2);

        graph[2].add(3);
        graph[3].add(2);

        boolean cycle = false;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                if (hasCycle(i, -1)) {
                    cycle = true;
                    break;
                }
            }
        }

        if (cycle)
            System.out.println("Cycle detected");
        else
            System.out.println("No cycle detected");
    }
}
