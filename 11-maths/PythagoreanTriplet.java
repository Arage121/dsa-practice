//https://www.geeksforgeeks.org/problems/pythagorean-triplet3018/1
import java.util.Arrays;
public class PythagoreanTriplet {
    boolean checkTriplet(int[] arr, int n) {
        Arrays.sort(arr);
        for(int i=n-1;i>=2;i--){
            int val = arr[i]*arr[i];
            int s = 0;
            int e = i-1;
            while(s<e){
                int sum = arr[s]*arr[s] + arr[e]*arr[e];
                if(sum == val) return true;
                else if(sum < val) s++;
                else e--;
            }
        }
        return false;
    }
}
