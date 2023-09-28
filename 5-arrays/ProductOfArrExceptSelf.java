//https://leetcode.com/problems/product-of-array-except-self/
public class ProductOfArrExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prod = 1;
        int zeroCount = 0;
        int[] arr = new int[n];

        // Calculate the product of all non-zero elements and count zeros
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                prod *= nums[i];
            } else {
                zeroCount++;
            }
        }

        // If there are more than one zero, all elements in the result array will be 0
        if (zeroCount > 1) {
            return new int[n];
        }

        // If there's only one zero, set its corresponding result to the product
        if (zeroCount == 1) {
            for (int i = 0; i < n; i++) {
                arr[i] = nums[i] == 0 ? prod : 0;
            }
        } else {
            // If there are no zeros, divide the product by each element
            for (int i = 0; i < n; i++) {
                arr[i] = prod / nums[i];
            }
        }

        return arr;
    }
}
