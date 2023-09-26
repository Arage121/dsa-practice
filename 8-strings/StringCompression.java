//https://leetcode.com/problems/string-compression/
public class StringCompression {
    public int compress(char[] chars) {
        int n = chars.length;
        int compressedIndex = 0; // Index to track the position of the compressed characters

        for (int i = 0; i < n; ) {
            char currentChar = chars[i];
            int count = 0;

            // Count consecutive occurrences of the current character
            while (i < n && chars[i] == currentChar) {
                i++;
                count++;
            }

            // Write the current character to the compressed array
            chars[compressedIndex++] = currentChar;

            // If the count is greater than 1, write the count as characters
            if (count > 1) {
                char[] countChars = Integer.toString(count).toCharArray();
                for (char c : countChars) {
                    chars[compressedIndex++] = c;
                }
            }
        }

        return compressedIndex;
    }
}
