//https://leetcode.com/problems/check-if-the-sentence-is-pangram/
import java.util.*;
public class Pangram {
    public boolean checkIfPangram(String str) {
        HashSet<Character> h = new HashSet<>();
        for(int i=0;i<str.length();i++){
            h.add(str.charAt(i));
        }
        return h.size() == 26;
    }
}
