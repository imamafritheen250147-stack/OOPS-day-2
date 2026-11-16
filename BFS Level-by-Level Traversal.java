
import java.util.*;

public class BFS55 {
    public static void main(String[] args) {
        int n = 6;

        ArrayList<Integer>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++)
            graph[i] = new ArrayList<>();

        graph[0].add(1);
        graph[0].add(2);
        graph[1].add(3);
        graph[1].add(4);
        graph[2].add(5);

        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        visited[0] = true;

        int level = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            System.out.print("Level " + level + ": ");

            for (int i = 0; i < size; i++) {
                int v = q.poll();
                System.out.print(v + " ");

                for (int x : graph[v]) {
                    if (!visited[x]) {
                        visited[x] = true;
                        q.add(x);
                    }
                }
            }

            System.out.println();
            level++;
        }
    }
}
