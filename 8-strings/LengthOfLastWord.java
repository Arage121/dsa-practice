//https://leetcode.com/problems/length-of-last-word/
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int lastIndex = s.length() - 1;

        // Skip any trailing spaces
        while (lastIndex >= 0 && s.charAt(lastIndex) == ' ') {
            lastIndex--;
        }

        // Calculate the length of the last word
        while (lastIndex >= 0 && s.charAt(lastIndex) != ' ') {
            length++;
            lastIndex--;
        }

        return length;
    }
}
