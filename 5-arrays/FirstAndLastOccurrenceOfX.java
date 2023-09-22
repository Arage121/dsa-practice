//https://practice.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1
import java.util.*;
public class FirstAndLastOccurrenceOfX {
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        int first = firstOccurrence(arr, n, x);
        int last = lastOccurrence(arr, n, x);
        ans.add(first);
        ans.add(last);
        return ans;
    }

    int firstOccurrence(int arr[], int n, int x){
        int low = 0;
        int high = n-1;
        int res = -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == x){
                res = mid;
                high = mid-1; // keep searching on left as we have to find the first occurence of x
            }else if(arr[mid] < x){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return res;
    }

    int lastOccurrence(int arr[], int n, int x){
        int low = 0;
        int high = n-1;
        int res = -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == x){
                res = mid;
                low = mid+1; // keep searching on right as we have to find the last occurence of x
            }else if(arr[mid] < x){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return res;
    }
}