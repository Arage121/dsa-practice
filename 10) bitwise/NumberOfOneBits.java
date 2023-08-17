//https://leetcode.com/problems/number-of-1-bits/
public class NumberOfOneBits {
    public int hammingWeight(int n) {
            int count = 0;
            while(n!=0){
                count += n&1;//check the least significant bit
                n >>>= 1;
            }
            return count;
        }
}
