//https://leetcode.com/problems/remove-duplicate-letters/
public class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) { //marked
        int[] freq = new int[26];
        boolean[] inStack = new boolean[26];
        StringBuilder stack = new StringBuilder();

        // Count the frequency of each character in the input string s
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (char c : s.toCharArray()) {
            freq[c - 'a']--; // Decrement the frequency of the character c

            // Skip characters that are already in the result stack
            if (inStack[c - 'a']) {
                continue;
            }

            // Remove characters from the end of the stack while they are greater
            // than the current character and still have occurrences left in the string
            while (stack.length() > 0 && c < stack.charAt(stack.length() - 1) && freq[stack.charAt(stack.length() - 1) - 'a'] > 0) {
                inStack[stack.charAt(stack.length() - 1) - 'a'] = false;
                stack.deleteCharAt(stack.length() - 1);
            }

            // Append the current character to the stack and mark it as inStack
            stack.append(c);
            inStack[c - 'a'] = true;
        }

        return stack.toString();
    }
}
