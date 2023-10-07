import java.util.Arrays;
public class FindThreeLargestNos {
    public static void main(String[] args) {
        int[] arr = {-1, -2, -3, -7, -17, -27, -18, -541, -8, -7, 7};
        System.out.println(Arrays.toString(findThreeLargestNumbers(arr)));
    }
    public static int[] findThreeLargestNumbers(int[] array) { // understand the logic
        int[] ans = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};

        for (int num : array) {
            if (num > ans[2]) {
                ans[0] = ans[1];
                ans[1] = ans[2];
                ans[2] = num;
            } else if (num > ans[1]) {
                ans[0] = ans[1];
                ans[1] = num;
            } else if (num > ans[0]) {
                ans[0] = num;
            }
        }

        return ans;
    }
}
