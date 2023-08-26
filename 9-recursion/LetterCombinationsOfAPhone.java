//https://leetcode.com/problems/letter-combinations-of-a-phone-number/
import java.util.*;
public class LetterCombinationsOfAPhone {
    public List<String> letterCombinations(String D) {
        if(D.length()==0){
            ArrayList<String> str = new ArrayList<>();
            return str;
        }
        return letters("",D);
    }

    public ArrayList<String> letters(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0)-'0';
        int i=(digit - 2) * 3;
        if( digit > 7) i+=1;
        int len=i + 3;
        if( digit == 7 || digit == 9) len+=1;
        ArrayList<String> ans = new ArrayList<>();
        for(;i< len; i++)
        {
            char ch= (char) ('a' + i);
            ans.addAll(letters(p + ch, up.substring(1)));
        }
        return ans;
    }
}
