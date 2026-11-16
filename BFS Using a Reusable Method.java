
import java.util.*;

public class BFS52 {
    static ArrayList<Integer>[] graph;
    static int n = 5;

    static void bfs(int start) {
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;
        q.add(start);

        while (!q.isEmpty()) {
            int v = q.poll();
            System.out.print(v + " ");

            for (int x : graph[v]) {
                if (!visited[x]) {
                    visited[x] = true;
                    q.add(x);
                }
            }
        }
    }

    public static void main(String[] args) {
        graph = new ArrayList[n];

        for (int i = 0; i < n; i++)
            graph[i] = new ArrayList<>();

        graph[0].add(1);
        graph[0].add(2);
        graph[1].add(3);
        graph[2].add(4);

        System.out.println("BFS from vertex 0:");
        bfs(0);

        System.out.println();
        System.out.println("BFS from vertex 2:");
        bfs(2);
    }
}
