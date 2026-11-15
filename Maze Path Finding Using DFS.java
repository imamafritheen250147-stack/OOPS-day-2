
public class DFS50 {
    static int[][] maze = {
        {0, 1, 0, 0},
        {0, 0, 0, 1},
        {1, 1, 0, 0},
        {0, 0, 0, 0}
    };

    static boolean[][] visited = new boolean[4][4];

    static boolean dfs(int r, int c) {
        if (r < 0 || c < 0 || r >= 4 || c >= 4)
            return false;

        if (maze[r][c] == 1 || visited[r][c])
            return false;

        if (r == 3 && c == 3)
            return true;

        visited[r][c] = true;

        if (dfs(r + 1, c) ||
            dfs(r - 1, c) ||
            dfs(r, c + 1) ||
            dfs(r, c - 1)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        if (dfs(0, 0))
            System.out.println("Path exists");
        else
            System.out.println("Path does not exist");
    }
}
