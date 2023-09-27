//https://practice.geeksforgeeks.org/problems/find-the-closest-pair-from-two-arrays4215/1
import java.util.*;
public class ClosestPair {
    public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
        ArrayList<Integer> list = new ArrayList<>();
        int s = 0;
        int e = m-1;
        int diff = Integer.MAX_VALUE;
        while(s<n && e>=0){
            int sum = arr[s]+brr[e];
            if(Math.abs(sum-x) < diff){ // there should be very less difference between sum and x, then only we will find closest pairs
                list.clear();
                list.add(arr[s]);
                list.add(brr[e]);
                diff = Math.abs(sum-x); //update the difference
            }else if(sum > x){
                e--; // decrease the sum
            }else{
                s++;
            }
        }
        return list;
    }
}
