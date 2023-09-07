//https://www.codechef.com/SEP23D/problems/GCDISCOUNT
import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
class GcdDiscount
{
	public static void main (String[] args) throws java.lang.Exception{ // understand this one properly
	 Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            solve(scanner);
        }
        scanner.close();
    }

    public static void solve(Scanner scanner) {
        int totalElement = scanner.nextInt();
        int[] item = new int[totalElement];
        for (int i = 0; i < totalElement; i++) {
            item[i] = scanner.nextInt();
        }
        int[] item2 = new int[totalElement];
        for (int i = 0; i < totalElement; i++) {
            item2[i] = scanner.nextInt();
        }

        int[] leftToRight = new int[totalElement];
        int cd = item[0];
        for (int i = 0; i < totalElement; i++) {
            cd = gcd(cd, item[i]);
            leftToRight[i] = cd;
        }

        int[] rightToLeft = new int[totalElement];
        cd = item[totalElement - 1];
        for (int i = totalElement - 1; i >= 0; i--) {
            cd = gcd(cd, item[i]);
            rightToLeft[i] = cd;
        }

        int ans = leftToRight[totalElement - 1];

        for (int i = 0; i < totalElement; i++) {
            int lg = 0;
            if (i > 0) {
                lg = leftToRight[i - 1];
            }

            int rg = 0;
            if (i < totalElement - 1) {
                rg = rightToLeft[i + 1];
            }

            int gc = gcd(lg, rg);
            ans = Math.max(ans, gcd(gc, item2[i]));
        }

        System.out.println(ans);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
