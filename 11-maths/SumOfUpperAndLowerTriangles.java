//https://www.geeksforgeeks.org/problems/sum-of-upper-and-lower-triangles-1587115621/1
import java.util.*;
public class SumOfUpperAndLowerTriangles {
    //Function to return sum of upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
        ArrayList<Integer> result = new ArrayList<>();
        int upperSum = 0;
        int lowerSum = 0;
        // simply dry run the code u will know how it's working
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                upperSum += matrix[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                lowerSum += matrix[i][j];
            }
        }

        result.add(upperSum);
        result.add(lowerSum);

        return result;
    }
}
