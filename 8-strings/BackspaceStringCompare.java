//https://leetcode.com/problems/backspace-string-compare/
public class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb = new StringBuilder();
        StringBuilder st = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '#'){
                if(sb.length() > 0) sb.deleteCharAt(sb.length()-1); // if next element is # in char, //we will delete the previous char(which will be last added to sb)
            }else{
                sb.append(s.charAt(i));
            }
        }

        for(int i=0;i<t.length();i++){
            if(t.charAt(i) == '#'){
                if(st.length() > 0) st.deleteCharAt(st.length()-1); // if next element is # in char, //we will delete the previous char(which will be last added to sb)
            }else{
                st.append(t.charAt(i));
            }
        }
        return sb.toString().equals(st.toString());
    }
}
