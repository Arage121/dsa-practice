//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class PeakIndiexInMountainArr {
        public int peakIndexInMountainArray(int[] arr) {
            int n = arr.length;
            int s = 0;
            int e = n-1;
            while(s<e){
                int m = s+(e-s)/2;
                if(arr[m] > arr[m+1]) e=m;
                else s=m+1;
            }
            return s;
        }
}
