public class MoveAllZeroesToEnd {
    void pushZerosToEnd(int[] arr, int n) {
        int nonZeroCount = 0;

        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[nonZeroCount++] = arr[i]; // here arr[nonZeroCount++] = arr[i] basically means same as arr[nonZeroCount] = arr[i], and in next line// nonZeroCount++
            }
        }

        while(nonZeroCount < n){
            arr[nonZeroCount++] = 0;
        }
    }
}
