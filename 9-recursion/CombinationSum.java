//https://leetcode.com/problems/combination-sum/
import java.util.*;
public class CombinationSum {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> list = new ArrayList<>();
            ArrayList<Integer> ans = new ArrayList<>();
            helper(list, ans, candidates, 0, 0, target);
            return list;
        }

        public void helper(List<List<Integer>> list, ArrayList<Integer> ans, int[] arr, int sum, int start, int target){
            if(sum > target){
                return;
            }

            if(sum == target){
                list.add(new ArrayList<>(ans));
            }

            for(int i=start;i<arr.length;i++){
                ans.add(arr[i]);
                helper(list, ans, arr, sum+arr[i], i, target);
                ans.remove(ans.size()-1);
            }
       }
}
