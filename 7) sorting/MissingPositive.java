//https://leetcode.com/problems/kth-missing-positive-number/
public class MissingPositive {

        public int findKthPositive(int[] arr, int k) {
            int missingCount = 0;
            int currentNumber = 1; // Start from the first positive integer

            for (int i = 0; i < arr.length; currentNumber++) {
                if (arr[i] != currentNumber) {
                    missingCount++;
                    if (missingCount == k) {
                        return currentNumber;
                    }
                } else {
                    i++;
                }
            }

            // If kth missing number is beyond the elements in arr
            return arr[arr.length - 1] + (k - missingCount);
        }
}
