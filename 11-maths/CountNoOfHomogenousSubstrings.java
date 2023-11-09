//https://leetcode.com/problems/count-number-of-homogenous-substrings
public class CountNoOfHomogenousSubstrings {
    public int countHomogenous(String s) { // using maths logic
        int MOD = 1000000007;
        int ans = s.length();
        int count = 1;

        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)){
                ans = (ans+count)%MOD;
                count++;
            }else{
                count = 1;
            }
        }
        return ans;
    }
}
