//
public class PathWithMaxGold { // solved using backtracking with recursion
        int ans = 0;
        public int getMaximumGold(int[][] grid) {
            int a = grid.length;
            int b = grid[0].length;
            for(int i=0;i<a;i++){
                for(int j=0;j<b;j++){
                    if(grid[i][j] != 0){
                        backtrack(grid, grid[i][j], i, j);
                    }
                }
            }
            return ans;
        }

        void backtrack(int[][] grid, int sum, int r, int c){
            if(sum > ans){
                ans = sum;
            }

            int temp = grid[r][c];
            grid[r][c] = 0; // visited

            if( r<grid.length-1 && grid[r+1][c] != 0 ){ // move down
                backtrack(grid, sum+grid[r+1][c], r+1, c);
            }

            if( c<grid[0].length-1 && grid[r][c+1] != 0 ){ // move right
                backtrack(grid, sum+grid[r][c+1], r, c+1);
            }

            if( c>0 && grid[r][c-1] != 0 ){ // move left
                backtrack(grid, sum+grid[r][c-1], r, c-1);
            }

            if( r>0 && grid[r-1][c] != 0 ){ // move up
                backtrack(grid, sum+grid[r-1][c], r-1, c);
            }

            grid[r][c] = temp; // using backtracking

        }
}
