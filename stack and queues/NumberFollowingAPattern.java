import java.util.*;
public class NumberFollowingAPattern {
    static String printMinNumberForPattern(String S){ // understand this one properly
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int num = 1;

        for(int i=0;i<S.length();i++){
            st.push(num++);
            if(S.charAt(i) == 'I'){
                while(!st.empty()) sb.append(st.pop());
            }
        }
        st.push(num++);
        while(st.size() > 0) sb.append(st.pop());

        return sb.toString();
    }
}
