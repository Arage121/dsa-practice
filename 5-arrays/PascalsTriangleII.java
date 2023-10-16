//https://leetcode.com/problems/pascals-triangle-ii/
import java.util.*;
public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> row = new ArrayList<>();

            if (i == 0) {
                row.add(1);
            } else {
                List<Integer> prevRow = triangle.get(i - 1);

                row.add(1); // First element in a row is always 1
                for (int j = 1; j < i; j++) {
                    int sum = prevRow.get(j - 1) + prevRow.get(j);
                    row.add(sum);
                }
                row.add(1); // Last element in a row is always 1
            }

            triangle.add(row);
        }

        return triangle.get(rowIndex);
    }
}
