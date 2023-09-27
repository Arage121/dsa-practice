//https://leetcode.com/problems/decoded-string-at-index/
public class DecodedStringAtIndex {
    public String decodeAtIndex(String S, int K) {
        long size = 0;

        // Calculate the total size of the decoded string
        for (char c : S.toCharArray()) {
            if (Character.isDigit(c)) {
                size *= (c - '0');
            } else {
                size++;
            }
        }

        // Traverse the string in reverse order to find the character at the Kth index
        for (int i = S.length() - 1; i >= 0; i--) {
            char c = S.charAt(i);
            if (Character.isDigit(c)) {
                size /= (c - '0');
                K %= size;
            } else {
                if (K == 0 || K == size) {
                    return String.valueOf(c);
                }
                size--;
            }
        }

        return null; // This line should never be reached.
    }
}
