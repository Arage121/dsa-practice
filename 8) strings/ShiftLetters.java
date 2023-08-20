//https://leetcode.com/problems/shifting-letters/submissions
public class ShiftLetters {
        public String shiftingLetters(String s, int[] shifts) {
            int i = s.length() -1;

            // Converting String to characther array
            char[] ch = s.toCharArray();

            int totalshifts = 0;

            while(i>=0){
                totalshifts += shifts[i]%26;

                // Shifiting letters in character array in such a way so that it doesn't exceeds a-z range

                // First converting character at i to integer and adding total shifts

                // Then Neutralize its range in a-z by moduling it by 26

                // Now add 'a' to again convert it into a-z range as we are shifiting letters taking a as 0
                ch[i] = (char)((ch[i] - 'a' + totalshifts)%26 + 'a');

                // decrement i
                i--;
            }

            // Convert character array to string and return it
            return String.valueOf(ch);
        }
}
