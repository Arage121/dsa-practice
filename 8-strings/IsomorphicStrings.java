//https://www.geeksforgeeks.org/problems/isomorphic-strings-1587115620/1
import java.util.*;
public class IsomorphicStrings {
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        if (str1.length() != str2.length()) {
            return false; // Different lengths cannot be isomorphic
        }

        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            // Check mapping from str1 to str2
            if (map1.containsKey(char1)) {
                if (map1.get(char1) != char2) {
                    return false;
                }
            } else {
                map1.put(char1, char2);
            }

            // Check mapping from str2 to str1
            if (map2.containsKey(char2)) {
                if (map2.get(char2) != char1) {
                    return false;
                }
            } else {
                map2.put(char2, char1);
            }
        }

        return true;
    }
}
