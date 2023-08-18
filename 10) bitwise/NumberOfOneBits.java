//https://leetcode.com/problems/number-of-1-bits/
public class NumberOfOneBits {
    public int hammingWeight(int n) {
        int count = 0;
        while(n!=0){
            if((n & 1) == 1) count++; // least significant bit, check 1 is there or not
            n >>>= 1; // if not there it will remove and in it's place another left value comes and this goes on
        }
        return count;
        /*
        Another way
        int count = 0;
        while(n!=0){
        count++; // debug this only then u can understand this code
        n = n&(n-1);
       }
       return count;
         */
    }
}
