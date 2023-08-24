//https://leetcode.com/problems/valid-perfect-square/
public class PerfectSquare {
        public boolean isPerfectSquare(int num) {
            long s=0,e=num;
            while(s<=e){
                long m = s+(e-s)/2;
                if(m*m == num) return true;
                else if(m*m > num) e = m-1;
                else s = m+1;
            }
            return false;
        }
}
