//https://leetcode.com/problems/number-of-ways-to-stay-in-the-same-place-after-some-steps/
public class NoOfWaysToStayInSamePlaceAfterSomeSteps { // used memoization and recursion approach here, understand properly
    public static void main(String[] args) {
        System.out.println(numWays(3, 2));
    }
    public static int numWays(int steps, int arrLen) {
        int MOD = 1000000007;
        int maxPosition = Math.min(arrLen - 1, steps);
        Integer[][] memo = new Integer[steps + 1][maxPosition + 1];

        return countWays(steps, 0, maxPosition, memo, MOD);
    }

    private static int countWays(int steps, int position, int maxPosition, Integer[][] memo, int MOD) {
        if (steps == 0) {
            return (position == 0) ? 1 : 0; // Reached the end successfully
        }

        if (memo[steps][position] != null) {
            return memo[steps][position];
        }

        int ways = countWays(steps - 1, position, maxPosition, memo, MOD);

        if (position > 0) {
            ways = (ways + countWays(steps - 1, position - 1, maxPosition, memo, MOD)) % MOD;
        }

        if (position < maxPosition) {
            ways = (ways + countWays(steps - 1, position + 1, maxPosition, memo, MOD)) % MOD;
        }

        memo[steps][position] = ways;
        return ways;
    }
}
