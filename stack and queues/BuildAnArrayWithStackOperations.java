import java.util.*;
public class BuildAnArrayWithStackOperations {
    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        int j = 0; // Index for the target array

        for (int i = 1; i <= n && j < target.length; i++) {
            if (i == target[j]) {
                result.add("Push");
                j++;
            } else {
                result.add("Push");
                result.add("Pop");
            }
        }
        return result;
    }

    // this is my approach, but it has very large time complexity that's why above one is improved
    public List<String> buildArrayStack(int[] target, int n) {
        List<String> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int n1 = target.length;

        for (int i = 1, j = 0; i <= n && j < n1; i++) {
            stack.push(i);
            list.add("Push");

            if (stack.peek() != target[j]) {
                stack.pop();
                list.add("Pop");
            } else {
                j++;
            }
        }

        return list;
    }
}
