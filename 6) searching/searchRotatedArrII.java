//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
public class searchRotatedArrII {
    public static boolean search(int[] nums, int target) {
            // ArrayList<Integer> l = new ArrayList<>();
            // for(int num:nums){
            //     l.add(num);
            // }
            // return l.contains(target); possible answer but not good as time complexity is not less
            int low = 0, high = nums.length - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (nums[mid] == target) {
                    return true;
                }
                if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                    low++;
                    high--;
                    continue;
                }
                if (nums[low] <= nums[mid]) {
                    if (nums[low] <= target && target <= nums[mid]) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                } else {
                    if (nums[mid] <= target && target <= nums[high]) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
            }
            return false;
        }
}
