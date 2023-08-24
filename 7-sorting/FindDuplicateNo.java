//https://leetcode.com/problems/find-the-duplicate-number/
public class FindDuplicateNo {
    public int findDuplicate(int[] nums) {
        // simple cyclic sort, and some logic to get answer
        int i = 0;
        int ans = 0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums, i, correct);
            }
            else{
                ans=nums[i]; // this will run when u will check after swapping that nums[correct] i.e. 3 == 3 means duplicate then else condition will run and will print that element
                i++;
            }
        }
        return ans;
    }

    public void swap(int[] nums, int s, int e){
        int temp = nums[s];
        nums[s] = nums[e];
        nums[e] = temp;
    }
}
