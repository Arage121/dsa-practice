//https://leetcode.com/problems/minimum-number-of-operations-to-make-array-continuous/
import java.util.Arrays;

public class MinNoOfOperationsToMakeArrContinuous {
    public int minOperations(int[] nums) { // understand this one properly
        int n = nums.length;
        int ans=n;
        Arrays.sort(nums);
        int m=1;
        int j=0;
        for(int i=1;i<n;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                nums[m]=nums[i];
                m++;
            }
        }
        for(int i=0;i<m;i++)
        {
            while(j<m && nums[j]<nums[i]+n)
            {
                j++;
            }
            ans = Math.min(ans, n-j+i);
        }
        return ans;
    }
}
