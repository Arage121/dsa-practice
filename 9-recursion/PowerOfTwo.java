//https://leetcode.com/problems/power-of-two/
public class PowerOfTwo {
        public boolean isPowerOfTwo(int n) {
            if(n<=0) return false;
            return (n & (n-1)) == 0;    // because in binary only numbers who have 10000, starting at 1 and all 0 are only power of two if it's like 100010 then it's not. To check, for e.g n=16 (16 & (15)) 16: 10000, 15: 01111 when we and operator this, we will receive 0 therefore it's power of two otherwise not
        }
}
