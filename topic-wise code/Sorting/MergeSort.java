import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8,3,4,12,5,6};
        mergeSortInPlace(arr, 0, arr.length-1); // by using this original array is changing
//        arr = mergeSort(arr); // we are changing the values of original array by storing the resultant array from the functions
        System.out.println(Arrays.toString(arr));
    }

    public static int[] mergeSort(int[] arr){
        if(arr.length == 1) return arr;
        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid)); // this is creating new objects for every function call, the original arr is not changing
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length)); // it is only making the copy of values of original array and sorting them

        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {
        int[] ans = new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length && j<right.length){ // if any of the array ends then loop will terminate, for remaining
            // elements if any array has them we will separately add them at last
            if(left[i]<right[j]) {
                ans[k] = left[i];
                i++;
            }
            else{
                ans[k] = right[j];
                j++;
            }
            k++;
            }
        // it may be possible that one of the arrays has not been gone through till its full length, i.e it can have some remaining elements
        while(i< left.length){
            ans[k] = left[i];
            i++;
            k++;
        }

        while(j<right.length){
            ans[k] = right[j];
            j++;
            k++;
        }

        return ans;
        }

    public static void mergeSortInPlace(int[] arr, int s, int e){ // this is a different way than above of merge Sort, in this we will sort the original array
        if(e-s == 1) return;
        int mid = (s+e)/2;

        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, arr.length);

        mergeInPlace(arr, s, mid, e);
    }

    public static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] ans = new int[e-s];
        int i=s;
        int j=m;
        int k=0;
        while(i<m && j<e){
            if(arr[i]<arr[j]) {
                ans[k] = arr[i];
                i++;
            }
            else{
                ans[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i< m){
            ans[k] = arr[i];
            i++;
            k++;
        }

        while(j<e){
            ans[k] = arr[j];
            j++;
            k++;
        }

        for(int l=0;l<ans.length;l++){
            arr[s+l] = ans[l]; // modifying original array values with sorted ans one
        }
    }
}
