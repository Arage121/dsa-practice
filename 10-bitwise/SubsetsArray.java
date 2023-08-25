//https://leetcode.com/problems/subsets/
import java.util.*;
public class SubsetsArray {
        public List<List<Integer>> subsets(int[] nums) { // understand this one properly
            int n = nums.length;
            List<List<Integer>> result = new ArrayList<>();

            for (int i = 0; i < (1 << n); i++) {
                List<Integer> subset = new ArrayList<>();
                for (int j = 0; j < n; j++) {
                    if ((i & (1 << j)) != 0) {
                        subset.add(nums[j]);
                    }
                }
                result.add(subset);
            }

            return result;
        }
}
