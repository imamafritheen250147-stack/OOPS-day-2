
import java.util.*;

public class DFS47 {
    public static void main(String[] args) {
        int n = 5;

        ArrayList<Integer>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++)
            graph[i] = new ArrayList<>();

        graph[0].add(1);
        graph[0].add(2);
        graph[1].add(3);
        graph[1].add(4);

        boolean[] visited = new boolean[n];
        Stack<Integer> stack = new Stack<>();

        stack.push(0);

        System.out.println("DFS Traversal:");

        while (!stack.isEmpty()) {
            int v = stack.pop();

            if (!visited[v]) {
                visited[v] = true;
                System.out.print(v + " ");

                for (int i = graph[v].size() - 1; i >= 0; i--) {
                    int x = graph[v].get(i);

                    if (!visited[x])
                        stack.push(x);
                }
            }
        }
    }
}
