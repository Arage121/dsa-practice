//https://leetcode.com/problems/swap-adjacent-in-lr-string/
public class SwapAdjacentInLRstring {
        public boolean canTransform(String start, String end) {
            int L1 = 0, L2 = 0, R1 = 0, R2 = 0;
            for (int i = 0; i < start.length(); i++) {
                char c1 = start.charAt(i), c2 = end.charAt(i);

                if (c1 == 'R') {
                    // if we encounter a R in first string, the number of L on its left is fixed, not more L can added to its left.
                    if (L1 != L2) return false;
                    R1++;
                }else if (c1 == 'L') {
                    // if we encounter a L in first string, the number of R on its left is fixed, it can't decrease.
                    if (R1 != R2) return false;
                    L1++;
                }
                if (c2 == 'L') {
                    L2++;
                } else if (c2 == 'R') {
                    R2++;
                }

                // L can't move right and R can't move left
                if (L2 < L1 || R2 > R1) {
                    return false;
                }
            }

            // for case like "XXXX" "LXXX"
            return L1 == L2 && R1 == R2;
        }
}
