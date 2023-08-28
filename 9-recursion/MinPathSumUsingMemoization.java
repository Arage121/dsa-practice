public class MinPathSumUsingMemoization {
        public int minPathSum(int[][] grid) {
            Integer[][] memo = new Integer[grid.length][grid[0].length];
            return minSum(grid, 0, 0, memo);
        }

        public int minSum(int[][] grid, int r, int c, Integer[][] memo) {
            if (r == grid.length - 1 && c == grid[0].length - 1) {
                return grid[r][c];
            }

            if (memo[r][c] != null) {
                return memo[r][c];
            }

            int rightSum = Integer.MAX_VALUE;
            int downSum = Integer.MAX_VALUE;

            if (r < grid.length - 1) {
                downSum = minSum(grid, r + 1, c, memo);
            }

            if (c < grid[0].length - 1) {
                rightSum = minSum(grid, r, c + 1, memo);
            }

            // Calculate the minimum sum considering both right and down movements
            memo[r][c] = grid[r][c] + Math.min(rightSum, downSum);
            return memo[r][c];
        }
}
