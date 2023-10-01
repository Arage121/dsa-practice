//https://practice.geeksforgeeks.org/problems/boundary-traversal-of-matrix-1587115620/1
import java.util.*;
public class BoundaryTraversalOfMatrix {
    //Function to return list of integers that form the boundary
    //traversal of the matrix in a clockwise manner.
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<m;i++) ans.add(matrix[0][i]);
        for(int i=1;i<n;i++) ans.add(matrix[i][m-1]);
        if(n>1) for(int i=m-2;i>=0;i--) ans.add(matrix[n-1][i]); // we have to put conditions because if there is only 1d array
        if(m>1) for(int i=n-2;i>0;i--) ans.add(matrix[i][0]);
        return ans;
    }
}
