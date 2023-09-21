//https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1
import java.util.*;
public class SubarrayWithGivenSum
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        int l = 0; // left pointer
        int r = 0; // right pointer
        ArrayList<Integer> ans = new ArrayList<>();
        if(s==0){
            ans.add(-1);
            return ans;
        }
        boolean isFound = false;
        int sum = arr[0];
        while(r<n){
            if(sum == s){
                isFound = true;
                break;
            }else if(sum < s){
                r++; // move the right pointer forward and add the value of array to the sum
                if(r<n) sum += arr[r];
            }else{
                // as sum > s, then we will subtract the arr[l] value from sum, and move l to next index
                sum -= arr[l];
                l++;
            }
        }

        if(isFound){
            ans.add(l+1);
            ans.add(r+1);
            return ans;
        }
        ans.add(-1);
        return ans;
    }
}