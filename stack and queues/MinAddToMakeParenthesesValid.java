//https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
import java.util.*;
public class MinAddToMakeParenthesesValid { // this one is optimized
    public int minAddToMakeValid(String s) {
        int countA = 0;
        int countB = 0;

        for(char ch : s.toCharArray()){
            if(ch == '(') countA++;

            if(ch == ')'){
                if(countA > 0) countA--; // balance them if ( is there we will subtract it, and not increase the count of ) then they will be balanced
                else countB++;
            }
        }
        return countA+countB;
    }

    public int minAddToMakeValid1(String s){ // another approach using stack, but this one is taking more complexity
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == ')'){
                if(!stack.isEmpty() && stack.peek() == '(') stack.pop();
                else stack.push(ch);
            }else{
                stack.push(ch);
            }
        }
        return stack.size();
    }
}
