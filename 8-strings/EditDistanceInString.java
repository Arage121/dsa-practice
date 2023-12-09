//https://leetcode.com/problems/edit-distance/
public class EditDistanceInString { // dp problem(V.Imp) recursion+memoization approach
    public int minDistance(String word1, String word2) {
        int m = word1.length()-1;
        int n = word2.length()-1;
        int[][] memo = new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                memo[i][j] = -1;
            }
        }
        return getEditDistance(word1, word2, m, n, memo);
    }
    // here i, j represents the prefix of strings from 0 to i or j
    public int getEditDistance(String a, String b, int i, int j, int[][] memo){
        if(i == -1) return j+1;
        if(j == -1) return i+1; // both above are terminate conditions of recursion

        if(memo[i][j] != -1) return memo[i][j]; // memoization

        if(a.charAt(i) == b.charAt(j)){
            memo[i][j] = getEditDistance(a, b, i-1, j-1, memo);
        }else{
            memo[i][j] = 1+Math.min(getEditDistance(a, b, i-1, j-1, memo), Math.min(getEditDistance(a, b, i, j-1, memo), getEditDistance(a, b, i-1, j, memo)));
        }

// if both characters are equal then we will move to previous character than it and check them with the same process and if they are not equal than we will calculate the min no. of operations from the three operations that are replace, delete or insert (all the three operations can be done only in word1, word2 is result(can't be changed)) and we will take the min no. of operation and add 1 so that it shows how many operations have happened.

        return memo[i][j];
    }
}
