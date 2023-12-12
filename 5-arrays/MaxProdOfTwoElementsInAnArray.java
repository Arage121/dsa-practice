//https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
public class MaxProdOfTwoElementsInAnArray {
    public int maxProduct(int[] nums) {
        int max = 0;
        int second_max = 0;
        for(int i=0;i<nums.length;i++){
            if(max < nums[i]){
                second_max = max;
                max = nums[i];
            }else if(second_max < nums[i]){
                second_max = nums[i];
            }
        }
        int ans = (max-1)*(second_max-1);
        return ans;
    }
}
