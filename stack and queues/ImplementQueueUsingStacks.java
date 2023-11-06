import java.util.*;
public class ImplementQueueUsingStacks {
    class MyQueue {// insertion efficient approach i.e insertion is O(1) & deletion is O(n)
        Stack<Integer> s;
        Stack<Integer> st;
        public MyQueue() {
            s = new Stack<>();
            st = new Stack<>();
        }

        public void push(int x) {
            s.push(x);
        }

        public int pop() {
            while(!s.isEmpty()){
                st.push(s.pop());
            }
            int removed = st.pop();
            while(!st.isEmpty()){
                s.push(st.pop());
            }
            return removed;
        }

        public int peek() {
            while(!s.isEmpty()){
                st.push(s.pop());
            }
            int peeked = st.peek();
            while(!st.isEmpty()){
                s.push(st.pop());
            }
            return peeked;
        }

        public boolean empty() {
            return s.isEmpty();
        }
    }

    class MyQueueDE {// deletion efficient approach i.e deletion is O(1) & insertion is O(n)
        Stack<Integer> first;
        Stack<Integer> second;
        public MyQueueDE() {
            first = new Stack<>();
            second = new Stack<>();
        }

        public void push(int x) {
            while(!first.isEmpty()){
                second.push(first.pop());
            }
            first.push(x);
            while(!second.isEmpty()){
                first.push(second.pop());
            }
        }

        public int pop() {
            return first.pop();
        }

        public int peek() {
            return first.peek();
        }

        public boolean empty() {
            return first.isEmpty();
        }
    }
}
