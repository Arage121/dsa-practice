//https://leetcode.com/problems/find-the-duplicate-number/
public class FindDuplicateNo {
        public int findDuplicate(int[] nums) {
            // simple cyclic sort, and some logic to get answer
            int i=0;
            while(i<nums.length){
                int correct = nums[i]-1;
                if(nums[i]!=nums[correct]){
                    swap(nums, i, correct);
                }
                else{i++;}
            }

            for(int j=0;j<nums.length;j++){
                if(nums[j]!=j+1) return nums[j];
            }
            return -1;
        }

        public void swap(int[] nums, int s, int e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
        }
}
