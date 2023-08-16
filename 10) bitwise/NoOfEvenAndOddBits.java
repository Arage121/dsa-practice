//https://leetcode.com/problems/number-of-even-and-odd-bits/
import java.util.*;
public class NoOfEvenAndOddBits {
        public int[] evenOddBit(int n) {
            ArrayList<Integer> arr = new ArrayList<>();
            while(n>0){
                arr.add(n%2);
                n /= 2;
            }
            int countEven = 0;
            int countOdd = 0;
            for(int i=0;i<arr.size();i++){
                if(i%2==0){
                    if(arr.get(i) == 1) countEven++;
                }else{
                    if(arr.get(i) == 1) countOdd++;
                }
            }
            return new int[] {countEven, countOdd};
        }
}
