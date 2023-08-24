//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
import java.util.*;
public class FindAllMissingNumbersInArr {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            //cyclic sort
            int i=0;
            while(i<nums.length){
                int correct = nums[i]-1;
                if(nums[i]!=nums[correct]) swap(nums, i, correct);
                else i++;
            }

            // find the missing numbers and add them to the arraylist
            ArrayList<Integer> arr = new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if(nums[j]!=j+1) arr.add(j+1);
            }
            return arr;
        }

        public void swap(int[] nums, int s, int e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
        }
}
