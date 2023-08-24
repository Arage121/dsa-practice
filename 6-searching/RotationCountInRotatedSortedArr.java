//https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
public class RotationCountInRotatedSortedArr {
    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
        System.out.println(countRotation(arr));
    }
    public static int countRotation(int[] arr){
        int pivot = findPivot(arr);
        return pivot+1; // as the array is gonna rotate pivot+1 times i.e index value of pivot
    }

    //the below method for finding pivot will not work if there are duplicate values present in the array
    public static int findPivot(int[] nums){
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
    public static int findPivotWithDuplicates(int[] arr){
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
