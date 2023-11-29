//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
public class RemoveAllAdjacentDuplicatesInString {
    public String removeDuplicates(String s) {
        char[] stack = new char[s.length()];
        int j = 0; // for stack array
        for(int i=0;i<s.length();i++){
            char current_char = s.charAt(i);
            if(j>0 && stack[j-1] == current_char){
                j--; // removing the top of stack as it's equal to next element i.e adjacent two elements
            }else{
                stack[j] = current_char; // otherwise pushing it to stack
                j++;
            }
        }
        return new String(stack, 0, j);
    }
}
