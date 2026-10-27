
import java.util.*;

public class BFS51 {
    public static void main(String[] args) {
        int n = 6;
        ArrayList<Integer>[] graph = new ArrayList[n];
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++)
            graph[i] = new ArrayList<>();

        graph[0].add(1);
        graph[0].add(2);
        graph[1].add(3);
        graph[1].add(4);
        graph[2].add(5);

        q.add(0);
        visited[0] = true;

        while (!q.isEmpty()) {
            int v = q.poll();
            System.out.print(v + " ");

            for (int next : graph[v]) {
                if (!visited[next]) {
                    visited[next] = true;
                    q.add(next);
                }
            }
        }
    }
}
