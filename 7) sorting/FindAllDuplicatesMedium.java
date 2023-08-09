//https://leetcode.com/problems/find-all-duplicates-in-an-array/
import java.util.*;
public class FindAllDuplicatesMedium {
        public List<Integer> findDuplicates(int[] nums) {
            int i=0;
            while(i<nums.length){
                int correct=nums[i]-1;
                if(nums[i]!=nums[correct]) swap(nums, i, correct);
                else i++;
            }

            ArrayList<Integer> arr = new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if(nums[j]!=j+1) arr.add(nums[j]);
            }
            return arr;
        }

        public void swap(int[] arr, int s, int e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
        }
}
