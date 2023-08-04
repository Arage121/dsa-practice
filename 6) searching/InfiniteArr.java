//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
// In this question we can't use arr.length function as it will be cheating because the size of array is infinite
public class InfiniteArr {
    public static void main(String[] args) {
        //we will solve this by using normal binary search only, but for that we need to know the start and end value to apply binary search.
        //we will take chunks by chunks of infinte array, and every time we will take the double of previous chunk and apply bs if target < arr[end], if not we will continue to double the search range.
        //as if target is small than end means target is present before it.
        //as we are not using the length of arr, so it is assuming that it is an infinite array
        int[] arr = {3, 5, 7, 9, 10, 90,
        100, 130, 140, 160, 170};
        int target = 170;
        System.out.println(ans(arr, target));
    }

    public static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        //condition for the target to lie in range
        while(target > arr[end]){
            int newStart = end+1; // because then only we will leave the previous checked values and start from after the end position
            //double the box value for the new box
            //end = previous end + (size of box)*2;
            end =  end + (end-start+1)*2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    public static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start+(end-start)/2;
            if(target == arr[mid]) return mid;
            else if(target > arr[mid]) start = mid+1;
            else end = mid-1;
        }
        return -1;
    }
}
