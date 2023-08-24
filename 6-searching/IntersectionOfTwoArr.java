//https://leetcode.com/problems/intersection-of-two-arrays/
import java.util.*;
public class IntersectionOfTwoArr {
        public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> set = new HashSet<>();
            ArrayList<Integer> arr = new ArrayList<>();

            for (int num : nums1) {
                set.add(num);
            }

            for (int num : nums2) {
                if (set.contains(num)) {
                    arr.add(num);
                    set.remove(num); // To avoid duplicates in the result
                }
            }

            int[] nums = new int[arr.size()];
            for (int i = 0; i < arr.size(); i++) {
                nums[i] = arr.get(i);
            }

            return nums;
        }
}
