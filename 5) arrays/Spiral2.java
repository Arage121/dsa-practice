//https://leetcode.com/problems/spiral-matrix-ii/
public class Spiral2 {
        public int[][] generateMatrix(int n) {
            int[][] arr = new int[n][n];
            int top=0;
            int right= n-1;
            int left = 0;
            int bottom = n-1;
            int count = 1;
            if(n == 1) return new int[][] {{1}};
            while(count <= n*n){
                //left to right
                for(int i=left;i<=right; i++){
                    arr[top][i] = count;
                    count++;
                }
                top++;

                //top to bottom
                for(int i=top;i<=bottom; i++){
                    arr[i][right] = count;
                    count++;
                }
                right--;

                //right to left
                for(int i=right;i>=left;i--){
                    arr[bottom][i] = count;
                    count++;
                }
                bottom--;

                //bottom to top
                for(int i=bottom;i>=top;i--){
                    arr[i][left] = count;
                    count++;
                }
                left++;
            }
            return arr;
        }
}
