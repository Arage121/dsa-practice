//https://leetcode.com/problems/binary-search/
public class BinarySearch {
        public int search(int[] nums, int target) {
            if (nums == null || nums.length == 0) {
                return -1; // Handle empty array
            }
            return bs(nums, target, 0, nums.length-1);
        }
        public int bs(int[] arr, int tar, int s, int e){
            if(s>e) return -1;
            int m = s+(e-s)/2;
            if(arr[m]==tar) return m;
            else if(arr[m]<tar) return bs(arr, tar, m+1, e);
            else return bs(arr, tar, s, m-1);
        }
}
