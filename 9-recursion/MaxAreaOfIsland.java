//https://leetcode.com/problems/max-area-of-island/
public class MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean visited[][] = new boolean[n][m];
        int max = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    max = Math.max(max, findArea(grid, visited, i, j, n, m));
                }
            }
        }
        return max;
    }

    public int findArea(int[][] grid, boolean[][] visited, int i, int j, int n, int m) {
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] == 0 || visited[i][j]) {
            return 0;
        }
        visited[i][j] = true;
        int size = 1;
        size += findArea(grid, visited, i + 1, j, n, m);
        size += findArea(grid, visited, i - 1, j, n, m);
        size += findArea(grid, visited, i, j + 1, n, m);
        size += findArea(grid, visited, i, j - 1, n, m);
        return size;
    }
}
