import java.util.*;
public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nextGreater = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        nextGreater.put(nums2[nums2.length-1], -1);
        stack.push(nums2[nums2.length-1]);
        for(int i=nums2.length-2;i>=0;i--){
            if(nums2[i] < stack.peek()){
                nextGreater.put(nums2[i], stack.peek());
                stack.push(nums2[i]);
                continue;
            }

            while(!stack.isEmpty() && stack.peek() < nums2[i]) stack.pop();

            if(stack.isEmpty()){
                stack.push(nums2[i]);
                nextGreater.put(nums2[i], -1);
            }else{
                nextGreater.put(nums2[i], stack.peek());
                stack.push(nums2[i]);
            }
        }

        for(int i=0;i<nums1.length;i++){
            nums1[i] = nextGreater.get(nums1[i]);
        }
        return nums1;
    }
}
