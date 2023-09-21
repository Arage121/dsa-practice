//https://practice.geeksforgeeks.org/problems/count-the-triplets4615/1
import java.util.*;
public class CountTheTriplets {
    public int countTriplet(int arr[], int n) {
        int count = 0;
        Arrays.sort(arr);
        for(int k=n-1;k >= 2;k--){
            int i=0;
            int j=k-1;
            while(i<j){
                if(arr[i]+arr[j] == arr[k]){
                    count++;
                    i++;
                    j--;
                }else if(arr[i]+arr[j] < arr[k]){
                    i++;
                }else{
                    j--;
                }
            }
        }
        return count;
    }
}
