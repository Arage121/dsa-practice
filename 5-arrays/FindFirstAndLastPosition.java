import java.util.Arrays;
public class FindFirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }
    public static int[] searchRange(int[] nums, int target) { //understand this one properly
        int[] result = {-1, -1};
        if (nums.length == 0) {
            return result;
        }

        // First, find the leftmost occurrence of the target.
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        if (nums[left] != target) {
            return result; // Target not found.
        }

        result[0] = left;

        // Now, find the rightmost occurrence of the target.
        right = nums.length - 1;

        while (left < right) {
            // We use left = mid + 1 to avoid an infinite loop.
            int mid = left + (right - left + 1) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }

        result[1] = left;

        return result;
    }
}
