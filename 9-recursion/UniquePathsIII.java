public class UniquePathsIII { // understand this one properly v.imp
        public int uniquePathsIII(int[][] grid) {
            int startRow = 0, startCol = 0;
            int emptyCount = 0;

            // Find the starting point and count empty cells
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == 0) {
                        emptyCount++;
                    } else if (grid[i][j] == 1) {
                        startRow = i;
                        startCol = j;
                    }
                }
            }

            return backtrack(grid, startRow, startCol, emptyCount + 1);
        }

        private int backtrack(int[][] grid, int r, int c, int emptyCount) {
            if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == -1) {
                return 0;
            }

            if (grid[r][c] == 2) {
                return emptyCount == 0 ? 1 : 0;
            }

            grid[r][c] = -1; // Mark the cell as visited

            int paths = 0;
            int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

            for (int i = 0; i < 4; i++) {
                int newRow = r + directions[i][0];
                int newCol = c + directions[i][1];
                paths += backtrack(grid, newRow, newCol, emptyCount - 1);
            }

            grid[r][c] = 0; // Reset the cell after recursion

            return paths;
            
        }
}
