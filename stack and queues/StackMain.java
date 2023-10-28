public class StackMain {
    public static void main(String[] args) throws StackException, Exception{
//        CustomStack stack = new DynamicStack(3); //use dynamicstack only not customstack(dynamicstack is a proper stack data structure)
//        stack.push(10);
//        stack.push(20);
//        stack.push(10);
//        stack.push(10);
//        stack.pop();
//        System.out.println(stack.pop());
//        System.out.println(stack.peek()); // it gives the toppest element in stack
        CustomStackUsingLinkedList sl = new CustomStackUsingLinkedList();
        sl.push(10);
        sl.push(400);
        System.out.println(sl.peek());
        sl.display();
        System.out.println(sl.pop());
        sl.display();
    }
}
