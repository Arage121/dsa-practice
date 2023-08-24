//https://leetcode.com/problems/sqrtx/
public class SqrtUsingBs {
        public int mySqrt(int x) {
            if(x <= 1) return x;
            long s = 1;
            long e = x/2;
            long mid;
            long ans = 0;
            while(s<=e){
                mid = s+(e-s)/2;
                long tar = mid*mid;
                if(tar == x){ return (int)mid; }
                else if(tar < x){
                    s = mid+1;
                    ans = mid;
                }else{
                    e = mid-1;
                }
            }
            return (int)ans;
        }

}
