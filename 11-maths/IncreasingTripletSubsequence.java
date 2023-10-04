//https://leetcode.com/problems/increasing-triplet-subsequence/
public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int num: nums){
            if(num <= first){
                first = num;
            }else if(num <= second){
                second = num;
            }else{ // num is greater than first and second i.e found third
                return true; // found the triplet(it can be any values, it doesn't have to be consecutive)
            }
        }
        return false;
    }
}
