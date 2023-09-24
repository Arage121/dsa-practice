//https://practice.geeksforgeeks.org/problems/find-duplicates-in-an-array/1
import java.util.*;
public class FindDuplicatesInArr {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        Arrays.sort(arr);
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<n;i++){
            if(arr[i-1] == arr[i]){
                count++;
                if(count == 1){
                    list.add(arr[i]);
                }
            }else{
                count = 0;
            }
        }
        if(list.isEmpty()) list.add(-1);
        return list;
        /** another way
         * ArrayList<Integer> list = new ArrayList<>();
         *         for(int i=0;i<n;i++){
         *             arr[arr[i]%n] = arr[arr[i]%n] + n;
         *         }
         *         boolean check = false;
         *         for(int i=0;i<n;i++){
         *             if(arr[i] >= 2*n){
         *                 check = true;
         *                 list.add(i);
         *             }
         *         }
         *
         *         if(!check) list.add(-1);
         *         return list;
         */
    }
}
