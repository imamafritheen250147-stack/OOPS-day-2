
import java.util.*;

public class DFS46 {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    static boolean dfs(int v, int target) {
        if (v == target)
            return true;

        visited[v] = true;

        for (int x : graph[v]) {
            if (!visited[x]) {
                if (dfs(x, target))
                    return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int n = 5;

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

        int source = 0;
        int destination = 2;

        if (dfs(source, destination))
            System.out.println("Path exists");
        else
            System.out.println("Path does not exist");
    }
}
