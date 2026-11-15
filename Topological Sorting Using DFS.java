
import java.util.*;

public class DFS48 {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static Stack<Integer> stack = new Stack<>();

    static void dfs(int v) {
        visited[v] = true;

        for (int x : graph[v]) {
            if (!visited[x])
                dfs(x);
        }

        stack.push(v);
    }

    public static void main(String[] args) {
        int n = 6;

        graph = new ArrayList[n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++)
            graph[i] = new ArrayList<>();

        graph[5].add(2);
        graph[5].add(0);
        graph[4].add(0);
        graph[4].add(1);
        graph[2].add(3);
        graph[3].add(1);

        for (int i = 0; i < n; i++) {
            if (!visited[i])
                dfs(i);
        }

        System.out.println("Topological Order:");

        while (!stack.isEmpty())
            System.out.print(stack.pop() + " ");
    }
}
