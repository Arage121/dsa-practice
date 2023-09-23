//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
public class RemoveDuplicatesII {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int uniqueIndex = 2; // Start with the third element (allow at most two duplicates)

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex - 2]) {
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }

        return uniqueIndex;
    }
}
