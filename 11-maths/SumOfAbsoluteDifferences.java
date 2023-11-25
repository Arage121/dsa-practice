//https://leetcode.com/problems/sum-of-absolute-differences-in-a-sorted-array/
public class SumOfAbsoluteDifferences {
    public int[] getSumAbsoluteDifferences(int[] nums) { // pure logic and maths
        int n = nums.length;
        int[] ans = new int[n];
        int lsum = 0;
        int lnum = 0;

        // Calculate the initial right sum and right num
        int rsum = 0;
        int rnum = n;

        for (int num : nums) {
            rsum += num;
        }

        for (int i = 0; i < n; i++) {
            ans[i] = lnum * nums[i] - lsum + rsum - rnum * nums[i];

            // Update left sum and left num
            lsum += nums[i];
            lnum++;

            // Update right sum and right num
            rsum -= nums[i];
            rnum--;
        }

        return ans;
    }
}
