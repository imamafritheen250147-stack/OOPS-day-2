
import java.util.*;

public class DFS45 {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    static void dfs(int v) {
        visited[v] = true;

        for (int x : graph[v]) {
            if (!visited[x])
                dfs(x);
        }
    }

    public static void main(String[] args) {
        int n = 6;

        graph = new ArrayList[n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++)
            graph[i] = new ArrayList<>();

        graph[0].add(1);
        graph[1].add(0);

        graph[1].add(2);
        graph[2].add(1);

        graph[3].add(4);
        graph[4].add(3);

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i);
                count++;
            }
        }

        System.out.println("Connected components: " + count);
    }
}
