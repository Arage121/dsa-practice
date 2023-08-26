//https://leetcode.com/problems/letter-combinations-of-a-phone-number/
import java.util.*;
public class LetterCombinationsOfAPhone {
    public List<String> letterCombinations(String D) {
        ArrayList<String> ans = new ArrayList<>();
        char[][] c = {
                {}, {}, {'a','b','c'}, {'d','e','f'}, {'g','h','i'},
                {'j','k','l'}, {'m','n','o'}, {'p','q','r','s'}, {'t','u','v'}, {'w','x','y','z'}
        };

        if (D.isEmpty()) {
            return ans;
        }

        int[] arr = new int[D.length()];
        for (int i = 0; i < D.length(); i++) {
            arr[i] = D.charAt(i) - '0';
        }

        multiplyChar(ans, c, arr, "", 0);

        return ans;
    }

    private void multiplyChar(List<String> ans, char[][] c, int[] arr, String current, int index) {
        if (index == arr.length) {
            ans.add(current);
            return;
        }

        char[] chars = c[arr[index]];
        for (char ch : chars) {
            multiplyChar(ans, c, arr, current + ch, index + 1);
        }
    }
}
