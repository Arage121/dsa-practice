//https://leetcode.com/problems/missing-number/
import java.util.*;
public class MissingNumber {
        public int missingNumber(int[] nums) {
            Arrays.sort(nums);  // we can also use here sorting algorithms instead of this helper function
            int count = 0;
            for(int i=0;i<nums.length;i++){
                if(nums[i] != count) return count;
                count++;
            }
            return count;
        }
}
