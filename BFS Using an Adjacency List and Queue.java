
import java.util.*;

public class BFS52 {
    static void bfs(ArrayList<Integer>[] g, int source) {
        boolean[] visited = new boolean[g.length];
        Queue<Integer> q = new LinkedList<>();

        visited[source] = true;
        q.add(source);

        while (!q.isEmpty()) {
            int v = q.poll();
            System.out.print(v + " ");

            for (int next : g[v]) {
                if (!visited[next]) {
                    visited[next] = true;
                    q.add(next);
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;
        ArrayList<Integer>[] g = new ArrayList[n];

        for (int i = 0; i < n; i++)
            g[i] = new ArrayList<>();

        g[0].add(1);
        g[0].add(2);
        g[1].add(3);
        g[2].add(4);

        System.out.print("BFS: ");
        bfs(g, 0);
    }
}
