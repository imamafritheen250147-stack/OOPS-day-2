
public class DFS42 {
    static int[][] graph = {
        {0, 1, 1, 0},
        {1, 0, 0, 1},
        {1, 0, 0, 1},
        {0, 1, 1, 0}
    };

    static boolean[] visited = new boolean[4];

    static void dfs(int v) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int i = 0; i < graph.length; i++) {
            if (graph[v][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("DFS Traversal:");
        dfs(0);
    }
}
