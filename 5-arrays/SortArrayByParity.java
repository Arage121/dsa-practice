//https://leetcode.com/problems/sort-array-by-parity/
public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int s = 0;
        int e = nums.length-1;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                arr[s] = nums[i];
                s++;
            }else{
                arr[e] = nums[i];
                e--;
            }
        }
        return arr;
    }
}
