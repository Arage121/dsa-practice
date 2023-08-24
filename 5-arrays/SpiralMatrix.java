//https://leetcode.com/problems/spiral-matrix/
import java.util.ArrayList;
import java.util.List;
public class SpiralMatrix {
        public List<Integer> spiralOrder(int[][] matrix) {
            ArrayList<Integer> list = new ArrayList<>();
            int row = matrix.length;
            int col = matrix[0].length;
            int top = 0;
            int right = col - 1;
            int bottom = row - 1;
            int left = 0;

            while (list.size() < row * col) {

                //left to right
                for (int i = left; i <= right && list.size() < row * col; i++) {
                    list.add(matrix[top][i]); //top row
                }
                top++;

                //top to bottom
                for (int i = top; i <= bottom && list.size() < row * col; i++) {
                    list.add(matrix[i][right]);
                }
                right--;

                //right to left
                for (int i = right; i >= left && list.size() < row * col; i--) {
                    list.add(matrix[bottom][i]); //bottom row
                }
                bottom--;

                //bottom to top
                for (int i = bottom; i >= top && list.size() < row * col; i--) {
                    list.add(matrix[i][left]);
                }
                left++;

            }
            return list;
    }

}
