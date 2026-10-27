
import java.util.*;

public class BFS53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;

        ArrayList<Integer>[] g = new ArrayList[n];
        for (int i = 0; i < n; i++)
            g[i] = new ArrayList<>();

        g[0].add(1);
        g[0].add(2);
        g[1].add(3);
        g[2].add(4);

        System.out.print("Enter source vertex: ");
        int source = sc.nextInt();

        if (source < 0 || source >= n) {
            System.out.println("Invalid vertex");
        } else {
            boolean[] visited = new boolean[n];
            Queue<Integer> q = new LinkedList<>();
            q.add(source);
            visited[source] = true;

            System.out.print("BFS: ");
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
            System.out.println();
        }
        sc.close();
    }
}
