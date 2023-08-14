//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
public class FindMinInRotatedSortedArr {
        public int findMin(int[] nums) {
            int s = 0;
            int e = nums.length-1;
            while(s<e){
                int m = s+(e-s)/2;
                if(nums[m] < nums[e]) e = m; // The right half is sorted, so the minimum must be in the left half
                else s = m+1; // The left half is sorted, so the minimum must be in the right half
            }
            return nums[s];
        }
}
