public class MissingNumber {
    public int missingNumber(int[] nums) {
        int missing = nums.length; // Initialize missing as n
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i]; // if the number is already present it will cancel out with missing , and at last missing will contain the ans
        }
        return missing;
    }
}
