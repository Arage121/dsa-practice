//https://leetcode.com/problems/special-positions-in-a-binary-matrix/
public class SpecialPositionsInABinaryMatrix {
    public int numSpecial(int[][] mat) {
        int special_positions = 0;

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j] == 1 && isUniqueRowCol(i, j, mat)){
                    special_positions++;
                }
            }
        }
        return special_positions;
    }

    private boolean isUniqueRowCol(int row, int col, int[][] arr){
        for(int i=0;i<arr.length;i++){
            if(i!=row && arr[i][col]==1) return false;
        }

        for(int j=0;j<arr[0].length;j++){
            if(j!=col && arr[row][j]==1) return false;
        }

        return true;
    }
}
