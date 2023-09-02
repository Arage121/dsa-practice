//https://leetcode.com/problems/beautiful-arrangement/
public class BeautifulArrangement {
        public int countArrangement(int n) { //understand this one properly
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = i + 1;
            }
            return countBeautifulArrangements(nums, n);
        }

        public int countBeautifulArrangements(int[] nums, int n) {
            if (n == 0) {
                return 1; // Found a valid arrangement
            }

            int count = 0;

            for (int i = 0; i < n; i++) {
                if (nums[i] % n == 0 || n % nums[i] == 0) {
                    swap(nums, i, n - 1);
                    count += countBeautifulArrangements(nums, n - 1);
                    swap(nums, i, n - 1);
                }
            }

            return count;
        }

        public void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
}
