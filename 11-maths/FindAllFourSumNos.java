import java.util.*;
public class FindAllFourSumNos {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) { //debug for better understanding
        int n = arr.length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        Arrays.sort(arr);

        for (int i = 0; i < n - 3; i++) {
            // Skip duplicates in the first element.
            if (i > 0 && arr[i] == arr[i - 1])
                continue;

            for (int j = i + 1; j < n - 2; j++) {
                // Skip duplicates in the second element.
                if (j > i + 1 && arr[j] == arr[j - 1])
                    continue;

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    int sum = arr[i] + arr[j] + arr[left] + arr[right];
                    if (sum == k) {
                        ArrayList<Integer> quad = new ArrayList<>();
                        quad.add(arr[i]);
                        quad.add(arr[j]);
                        quad.add(arr[left]);
                        quad.add(arr[right]);
                        ans.add(quad);

                        // Move the pointers and skip duplicates.
                        left++;
                        right--;

                        while (left < right && arr[left] == arr[left - 1]) left++;
                        while (left < right && arr[right] == arr[right + 1]) right--;
                    } else if (sum < k) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return ans;
    }
}
