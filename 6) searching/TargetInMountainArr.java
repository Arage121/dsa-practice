//https://leetcode.com/problems/find-in-mountain-array/
public class TargetInMountainArr {
    /**
     * // This is MountainArray's API interface.
     * // You should not implement it, or speculate about its implementation
     * interface MountainArray {
     *     public int get(int index) {}
     *     public int length() {}
     * }
     */

// for this question first we will find the peak element in the array, and then simply we will use orderAgnostic binary search for both parts before the peak and after the peak to find the target.

    interface MountainArray {
       public static int get(int index) { return -1;} // this is a sample interface, the real is provided in leetcode automatically by the system
        public static int length() { return -1;}
      }
        public int findInMountainArray(int target, MountainArray mountainArr) {
            int peak = peakElement(mountainArr);
            int firstPartBeforePeak = orderAgnoBs(mountainArr, target, 0, peak);
            if(firstPartBeforePeak != -1){
                return firstPartBeforePeak;
            }
            //try to search in second half
            return orderAgnoBs(mountainArr, target, peak+1, mountainArr.length()-1);
        }

        public int peakElement(MountainArray nums){
            int s=0;
            int e=nums.length()-1;
            while(s<e){
                int m = s+(e-s)/2;
                if(nums.get(m) < nums.get(m+1)) s = m+1;
                else e = m;
            }
            return s;
        }

        public static int orderAgnoBs(MountainArray nums, int target, int start, int end) {
            boolean isAsc = nums.get(start) < nums.get(end); // to check if arr is ascending or descending
            while (start <= end) {
                int mid = start + (end - start) / 2;
                int mval = nums.get(mid);
                if (target == mval) return mid;

                if (isAsc) {  // according to the order of array we will do binary search, and this is called as order agnostic binary search.
                    if (target < mval) end = mid - 1;  // ascending array
                    else if (target > mval) start = mid + 1;
                } else {
                    if (target < mval) start = mid + 1; // descending array
                    else if (target > mval) end = mid - 1;
                }
            }
            return -1;
        }
}
