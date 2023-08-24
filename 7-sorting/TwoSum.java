//https://leetcode.com/problems/two-sum/
import java.util.*;
public class TwoSum {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer,Integer> m =new HashMap<>();
            for(int i=0;i<nums.length;i++){
                int comp = target-nums[i];
                if(m.containsKey(comp)) return new int[] {m.get(comp), i};
                else m.put(nums[i], i);
            }
            return new int[] {-1, 1};
        }
}
