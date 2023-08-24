//https://leetcode.com/problems/split-array-largest-sum/
public class SplitArrLargestSum {
        public int splitArray(int[] nums, int k) {
            int s=0;
            int e=0;
            // first we will find the start and end of this array and see what we can do later to find the answer
            for(int i=0;i<nums.length;i++){
                s = Math.max(s, nums[i]); // so the starting point will be the min sum that can be in array is the max element value present in the array
                e += nums[i]; // the end point will be the max sum of the elements present in the array
            }
            // now if we see from start to end there will be only increasing sorted values, so we can apply binary search and find the answer.
            while(s<e){
                int m=s+(e-s)/2;
                int sum=0;
                int pieces=1;
                for(int num:nums){
                    if(num+sum > m){
                        // you cannot add this in this subarray, make new one
                        // say you add this num in new subarray, then sum = num
                        sum = num;
                        pieces++; // we are increasing pieces because as the condition breaks that means we will now create a new subarray(piece) below the limited value only we can create subarrays
                    }
                    else{
                        sum += num;
                    }
                }
                if(pieces > k){
                    s=m+1;
                }else{
                    e=m;
                }
            }
            return s; // you can return either start or end because both will pointing to same value
        }
}
