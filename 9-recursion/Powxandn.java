//https://leetcode.com/problems/powx-n/
public class Powxandn {
        public double myPow(double x, int n) { // understand this one properly
            if(n==0) return 1.0;
            double half=Math.pow(x,n/2);    // used mathematics here, see testcases in leetcode u will understand
            if(n%2==0) return half*half;
            else if(n>0) return half*half*x;
            else return half*half/x;
        }
}
