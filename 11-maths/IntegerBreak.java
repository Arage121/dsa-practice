//https://leetcode.com/problems/integer-break/
public class IntegerBreak {
    public int integerBreak(int n) { // understand the logic
        if (n <= 2) {
            return 1;
        } else if (n == 3) {
            return 2;
        } else if (n == 4) {
            return 4;
        }

        int product = 1;
        while (n > 4) {
            product *= 3;
            n -= 3;
        }
        product *= n;

        return product;
    }
}
