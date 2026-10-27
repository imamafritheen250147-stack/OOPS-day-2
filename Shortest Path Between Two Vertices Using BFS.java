
import java.util.*;

public class BFS54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 6;

        ArrayList<Integer>[] g = new ArrayList[n];
        for (int i = 0; i < n; i++)
            g[i] = new ArrayList<>();

        g[0].add(1);
        g[0].add(2);
        g[1].add(3);
        g[1].add(4);
        g[2].add(4);
        g[3].add(5);
        g[4].add(5);

        System.out.print("Enter source: ");
        int s = sc.nextInt();
        System.out.print("Enter destination: ");
        int d = sc.nextInt();

        if (s < 0 || s >= n || d < 0 || d >= n) {
            System.out.println("Invalid vertex");
            sc.close();
            return;
        }

        boolean[] visited = new boolean[n];
        int[] parent = new int[n];
        Arrays.fill(parent, -1);

        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        visited[s] = true;

        while (!q.isEmpty()) {
            int v = q.poll();
            if (v == d) break;

            for (int next : g[v]) {
                if (!visited[next]) {
                    visited[next] = true;
                    parent[next] = v;
                    q.add(next);
                }
            }
        }

        if (!visited[d]) {
            System.out.println("No path exists");
        } else {
            ArrayList<Integer> path = new ArrayList<>();
            for (int v = d; v != -1; v = parent[v])
                path.add(v);

            Collections.reverse(path);
            System.out.println("Shortest path: " + path);
            System.out.println("Distance: " + (path.size() - 1));
        }
        sc.close();
    }
}
