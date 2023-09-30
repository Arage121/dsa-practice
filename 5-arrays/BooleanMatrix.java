//https://practice.geeksforgeeks.org/problems/boolean-matrix-problem-1587115620/1
public class BooleanMatrix {
    //Function to modify the matrix such that if a matrix cell matrix[i][j]
    //is 1 then all the cells in its ith row and jth column will become 1.
    static void booleanMatrix(int matrix[][])
    {
        int r = matrix.length;
        int c = matrix[0].length;

        boolean[] rows = new boolean[r];
        boolean[] cols = new boolean[c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j] == 1){
                    rows[i] = true; // mark the points where it should be 1
                    cols[j] = true;
                }
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(rows[i] || cols[j]){
                    matrix[i][j] = 1;
                }
            }
        }
    }
}
