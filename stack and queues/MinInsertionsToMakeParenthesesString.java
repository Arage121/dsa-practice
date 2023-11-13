//https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/
public class MinInsertionsToMakeParenthesesString { // understand it properly
    public int minInsertions(String s) {
        int right = 0;
        int left = 0;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                left++;
            }else{
                if(left ==0){
                    right++;
                }else{
                    left--;
                }
                if(i+1<s.length() && s.charAt(i+1) == ')'){
                    i++;
                }else{
                    right++;
                }
            }
        }

        return right + left*2;
    }
}
