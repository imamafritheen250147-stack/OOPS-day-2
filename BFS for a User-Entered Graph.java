
import java.util.*;

public class BFS53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vertices: ");
        int n = sc.nextInt();

        ArrayList<Integer>[] graph = new ArrayList[n];

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

        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;
        q.add(start);

        System.out.println("BFS Traversal:");

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

        sc.close();
    }
}
