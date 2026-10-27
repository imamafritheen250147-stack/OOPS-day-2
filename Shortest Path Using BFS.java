
import java.util.*;

public class BFSShortestPath {
    static ArrayList<Integer>[] graph;
    static int n;

    static void findPath(int source, int destination) {
        boolean[] visited = new boolean[n];
        int[] parent = new int[n];
        Arrays.fill(parent, -1);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        visited[source] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (current == destination)
                break;

            for (int next : graph[current]) {
                if (!visited[next]) {
                    visited[next] = true;
                    parent[next] = current;
                    queue.add(next);
                }
            }
        }

        if (!visited[destination]) {
            System.out.println("No path exists");
            return;
        }

        ArrayList<Integer> path = new ArrayList<>();
        for (int v = destination; v != -1; v = parent[v]) {
            path.add(v);
        }

        Collections.reverse(path);

        System.out.println("Shortest path: " + path);
        System.out.println("Distance: " + (path.size() - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = 6;
        graph = new ArrayList[n];

        for (int i = 0; i < n; i++)
            graph[i] = new ArrayList<>();

        graph[0].add(1);
        graph[0].add(2);
        graph[1].add(3);
        graph[1].add(4);
        graph[2].add(4);
        graph[3].add(5);
        graph[4].add(5);

        System.out.print("Enter source: ");
        int source = sc.nextInt();

        System.out.print("Enter destination: ");
        int destination = sc.nextInt();

        if (source < 0 || source >= n ||
            destination < 0 || destination >= n) {
            System.out.println("Invalid vertex");
        } else {
            findPath(source, destination);
        }

        sc.close();
    }
}
