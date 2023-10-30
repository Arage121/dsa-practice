//https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/
import java.util.*;
public class SortByNoOfOneBits {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(sortByBits(arr)));
    }
    public static int[] sortByBits(int[] arr) {
        for(int i=0;i<arr.length;i++){
            arr[i] += Integer.bitCount(arr[i])*10001; // bitcount will give the no. of 1 bits in binary representation of each no in arr
        }

        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i]%10001;
        }
        return arr;
    }
}
