//https://www.geeksforgeeks.org/problems/better-string/1
import java.util.*;
public class BetterString {
    public static String betterString(String str1, String str2) {//understand this carefully
        // Calculate the number of distinct subsequences for each string
        int distinctSubsequences1 = countDistinctSubsequences(str1);
        int distinctSubsequences2 = countDistinctSubsequences(str2);

        // Compare and return the better string
        return (distinctSubsequences1 >= distinctSubsequences2) ? str1 : str2;
    }

    static int countDistinctSubsequences(String str) {
        int n = str.length();
        int[] lastOccurrence = new int[256];
        Arrays.fill(lastOccurrence, -1);
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            dp[i] = 2 * dp[i - 1];

            // If character has occurred before, subtract the count of subsequences
            if (lastOccurrence[str.charAt(i - 1)] != -1) {
                dp[i] -= dp[lastOccurrence[str.charAt(i - 1)]];
            }

            lastOccurrence[str.charAt(i - 1)] = i - 1;
        }

        return dp[n] - 1;
    }
}
