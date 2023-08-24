//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FirsttandLastPos {
        public int[] searchRange(int[] nums, int target) {
            int[] ans = {-1,-1};
            ans[0] = binarySearch(nums, target, true);
            if(ans[0] != -1){
                ans[1] = binarySearch(nums, target, false);
            }
            return ans;
        }
        public int binarySearch(int[] nums, int target, boolean startIndex){
            int s = 0;
            int e = nums.length-1;
            int m;
            int ans = -1;
            while(s<=e){
                m = s+(e-s)/2;
                if(nums[m] == target){
                    ans = m;  //possible answer is found , but we are looking for the first index of target and its last index
                    if(startIndex){
                        e = m-1; // finding for first index, as it will be in left side
                    }
                    else{
                        s = m+1; // finding for last index of target as it will be in right side
                    }
                }
                else if(nums[m] < target) s = m+1;
                else e = m-1;
            }
            return ans;
        }
}
