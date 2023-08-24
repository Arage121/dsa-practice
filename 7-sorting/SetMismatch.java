public class SetMismatch {
        public int[] findErrorNums(int[] nums) {
            cyclicSort(nums);
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=i+1) return new int[] {nums[i],i+1}; // here nums[i] is index of the element that is skipped for e.g
                // in 1,2,2,4,5  2 is in place of 3, therefor nums[i]=2 is index of 3, and i+1 = 3 is element value that should be there
            }

            return new int[] {-1,-1};
        }

        public void cyclicSort(int[] nums){
            int j=0;
            while(j<nums.length){
                int correctIndex = nums[j]-1;
                if(nums[j] != nums[correctIndex]){ // if any nums[i] == nums.length, then we will igonre it so at the end it will automatically go to end
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
