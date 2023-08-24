//https://leetcode.com/problems/missing-number/
class Solution {
    public int missingNumber(int[] nums) {
        cyclicSort(nums);
        int i=0;
        while(i<nums.length){
            if(nums[i]!=i) return i;
            else i++;
        }
        return nums.length;
    }

    public void cyclicSort(int[] nums){
        int j=0;
        while(j<nums.length){
            int correctIndex = nums[j];
            if(nums[j] < nums.length &&  nums[j] != nums[correctIndex]){ // if any nums[i] == nums.length, then we will igonre it so at the end it will automatically go to end
                swap(nums, j, correctIndex);
            }else{
                j++;
            }
        }
    }

    public void swap(int[] nums, int s, int e){
        int temp = nums[s];
        nums[s] = nums[e];
        nums[e] = temp;
    }
}