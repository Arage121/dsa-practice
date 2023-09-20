//https://leetcode.com/problems/longest-nice-subarray/
public class SlidingWindowApproach {
public int longestNiceSubarray(int[] nums) {//understand this one properly
        int start = 0,
        maxLen = 1, subarrayOR = 0;

        for (int i = 0; i < nums.length; i++) {

        while ((subarrayOR & nums[i]) != 0) {
        subarrayOR ^= nums[start++];
        }

        subarrayOR |= nums[i];

        int currLen = i - start + 1;
        maxLen = Math.max(maxLen, currLen);
        }

        return maxLen;
    }
}