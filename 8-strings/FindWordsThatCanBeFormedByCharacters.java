//https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/
import java.util.*;
public class FindWordsThatCanBeFormedByCharacters {
    public int countCharacters(String[] words, String chars) {
        int goodWordLength = 0;
        int[] char_count = new int[26];

        for(char c: chars.toCharArray()){
            char_count[c-'a']++;
        }

        for(String word : words){
            int[] temp_charCount = Arrays.copyOf(char_count, char_count.length);
            int validCharCount = 0;
            for(char c: word.toCharArray()){
                if(temp_charCount[c-'a'] > 0){
                    validCharCount++;
                    temp_charCount[c-'a']--;
                }
            }
            if(validCharCount == word.length()){
                goodWordLength += word.length();
            }
        }

        return goodWordLength;
    }
}
