//https://practice.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1
import java.util.*;
public class ReverseTheFirstKElementsOfQueue {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<k;i++){
            stack.push(q.poll());
        }

        while(!stack.isEmpty()){
            q.offer(stack.pop());
        }

        for(int i=0;i<q.size()-k;i++){
            q.offer(q.poll());
        }
        return q;
    }
}
