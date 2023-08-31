public class UniquePaths {
    //memo array to store the results of subproblems that have already been computed. Before making a recursive call, the code checks if the result for the current cell
    // is already available in the memo array. If it is, the function returns the memoized result instead of recalculating it. This way, you avoid redundant computations
    // and significantly improve the efficiency of your solution while still using the recursive approach.
        public int uniquePaths(int m, int n) {
            boolean grid[][] = new boolean[m][n];
            Integer memo[][] = new Integer[m][n]; // using memoization because otherwise time limit exceeded error will be shown as it is making so much comparisons
            return path(grid, memo, 0, 0);
        }

        public int path(boolean[][] grid, Integer memo[][], int r, int c){
            if(r == grid.length-1 || c == grid[0].length-1){
                return 1;
            }

            // Check if the result is already memoized
            if (memo[r][c] != null) {
                return memo[r][c];
            }

            grid[r][c] = true; // visited
            int count = 0;

            if(r < grid.length-1){
                count += path(grid, memo, r+1, c); // move down
            }

            if(c < grid[0].length-1){
                count += path(grid, memo, r, c+1);
            }

            // Memoize the result before returning
            memo[r][c] = count;

            grid[r][c] = false;
            return count;
        }

}
