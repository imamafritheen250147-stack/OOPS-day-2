import java.util.*;

public class ShortestPath {
    public static void main(String[] args) {

        int n = 5;

        ArrayList<ArrayList<Integer>> graph =
            new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(2).add(3);
        graph.get(3).add(4);

        int source = 0;
        int destination = 4;

        int[] parent = new int[n];
        boolean[] visited = new boolean[n];

        Arrays.fill(parent, -1);

        Queue<Integer> q = new LinkedList<>();

        q.add(source);
        visited[source] = true;

        while (!q.isEmpty()) {

            int current = q.poll();

            for (int next : graph.get(current)) {

                if (!visited[next]) {
                    visited[next] = true;
                    parent[next] = current;
                    q.add(next);
                }
            }
        }

        if (!visited[destination]) {
            System.out.println("Path Not Found");
        } else {

            ArrayList<Integer> path = new ArrayList<>();

            int current = destination;

            while (current != -1) {
                path.add(current);
                current = parent[current];
            }

            Collections.reverse(path);

            System.out.println("Shortest Path: " + path);
            System.out.println("Distance: " +
                               (path.size() - 1));
        }
    }
}
