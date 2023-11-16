//https://leetcode.com/problems/find-unique-binary-string/
import java.util.*;
public class FindUniqueBinaryString {
    public static void main(String[] args) {
        String[] arr = { "00", "01" };
        System.out.println(findDifferentBinaryString(arr));
    }
    public static String findDifferentBinaryString(String[] nums) {
        int n = nums.length;

        // Create a set to store the binary strings from nums
        Set<String> set = new HashSet<>();
        for (String num : nums) {
            set.add(num);
        }

        // Iterate through all possible binary strings of length n
        for (int i = 0; i < (1 << n); i++) {
            // Convert the integer to a binary string of length n
            String binaryString = Integer.toBinaryString(i);
            while (binaryString.length() < n) {
                binaryString = "0" + binaryString;
            }

            // Check if the binary string is not in the set
            if (!set.contains(binaryString)) {
                return binaryString;
            }
        }

        // This line should never be reached as there is always a missing binary string
        return "";
    }
}
