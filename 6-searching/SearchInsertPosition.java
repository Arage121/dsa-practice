//https://leetcode.com/problems/search-insert-position/
public class SearchInsertPosition {
        public int searchInsert(int[] nums, int target) {
            for(int i=0;i<nums.length;i++){
                if(target<=nums[i]) return i;
            }
            return nums.length;
        }
}
