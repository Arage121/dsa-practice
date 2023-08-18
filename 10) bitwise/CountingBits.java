//https://leetcode.com/problems/counting-bits/
public class CountingBits {
        public int[] countBits(int n) {
            int[] arr = new int[n+1];
            arr[0] = 0;
            for(int i=1;i<n+1;i++){
                int a = i;
                int count = 0;
                while(a != 0){
                    count += a&1;
                    a >>>= 1;
                }
                arr[i] = count;
            }
            return arr;
        }
}
