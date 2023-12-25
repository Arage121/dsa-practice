//https://leetcode.com/problems/count-primes/
public class CountPrimes {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        boolean composites[] = new boolean[n];
        int count = n / 2; // Assume half of the numbers are even and not prime
        int limit = (int) Math.sqrt(n);

        for (int i = 3; i <= limit; i += 2) {
            if (!composites[i]) {
                for (int j = i * i; j < n; j += i * 2) {
                    if (!composites[j]) {
                        composites[j] = true;
                        count--;
                    }
                }
            }
        }

        return count;
    }
}
