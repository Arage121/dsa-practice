import java.util.Arrays;

public class QuickSort { //In this sort, we basically take pivot element i.e any element and we compare it with other
    // elements so that the elements that are on left hand side of pivot should be less than it, and at RHS there should be greater than pivot
    // so in this sort pivot returns to its original position.
    public static void main(String[] args) {
      int[] arr = {5,4,3,2,1};
      quick(arr, 0, arr.length-1);
      System.out.println(Arrays.toString(arr));
    }

    public static void quick(int[] arr, int low, int high){
        if(low >= high) return;
        int s = low;
        int e = high;
        int m = s+(e-s)/2;
        int pivot = arr[m]; // instead of mid element u can take any element as pivot

        while(s <= e){
            while(arr[s] < pivot){
                s++;
            }
            while(arr[e] > pivot){
                e--;
            }

            if(s<=e){
                // swapping elements as while conditions breaks because rule is violated i.e start is greater than pivot and element at end is less than pivot
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        // now pivot is at correct index, we will use recursion to solve remaining two halves before pivot and after pivot
        quick(arr, low, e);
        quick(arr, s, high);
    }
}
