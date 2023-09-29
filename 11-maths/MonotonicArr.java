//https://leetcode.com/problems/monotonic-array/
public class MonotonicArr {
    public boolean isMonotonic(int[] arr) {
        int n = arr.length;
        int Icount = 0;
        int Dcount = 0;
        for(int i=0;i<n;i++){
            if(i+1<n && arr[i] <= arr[i+1]) Icount++;
            if(i+1<n && arr[i] >= arr[i+1]) Dcount++;
        }

        if(Icount == n-1 || Dcount == n-1) return true;
        return false;
    }
}
