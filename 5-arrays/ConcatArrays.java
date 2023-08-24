//https://leetcode.com/problems/concatenation-of-array/submissions/
public class ConcatArrays {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int m = 2*n;
        int[] ans = new int[m];
        for(int i=0;i<n;i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}
