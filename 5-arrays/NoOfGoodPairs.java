//https://leetcode.com/problems/number-of-good-pairs/
public class NoOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {//understand the logic
        int maxNum = 0;
        for (int num : nums) {
            maxNum = Math.max(maxNum, num);
        }

        int[] countArray = new int[maxNum + 1];
        int count = 0;

        for (int num : nums) {
            count += countArray[num];
            countArray[num]++;
        }

        return count;
    }
}
