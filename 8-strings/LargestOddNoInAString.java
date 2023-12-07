//https://leetcode.com/problems/largest-odd-number-in-string/
public class LargestOddNoInAString {
    public String largestOddNumber(String num) {
        if((int)num.charAt(num.length()-1)%2==1) return num;
        int n = num.length();
        for(int i=n-1;i>=0;i--){
            int val = num.charAt(i);
            if(val%2==1){
                return num.substring(0, i+1);
            }
        }
        return "";
    }
}
