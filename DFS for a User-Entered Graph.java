
import java.util.*;

public class DFS43 {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    static void dfs(int v) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int x : graph[v]) {
            if (!visited[x])
                dfs(x);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vertices: ");
        int n = sc.nextInt();

        graph = new ArrayList[n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++)
            graph[i] = new ArrayList<>();

        System.out.print("Enter edges: ");
        int e = sc.nextInt();

        System.out.println("Enter edge pairs:");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph[u].add(v);
            graph[v].add(u);
        }

        System.out.print("Enter starting vertex: ");
        int start = sc.nextInt();

        System.out.println("DFS Traversal:");
        dfs(start);

        sc.close();
    }
}
