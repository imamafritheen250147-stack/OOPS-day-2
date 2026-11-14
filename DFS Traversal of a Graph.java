
import java.util.*;

public class DFS41 {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    static void dfs(int v) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int next : graph[v]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;

        graph = new ArrayList[n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++)
            graph[i] = new ArrayList<>();

        graph[0].add(1);
        graph[0].add(2);
        graph[1].add(3);
        graph[1].add(4);

        System.out.println("DFS Traversal:");
        dfs(0);
    }
}
