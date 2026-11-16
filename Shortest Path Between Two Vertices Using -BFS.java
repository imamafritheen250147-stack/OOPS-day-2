import java.util.*;

public class BFS54 {
    public static void main(String[] args) {
        int n = 6;

        ArrayList<Integer>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++)
            graph[i] = new ArrayList<>();

        graph[0].add(1);
        graph[1].add(0);

        graph[0].add(2);
        graph[2].add(0);

        graph[1].add(3);
        graph[3].add(1);

        graph[2].add(4);
        graph[4].add(2);

        graph[3].add(5);
        graph[5].add(3);

        graph[4].add(5);
        graph[5].add(4);

        int source = 0;
        int destination = 5;

        boolean[] visited = new boolean[n];
        int[] parent = new int[n];

        Arrays.fill(parent, -1);

        Queue<Integer> q = new LinkedList<>();

        visited[source] = true;
        q.add(source);

        while (!q.isEmpty()) {
            int v = q.poll();

            if (v == destination)
                break;

            for (int x : graph[v]) {
                if (!visited[x]) {
                    visited[x] = true;
                    parent[x] = v;
                    q.add(x);
                }
            }
        }

        if (!visited[destination]) {
            System.out.println("Path does not exist");
        } else {
            Stack<Integer> path = new Stack<>();

            int current = destination;

            while (current != -1) {
                path.push(current);
                current = parent[current];
            }

            System.out.println("Shortest Path:");

            while (!path.isEmpty())
                System.out.print(path.pop() + " ");
        }
    }
}
