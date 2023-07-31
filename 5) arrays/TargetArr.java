import java.util.*;
public class TargetArr {
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            list.add(index[i], nums[i]);
        }
        int[] arr = new int[list.size()];
        for(int i=0;i<n;i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}
