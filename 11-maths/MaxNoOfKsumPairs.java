//https://leetcode.com/problems/max-number-of-k-sum-pairs/
import java.util.*;
public class MaxNoOfKsumPairs {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int s = 0;
        int e = nums.length-1;
        while(s<e){
            int sum = nums[s]+nums[e];
            if(sum == k){
                count++;
                s++;
                e--;
            }else if(sum < k){
                s++;
            }else{
                e--;
            }
        }
        return count;
    }
}
