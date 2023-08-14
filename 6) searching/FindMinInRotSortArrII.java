//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
public class FindMinInRotSortArrII {
        public int findMin(int[] nums) {
            int s = 0;
            int e = nums.length-1;
            while(s<e){
                int m = s+(e-s)/2;
                if(nums[m] < nums[e]) e = m; // The right half is sorted, so the minimum must be in the left half
                else if(nums[m] > nums[e]) s = m+1; // The left half is sorted, so the minimum must be in the right half
                else e--;
            }
            return nums[s];
        }
}
