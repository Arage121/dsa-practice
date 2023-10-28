import java.util.*;
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // in hashmap we will store array values as key, and their index as values bcz we wanna print the index as output
// the basic idea is like we will check the target-nums[i] is present in map or not, if it's not present then we will simply add the current val of nums and its index and if it's present then it means we have found the pair we will get it's index by containsKey method of map with it we will return the current index
        for(int i=0;i<nums.length;i++){
            int comp = target-nums[i];
            if(map.containsKey(comp)){
                return new int[] {map.get(comp), i};
            }
            else {map.put(nums[i], i);}
        }
        return new int[]{-1, -1};
    }
}
