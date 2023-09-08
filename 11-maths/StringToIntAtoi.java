//https://leetcode.com/problems/string-to-integer-atoi/
public class StringToIntAtoi {
        public int myAtoi(String s) {
            if (s == null || s.length() == 0)
                return 0;

            int index = 0;
            int sign = 1;
            int result = 0;
            int maxDiv10 = Integer.MAX_VALUE / 10;

            // Remove leading whitespace
            while (index < s.length() && s.charAt(index) == ' ')
                index++;

            // Check for optional sign
            if (index < s.length() && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
                sign = (s.charAt(index) == '-') ? -1 : 1;
                index++;
            }

            // Parse digits
            while (index < s.length() && Character.isDigit(s.charAt(index))) {
                int digit = s.charAt(index) - '0';

                // Check for integer overflow
                if (result > maxDiv10 || (result == maxDiv10 && digit > 7)) {
                    return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }

                result = result * 10 + digit;
                index++;
            }

            return result * sign;
        }
}
