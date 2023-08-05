//https://leetcode.com/problems/single-element-in-a-sorted-array/
public class SingleDistinctInSortedArr {
        public int singleNonDuplicate(int[] nums) {
            int s = 0;
            int e = nums.length-1;
            while(s<e){
                int m = s+(e-s)/2;
                if(m%2 == 1) m--;
                if(nums[m] !=nums[m+1]) e = m; // the single element is on the left side
                else s = m+2; //the single element is on right side
            }
            return nums[s]; // you can return either nums[e] or nums[s] because at last both will be pointing to same value which is different than every other as the question has asked
        }
}
