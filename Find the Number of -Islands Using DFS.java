
public class DFS49 {
    static int[][] grid = {
        {1, 1, 0, 0},
        {0, 1, 0, 1},
        {0, 0, 0, 1},
        {1, 0, 0, 0}
    };

    static boolean[][] visited;
    static int rows = 4, cols = 4;

    static void dfs(int r, int c) {
        if (r < 0 || c < 0 || r >= rows || c >= cols)
            return;

        if (grid[r][c] == 0 || visited[r][c])
            return;

        visited[r][c] = true;

        dfs(r + 1, c);
        dfs(r - 1, c);
        dfs(r, c + 1);
        dfs(r, c - 1);
    }

    public static void main(String[] args) {
        visited = new boolean[rows][cols];

        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    dfs(i, j);
                    count++;
                }
            }
        }

        System.out.println("Number of islands: " + count);
    }
}
