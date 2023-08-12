//https://leetcode.com/problems/power-of-two/
public class PowerOfTwo {
        public boolean isPowerOfTwo(int n) {
            if(n <= 0) return false; // negative values and 0 is not any value of 2 to the power something
            if(n == 1) return true; // for 2 to the power 0 is 1
            if(n%2==1) return false; // odd numbers can't be output of 2 to the power anything
            return isPowerOfTwo(n/2);
        }
}
