//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class SearchInRotatedSortedArr {
        public int search(int[] nums, int target) {
            int pivot = findPivot(nums);
            if(pivot == -1) return bs(nums, target, 0, nums.length-1); //if you doesn't find pivot , then it means array is not rotated and you can use normal binary search directly to find the target.
            // if pivot is found, you have found 2 asc sorted arrays
            if (nums[pivot] == target) {
                return pivot;
            }

            if(target >= nums[0]){  // if target is greater than start, that means we will search till pivot as it is the largest in rotated array.
                return bs(nums, target, 0, pivot);
            }
            return bs(nums, target, pivot+1, nums.length-1);
        }

        public int bs(int[] nums, int target, int s, int e){
            while(s<=e){
                int m = s+(e-s)/2;
                if(target == nums[m]) return m;
                else if(target > nums[m]) s=m+1;
                else e=m-1;
            }
            return -1;
        }

        //the below method for finding pivot will not work if there are duplicate values present in the array
        public int findPivot(int[] nums){
            int s=0;
            int e=nums.length-1;
            while(s<=e){
                int m = s+(e-s)/2;
                //4 cases to find pivot in sorted array, only when there is no duplicate values present in the array
                if(m < e && nums[m] > nums[m+1]) return m;
                else if(m > s && nums[m] < nums[m-1]) return m-1;
                else if(nums[m] <= nums[s]) e = m-1;
                else s = m+1;
            }
            return -1;
        }

        //finding pivot if the array has duplicate values
        public int findPivotWithDuplicates(int[] arr){
            int s=0;
            int e=arr.length-1;
            while(s<=e){
                int m = s+(e-s)/2;
                if(m<e && arr[m] > arr[m+1]) return m;
                else if(m>s && arr[m] < arr[m-1]) return m-1;

                //if elements at middle,start, end are equal then just skip the duplicates
                if(arr[m] == arr[s] && arr[m] == arr[e]){
                    //skip the duplicates
                    // NOTE: what if these elements at start and end were the pivot??
                    // check if start is pivot
                    if(s<e && arr[s] > arr[s+1]){
                        return s;
                    }
                    s++;

                    // check whether end is pivot
                    if(e>s && arr[e] < arr[e-1]){
                        return e-1;
                    }
                    e--;
                }
                // left side is sorted, so pivot should be in right
                else if(arr[s]<arr[m] || arr[s]==arr[m] && arr[m]>arr[e]){
                    s=m+1;
                }else{
                    e=m-1;
                }
            }
                return -1;
        }
}
